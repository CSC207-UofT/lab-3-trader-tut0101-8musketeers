
import org.junit.*;

import static org.junit.Assert.*;


public class MotorcycleTest {

    Motorcycle m;

    @Before
    public void setUp() throws Exception {
        m = new Motorcycle();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, m.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        m.upgradeSpeed();
        assertEquals(110, m.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        m.downgradeSpeed();
        assertEquals(90, m.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(500, m.getPrice());
    }

}