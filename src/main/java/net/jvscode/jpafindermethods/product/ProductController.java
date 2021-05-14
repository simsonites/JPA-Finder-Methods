package net.jvscode.jpafindermethods.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getByNameAndPrice")
     public List<Product> getByNameAndPrice(String name, double price){
        return productService.getByNameAndPrice(name, price);
     }

    @GetMapping("/getByDescription")
    public List<Product> getByDescription(String description){
        return productService.getByDescription(description);
    }

    @GetMapping("/getByPriceRange")
    public List<Product> getByPriceRange(double price1, double price2){
        return productService.getByPriceRange(price1, price2);
    }



}
