package net.jvscode.jpafindermethods.data;


import net.jvscode.jpafindermethods.product.Product;
import net.jvscode.jpafindermethods.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class SeedData {

   private final   ProductRepository productRepository;

    public SeedData(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private final List<Product> seedProducts = Arrays.asList(
            new Product("Moano Microphone", "Recording",
                    "Moano live streaming microphone", 200),

            new Product("Sony Microphone", "Recording",
                    "Sony Karaoke and  live streaming microphone", 250),
            new Product("Samsung Galaxy s7", "Phone",
                    "Samsung Galaxy S series", 250 ),

            new Product("Moano Microphone", "Recording",
                    "Live streaming microphone", 100 ),

            new Product("Moano Microphone", "Recording",
                    "Live streaming microphone for youtube", 600 ),

            new Product("Laptop", "Computer",
                    "Dell Workstation computer 1TB 32GB", 1500 ),

            new Product("Laptop", "Computer",
                    "Dell Workstation computer 1TB 16GB", 1000 ),

            new Product("Laptop", "Computer",
                    "Hp Workstation computer 1TB to 2TB 32GB", 1300 ),

            new Product("Laptop", "Computer",
                    "Acer Workstation computer 1TB 16GB", 1100 ),

            new Product("Sony Microphone", "Recording",
                    "Live recording mic Takstar", 600 ),

            new Product("Sony Microphone", "Recording",
                    "Karaoke microphone for livestreaming ", 150 ),

            new Product("Samsung Microphone", "Recording",
                    "Live recording and streaming microphone", 100 )
    );

    //@PostConstruct
    public void insertData(){
        productRepository.saveAll(seedProducts);
    }
}
