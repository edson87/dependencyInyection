package com.dh.inyection;

import com.dh.inyection.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.awt.*;

@SpringBootApplication
public class InyectionApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(InyectionApplication.class, args);
        MyController controller = (MyController) context.getBean("myController");
        controller.Hello();
    }
}
