package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import springmvc.model.Product;
import springmvc.model.User;
import springmvc.service.UserService;

import javax.servlet.http.HttpServletRequest;
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("user") User user ){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("");
        userService.saveUserService(user);
        System.out.println(user);
        return modelAndView;


    }
}
