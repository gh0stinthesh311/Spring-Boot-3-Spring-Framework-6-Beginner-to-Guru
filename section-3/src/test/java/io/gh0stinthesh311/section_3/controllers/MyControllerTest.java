package io.gh0stinthesh311.section_3.controllers;

import org.junit.jupiter.api.Test;

class MyControllerTest {

    @Test
    void sayHello() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}