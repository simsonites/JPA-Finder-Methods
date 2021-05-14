package net.jvscode.jpafindermethods.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return  productRepository.findAll();
    }

    public List<Product> getByNameAndPrice(String name, double price) {
        return  productRepository.findByNameAndPrice(name, price);
    }

    public List<Product> getByDescription(String description) {
        return productRepository.findByDescription(description);
    }

    public List<Product> getByPriceRange(double price1, double price2) {
        return productRepository.getByPriceIsBetween(price1, price2);
    }
}
