package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student huunien = new Student(
                    1L,
                    "HyuNie",
                    "huunien734@gmail.com",
                    LocalDate.of(2004, MARCH,7)
            );
            Student hyunie = new Student(
                    2L,
                    "HuuNien",
                    "hyunie734@gmail.com",
                    LocalDate.of(2003, MARCH,3)
            );
            repository.saveAll(
                    List.of(huunien,hyunie)
            );
        };
    }
}
