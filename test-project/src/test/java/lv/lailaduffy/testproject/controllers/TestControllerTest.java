package lv.lailaduffy.testproject.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class TestControllerTest {

    private TestController controller = new TestController();

    @BeforeEach
    void setUp() {
        System.out.println("Test has started");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test has finished");
    }

    @Test
    void getTest() {
        assert(controller.getTest()).equals("This is test!");
    }

    @Test
    void getAnotherTest() {
        assert(controller.getAnotherTest()).contains("response");
    }

    @Test
    void calculate() {
        assert(controller.calculate(1)) == (6.28);
    }

    @Test
    void calculate2() {
        assert(controller.calculate(99.99999)) > 627;
        assert(controller.calculate(99.99999)) < 628;
    }
}