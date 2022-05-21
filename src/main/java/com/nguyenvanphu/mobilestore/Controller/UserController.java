package com.nguyenvanphu.mobilestore.Controller;

import com.nguyenvanphu.mobilestore.Model.Product;
import com.nguyenvanphu.mobilestore.Service.ProductService;
import com.nguyenvanphu.mobilestore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService service;
    @Autowired
    private ProductService servicePro;

    @PostMapping("checkLogin")
    public String checkLogin(@RequestParam("email")String email, @RequestParam("password")String password
    , HttpSession session){
        if(service.checkLogin(email, password)){
            List<Product> cart = new ArrayList<>();
            session.setAttribute("USERNAME",email);
            session.setAttribute("CART",cart);
            System.out.println("Login thanh cong");
            return "redirect:/Home";
        }else System.out.println("Login that bai");
        return "Login";
    }


    @GetMapping("/Home")
    public String showProductList(Model model){
        System.out.println("load list");
        List<Product> listProduct = servicePro.listAll();
        model.addAttribute("listProduct",listProduct);
        return "Home";
    }

    @GetMapping("logout")
    public String logout(Model model){
        return "Login";
    }


}
