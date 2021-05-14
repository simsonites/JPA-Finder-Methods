package net.jvscode.jpafindermethods.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    private String category;
    private String description;
    private double price;

    public Product(String name, String category,
                   String description, double price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
    }
}
