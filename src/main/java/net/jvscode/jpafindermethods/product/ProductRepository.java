package net.jvscode.jpafindermethods.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameAndPrice(String name, double price);

    @Query("From Product p where p.description Like %:description%")
    List<Product> findByDescription(String description);

    List<Product> getByPriceIsBetween(double price1, double price2);
}
