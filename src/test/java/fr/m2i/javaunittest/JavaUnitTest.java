package fr.m2i.javaunittest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JavaUnitTest {

    @BeforeAll
    public static void setupAll() {
        System.out.println("setupAll");
    }

    @BeforeEach
    public void setup() {
        System.out.println("setup");
    }
    
    @Test
    public void unTest() {
        System.out.println("unTest");
        assertTrue(true);
    }

    @Test
    public void unAutreTest() {
        System.out.println("unAutreTest");
        assertTrue(true);
    }

    @AfterEach
    public void teardown() {
        System.out.println("teardown");
    }

    @AfterAll
    public static void teardownAll() {
        System.out.println("teardownAll");
    }
}
