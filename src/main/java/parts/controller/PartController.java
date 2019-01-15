package parts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import parts.model.Part;
import parts.service.PartServiceInterface;

@Controller
public class PartController {
    private PartServiceInterface partService;
    @Autowired(required = true)
    @Qualifier(value = "partService")
    public void setPartService(PartServiceInterface partService) {
        this.partService = partService;
    }

    @RequestMapping(value = "parts", method = RequestMethod.GET)
    public String listParts(Model model){
        model.addAttribute("part", new Part());
        model.addAttribute("listParts", partService.listParts());
        return "parts";
    }

    @RequestMapping(value = "parts/add",method = RequestMethod.POST)
    public String addPart(@ModelAttribute("part") Part part){
        if(part.getId() == 0) partService.addPart(part);
        else partService.updatePart(part);
        return "redirect:/parts";
    }
    @RequestMapping("/remove/{id}")
        public String removePart(@PathVariable("id") int id){
        partService.removePart(id);
        return "redirect:/parts";
    }
    @RequestMapping("/edit/{id}")
    public String editPart(@PathVariable("id") int id, Model model){
        model.addAttribute("part", partService.getPartbyId(id));
        model.addAttribute("listParts", partService.listParts());
        return "parts";
    }
}
