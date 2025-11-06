package io.gh0stinthesh311.section_3;

import io.gh0stinthesh311.section_3.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Section3ApplicationTests {
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    MyController myController;

    @Test
    void getControllerFromCtx() {
        MyController myController = applicationContext.getBean(MyController.class);
        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {
    }
}
