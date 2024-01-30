package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import springmvc.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springmvc.service.NoteService;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;

    @RequestMapping(path = "/savenoteolderway" , method = RequestMethod.POST)
    public  ModelAndView saveNoteOldWay(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        String title = (String) request.getParameter("tittle");

        System.out.println(title);
        modelAndView.addObject("tittle" , title);
        modelAndView.setViewName("form");

        return modelAndView;

    }


    @RequestMapping(path = "/savenoteoldway" , method = RequestMethod.POST)
    public  ModelAndView saveNoteOld(@RequestParam("tittle") String tittle,@RequestParam("content") String content ){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("tittle", tittle);
        modelAndView.addObject("content", content);
        modelAndView.setViewName("form");
        Note note = new Note(tittle,content);
        this.noteService.createNote(note);
        System.out.println(tittle+": its the tittle");
        return modelAndView;

    }

    @RequestMapping(path = "/savenote" , method = RequestMethod.POST , consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public  ModelAndView saveNoteNewWay(@ModelAttribute Note note, Model model){
        // field name of the ModelAttribute and
        System.out.println(" i am here with "+ note );
        this.noteService.createNote(note);
        System.out.println("note created?");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("note",note);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    public void setNoteService(NoteService noteService) {
        this.noteService = noteService;
    }
}
