package com.testsb.services;

import com.testsb.models.ProductInCart;

import java.util.List;

public interface ProductInCartService {
    public List<ProductInCart> showAll();
    public ProductInCart saveProduct (ProductInCart productInCart);
}
