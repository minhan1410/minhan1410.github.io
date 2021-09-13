package vn.techmaster;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTesst {
    @BeforeAll

    static void setup() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("BeforeEach");
    }

    //Using assertEquals()
    @Test
    public void assertEqualsExample() {
        //Test will pass
        assertEquals(1+1, 2);

        //Test will failed
        assertEquals(2+3, 5);

    }
}
