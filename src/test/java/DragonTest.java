/*
 * This file contains sample JUnit test cases for Dragon.java
 */

import org.junit.*;

import static org.junit.Assert.*;


public class DragonTest {
    Dragon d;

    @Before
    public void setUp() throws Exception {
        d = new Dragon("Ice");
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Hrrraaaarr", d.sound());
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertTrue(0 < d.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertTrue(0 < d.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertTrue(d.getMaxSpeed() > 0);
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertTrue((20 <= d.getPrice()) && (100 > d.getPrice()));
    }

}
