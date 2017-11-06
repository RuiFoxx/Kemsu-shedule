package com.testsb.services;

import com.testsb.models.Product;

import java.util.List;

public interface ProductService {
    public Product getById(Integer id);
    public List<Product> showAll();
}
