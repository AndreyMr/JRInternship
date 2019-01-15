package parts.service;

import parts.model.Part;

import java.util.List;

public interface PartServiceInterface {
    void addPart(Part part);

    void updatePart(Part part);

    void removePart(int id);

    Part getPartbyId(int id);

    List<Part> listParts();
}
