package com.example.template;

import java.util.ArrayList;
import java.util.List;

import com.example.template.domain.Cat;
import com.example.template.domain.Dog;
import com.example.template.domain.Human;
import com.example.template.domain.Pet;
import com.example.template.domain.Repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static ApplicationContext applicationContext;
    public static void main(String[] args) throws Exception{


       applicationContext = SpringApplication.run(Application.class, args);
    }


}


