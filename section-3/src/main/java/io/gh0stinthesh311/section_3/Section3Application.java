package io.gh0stinthesh311.section_3;

import io.gh0stinthesh311.section_3.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Section3Application {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Section3Application.class, args);
        MyController controller = ctx.getBean(MyController.class);
        System.out.println("In main method");
        System.out.println(controller.sayHello());
    }
}
