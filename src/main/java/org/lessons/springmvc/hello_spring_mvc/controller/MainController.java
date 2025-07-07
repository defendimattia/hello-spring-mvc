package org.lessons.springmvc.hello_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/products")
    public String allProducts() {
        return "allProducts";
    }

    @GetMapping("/products/{productID}")
    public String singleProducts(@PathVariable(name = "productID") String productID, Model model) {
        model.addAttribute("productID", productID);
        return "singleProduct";
    }

    @GetMapping("/search")
    public String search(@RequestParam(name = "keyword") String keyword, Model model) {
        model.addAttribute("keyword", keyword);
        return "search";
    }
}
