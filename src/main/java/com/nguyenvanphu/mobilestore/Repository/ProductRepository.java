package com.nguyenvanphu.mobilestore.Repository;

import com.nguyenvanphu.mobilestore.Model.Product;
import com.nguyenvanphu.mobilestore.Model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    @Query("SELECT u FROM Product u WHERE u.ItemCode = :ItemCode")
    public Product findProduct(@Param("ItemCode") int ItemCode);
}
