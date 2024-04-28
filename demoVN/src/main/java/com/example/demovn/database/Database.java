package com.example.demovn.database;

import com.example.demovn.models.Product;
import com.example.demovn.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Database {
    private static final Logger log = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product("iphone",2020,2400.0,"");
                Product productB = new Product("ipad",2021,2200.0,"" );
                log.info("insert data: "+productRepository.save(productA));
                log.info("insert data: "+productRepository.save(productB));
            }
        };
    }
}
