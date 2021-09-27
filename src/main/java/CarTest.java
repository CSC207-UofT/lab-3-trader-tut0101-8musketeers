import org.junit.*;
import static org.junit.Assert.*;
public class CarTest {
    Car c;
    @Before
    public void setup () throws Exception {
        c = new Car ();
    }

    @Test
    public void TestSound () {assertEquals("vroom vroom", c.sound());}
}
