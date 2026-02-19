package com.example.refactoring;

import com.example.refactoring.adapter.Info;
import com.example.refactoring.adapter.InfoAdapter;
import com.example.refactoring.adapter.UserData;
import com.example.refactoring.chainOfResponsability.Tenente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class RefactoringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RefactoringApplication.class, args);
        new Tenente().handle(3000);
        Info me = new Info("rossella", "maruccia", new Date(1994, 02, 06));
        UserData meData = new UserData();
        InfoAdapter meAdapted = new InfoAdapter(me);
        System.out.println(meAdapted.getEta());

    }

}
