package springmvc.Dao;

import org.springframework.transaction.annotation.Transactional;
import springmvc.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NoteDao {
    private HibernateTemplate hibernateTemplate;

    public NoteDao() {
    }



    @Autowired
    public NoteDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional

    public int saveNote(Note note){
        int id = (Integer) this.hibernateTemplate.save(note);

        return id;

    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
