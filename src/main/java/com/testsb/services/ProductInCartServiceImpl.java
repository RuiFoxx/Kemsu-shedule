package com.testsb.services;

import com.testsb.models.ProductInCart;
import com.testsb.repositories.ProductInCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductInCartServiceImpl implements ProductInCartService{

    private ProductInCartRepository productInCartRepository;

    @Autowired
    public ProductInCartServiceImpl(ProductInCartRepository productInCartRepository) {
        this.productInCartRepository = productInCartRepository;
    }

    @Override
    public List<ProductInCart> showAll() {
        List<ProductInCart> productInCartList = new ArrayList<>();
        productInCartRepository.findAll().forEach(productInCartList::add);
        return productInCartList;
    }

    @Override
    public ProductInCart saveProduct(ProductInCart productInCart){
        productInCartRepository.save(productInCart);
        return productInCart;
    }
}
