package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import springmvc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springmvc.model.User;
import springmvc.service.ProductService;
import springmvc.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;
    

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
    public  ModelAndView saveNoteOld(@RequestParam("id") Integer id,
                                     @RequestParam("name") String name,
                                     @RequestParam("product") String selectedProduct,
                                     @RequestParam("detail") String detail){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("got here");
        modelAndView.addObject("status", "succesfully got the form data?");
        if(userService.isNewUserService(id)){
            User user = userService.getUserService(id);
            Product product = new Product(selectedProduct,detail,user);
            List<Product> list = user.getProducts();
            list.add(product);
            user.setProducts(list);
            userService.updateUserService(user);

//            productService.saveProduct(product);
        }
        else{
            List<Product> productList = new ArrayList<>();

            User user = new User((int) id,name, productList);

            Product product = new Product(selectedProduct,detail,user);
            productList.add(product);
            user.setProducts(productList);

           userService.saveUserService(user);
//            productService.saveProduct(product);


        }


        modelAndView.setViewName("form");


        System.out.println("I am here");
        return modelAndView;

    }

//    @RequestMapping(path = "/savenote" , method = RequestMethod.POST , consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
//    public  ModelAndView saveNoteNewWay(@ModelAttribute Product product,@ModelAttribute User user, Model model){
//        // field name of the ModelAttribute and
//        ModelAndView modelAndView = new ModelAndView();
//
//        modelAndView.addObject("status", "succesfully got the form data?");
//        if(userService.isNewUser(user.getId())){
//           product.setUser(user);
//            List<Product> list = user.getProducts();
//            list.add(product);
//            user.setProducts(list);
//            userService.updateUser(user);
//
////            productService.saveProduct(product);
//        }
//        else{
//
//            List<Product> productList = user.getProducts();
//            productList.add(product);
//            product.setUser(user);
//
//            user.setProducts(productList);
//
//            userService.saveUser(user);
////            productService.saveProduct(product);
//
//
//        }
//
//
//        modelAndView.setViewName("form");
//
//
//        System.out.println("I am here");
//        return modelAndView;
//    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
