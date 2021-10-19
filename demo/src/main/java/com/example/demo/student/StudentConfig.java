package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 1)
            );

            Student juan = new Student(
                    "Juan",
                    "juan@gmail.com",
                    LocalDate.of(2005, Month.APRIL, 5)
            );

            repository.saveAll(List.of(mariam, juan));
        };
    }
}
