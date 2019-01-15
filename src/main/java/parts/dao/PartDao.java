package parts.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import parts.model.Part;

import java.util.List;
@Repository
public class PartDao implements PartDaoInterface{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addPart(Part part) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(part);
    }

    public void updatePart(Part part) {
        Session session = sessionFactory.getCurrentSession();
        session.update(part);
    }

    public void removePart(int id) {
        Session session = sessionFactory.getCurrentSession();
        Part part = (Part) session.load(Part.class, id);

        if (part != null) session.delete(part);
    }

    public Part getPartbyId(int id) {
        Session session = sessionFactory.getCurrentSession();
        Part part = (Part) session.load(Part.class, id);
        return part;
    }
    @SuppressWarnings("unchecked")
    public List<Part> listParts() {
        Session session = sessionFactory.getCurrentSession();
        List<Part> partList = session.createQuery("from Part").list();
        return partList;
    }
}
