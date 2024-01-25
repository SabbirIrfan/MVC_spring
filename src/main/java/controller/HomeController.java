package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model){
        String name = "sabbir irfan chowdhury";
        model.addAttribute("name", name);

        System.out.println("this is home");
        return "index";
    }
}
