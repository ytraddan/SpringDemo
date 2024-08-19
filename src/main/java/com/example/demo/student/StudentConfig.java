package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.*;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student yatoro = new Student(
                "Raddan",
                "Yatoro@gmail.com", 
                LocalDate.of(2000, 5, 18)
            );
            Student ame = new Student(
                "ame",
                "ameee@gmail.com",
                LocalDate.of(1999, 2, 28)
            );

            repository.saveAll(
                List.of(yatoro, ame)
            );
        };
    }
}
