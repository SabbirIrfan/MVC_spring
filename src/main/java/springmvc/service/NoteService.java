package springmvc.service;

import springmvc.Dao.NoteDao;
import springmvc.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {
    @Autowired
    private NoteDao noteDao;

    public int createNote(Note note){
        return this.noteDao.saveNote(note);
    }
}
