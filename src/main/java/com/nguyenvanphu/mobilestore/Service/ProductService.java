package com.nguyenvanphu.mobilestore.Service;

import com.nguyenvanphu.mobilestore.Model.Product;
import com.nguyenvanphu.mobilestore.Repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> listAll(){
        return (List<Product>) repo.findAll();
    }

    public Optional<Product> findById(int id){
        return repo.findById(id);
    }

    public Product findProduct(int id){
        return repo.findProduct(id);
    }

}
