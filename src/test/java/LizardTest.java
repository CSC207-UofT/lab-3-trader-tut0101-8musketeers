/*
 * This file contains sample JUnit test cases for Dragon.java
 */

import org.junit.*;

import static org.junit.Assert.*;


public class LizardTest {
    Lizard lizard;

    @Before
    public void setUp() throws Exception {
        lizard = new Lizard();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Hiss", lizard.sound());
    }

    @Test(timeout = 50)
    public void TestDanger() {
        assertEquals("Harmless", lizard.dangerLevel());
    }

}