package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model){
        String name = "sabbir irfan chowdhury";
        model.addAttribute("name", name);

        System.out.println("this is home");
        return "index";
    }

    @RequestMapping("form")
    public ModelAndView modelAndView(){
        System.out.println("from model view");

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("name", "sabbir");
        List<Integer> marks = new ArrayList<>();

        marks.add(1);
        marks.add(2);
        marks.add(3);
        modelAndView.addObject("marks",marks);
        modelAndView.setViewName("form");
        return modelAndView;
    }
}
