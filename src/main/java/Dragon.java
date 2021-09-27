/* A rideable dragon.
 */
import java.util.*;

public class Dragon implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;
    private String element;

    public Dragon(String element) {
        Random randomizer = new Random();
        this.maxSpeed = randomizer.nextInt(10) + 60;
        this.element = element;
    }

    @Override
    public String sound() {
        return "Hrrraaaarr 🔥";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = (int)(this.maxSpeed * 1.1);
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = (int)(this.maxSpeed / 1.1);
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 60;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +", Element: " + this.element + ")";
    }
}
