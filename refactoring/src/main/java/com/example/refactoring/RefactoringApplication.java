package com.example.refactoring;

import com.example.refactoring.chainOfResponsability.Tenente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefactoringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RefactoringApplication.class, args);
        new Tenente().handle(3000);
    }

}
