package com.nguyenvanphu.mobilestore;

import com.nguyenvanphu.mobilestore.Model.Product;
import com.nguyenvanphu.mobilestore.Repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ProductTest {
    @Autowired private ProductRepository repo;

    @Test
    public void testAddNew(){

        Product product = new Product();
        product.setAvaibleUnits("200");
        product.setCategory("Phone");
        product.setCost("1000");
        product.setDetail("Smartphone iPhone 12 256 GB được Apple cho ra mắt đã đem đến làn sóng mạnh mẽ đối với những ai yêu công nghệ nói chung và “fan hâm mộ” trung thành của điện thoại iPhone nói riêng, với con chip mạnh, dung lượng lưu trữ lớn cùng thiết kế toàn diện và khả năng hiển thị hình ảnh xuất sắc.");
        product.setName("iPhone 12 256GB");
        product.setManufacturer("Apple");
        Product savedProduct = repo.save(product);
        repo.save(product);
//        Assertions.assertThat(savedProduct).isNotNull();
//        Assertions.assertThat(savedProduct.getItemCode()).isGreaterThan(0);
    }
}

