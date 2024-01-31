package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    int count = 0 ;
    static int countStatic = 0;
    @RequestMapping("/")
    public String home(Model model){
        String name = "spring mvc configuration!! ";
        model.addAttribute("name", name);

        System.out.println("this is home and the time is "+ LocalDateTime.now());
        System.out.println(count);

        model.addAttribute("count", count++);
        model.addAttribute("CountStatic",countStatic);

        return "form";
    }
    @RequestMapping("/form")
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
