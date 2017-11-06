package com.testsb.controllers;

import com.testsb.services.ProductInCartService;
import com.testsb.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    private ProductService productService;
    private ProductInCartService productInCartService;

    @Autowired
    public void setProductInCartService(ProductInCartService productInCartService) {
        this.productInCartService = productInCartService;
    }

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String showMainPage(Model model) {
        model.addAttribute("products", productService.showAll());
        model.addAttribute("productsincart", productInCartService.showAll());
        return "productsPage";
    }
}
