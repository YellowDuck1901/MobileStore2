package com.nguyenvanphu.mobilestore;

import com.nguyenvanphu.mobilestore.Model.Product;
import com.nguyenvanphu.mobilestore.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
public class MobileStoreApplication {

	public static void main(String[] args) {

		SpringApplication.run(MobileStoreApplication.class, args);
	}

}
