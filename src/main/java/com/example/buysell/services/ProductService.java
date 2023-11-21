package com.example.buysell.services;

import com.example.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private static Long ID;
    {
        products.add(new Product(++ID,"PlayStation 4", "Just a description",
                5000000, "Tashkent", "Sanjar"));

        products.add(new Product(++ID,"Dyson", "Just a description",
                10000000, "Samarkand", "Aziz"));
    }

    public List<Product> listProducts() {
        return products;
    }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}
