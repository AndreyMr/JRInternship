package parts.dao;

import parts.model.Part;

import java.util.List;

public interface PartDaoInterface {
    void addPart(Part part);

    void updatePart(Part part);

    void removePart(int id);

    Part getPartbyId(int id);

    List<Part> listParts();

}
