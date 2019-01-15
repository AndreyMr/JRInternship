package parts.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import parts.dao.PartDaoInterface;
import parts.model.Part;

import java.util.List;
@Service
public class PartService implements PartServiceInterface {
    private PartDaoInterface partDao;

    public void setPartDao(PartDaoInterface partDao) {
        this.partDao = partDao;
    }

    @Transactional


    public void addPart(Part part) {
        partDao.addPart(part);
    }
    @Transactional
    public void updatePart(Part part) {
        partDao.updatePart(part);
    }
    @Transactional
    public void removePart(int id) {
        partDao.removePart(id);
    }
    @Transactional
    public Part getPartbyId(int id) {
        return partDao.getPartbyId(id);
    }
    @Transactional
    public List<Part> listParts() {
        return partDao.listParts();
    }
}
