package com.nguyenvanphu.mobilestore.Controller;

import com.nguyenvanphu.mobilestore.Model.Product;
import com.nguyenvanphu.mobilestore.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

//    @RequestMapping("/cart/{id}")
//    public String sqrt(@PathVariable(value="id") int id){
//        System.out.println("ID" + id);
//        return "Home";
//    }

    @GetMapping("/cart/{id}")
    public String addCart(@PathVariable("id") int id,Model model, HttpSession session){
        List<Product> cart = (List<Product>) session.getAttribute("CART");
        Product product = service.findProduct(id);
        if(product.getName()!=null){
            cart.add(product);
            System.out.println("size cart: "+cart.size());
            System.out.println("ID: ");
            session.setAttribute("CART",cart);
        }
        List<Product> listProduct = service.listAll();
        model.addAttribute("listProduct",listProduct);
        return "Home";
    }

    @GetMapping("/Cart")
    public String showProductList(Model model, HttpSession session){
        System.out.println("load cart");
//        List<Product> listProduct = service.listAll();
        List<Product> cart = (List<Product>) session.getAttribute("CART");
        model.addAttribute("cart",cart);
        return "Cart";
    }

    @GetMapping("/Delete/{id}")
    public String deleteProductCart(@PathVariable("id") int id,Model model, HttpSession session){
        List<Product> cart = (List<Product>) session.getAttribute("CART");
        for (Product product: cart
             ) {
            if(product.getItemCode()==id){
                cart.remove(product);
                model.addAttribute("cart",cart);
                break;
            }
        }
        return "Cart";
    }

//    @RequestMapping("/cart")
//    public String addProductToCart(){
////        if(service.checkLogin(email, password)){
////            List<Product> cart = new ArrayList<>();
////            session.setAttribute("USERNAME",email);
////            session.setAttribute("CART",cart);
////            System.out.println("Login thanh cong");
////            return "redirect:/Home";
////        }else System.out.println("Login that bai");
////        return "Login";
//        System.out.println("id: ");
//        return "Home";
//    }


}
