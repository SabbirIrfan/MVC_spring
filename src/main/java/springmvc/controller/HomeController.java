package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import springmvc.model.Product;
import springmvc.service.ProductService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    int count = 0 ;
    static int countStatic = 0;
    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String home(Model model){
        String name = "spring mvc configuration!! ";
        model.addAttribute("name", name);

        System.out.println("this is home and the time is "+ LocalDateTime.now());
        System.out.println(count);

        model.addAttribute("count", count++);
        model.addAttribute("CountStatic",countStatic);

        return "productForm";
    }
    @RequestMapping("/buyproduct")
    public ModelAndView modelAndView(){
         System.out.println("from model view");

        ModelAndView modelAndView = new ModelAndView();

        List<Product> productList = productService.getAllProduct();
//        for(Product p: productList){
//            if(p.isSold()){
//                productList.remove(p);
//                System.out.println(p.getBrandName());
//
//            }
//        }
        modelAndView.addObject("availableProductList", productList);
        modelAndView.setViewName("form");
        return modelAndView;
    }

    @RequestMapping(value = "/userForm", method = RequestMethod.GET)
    public ModelAndView userForm(Model model){
        ModelAndView modelAndView = new ModelAndView("userForm");
        return modelAndView;

    }
    @RequestMapping(value = "/productForm", method = RequestMethod.GET)
    public ModelAndView productForm(Model model){
        ModelAndView modelAndView = new ModelAndView("productForm");
        return modelAndView;

    }
}
