import org.junit.*;

import static org.junit.Assert.*;

public class SomethingElseTest {
    SomethingElse obj;

    @Before
    public void setUp() throws Exception {
        obj = new SomethingElse();
    }

    @Test(timeout = 100)
    public void TestGetPrice() {
        assertEquals(0, obj.getPrice());
    }

    @Test(timeout = 100)
    public void TestSound() {
        assertEquals("shoot", obj.sound());
    }
}