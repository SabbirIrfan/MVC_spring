package springmvc.service;

import springmvc.Dao.NoteDao;
import springmvc.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {
    private NoteDao noteDao;

    public NoteDao getNoteDao() {
        return noteDao;
    }
    @Autowired

    public void setNoteDao(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    public int createNote(Note note){
        return this.noteDao.saveNote(note);
    }
}
