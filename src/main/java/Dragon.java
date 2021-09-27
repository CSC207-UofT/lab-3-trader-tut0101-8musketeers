/* A rideable dragon.
 */
import java.util.*;

public class Dragon implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;
    private String element;
    private int price;

    public Dragon(String element) {
        Random randomizer = new Random();
        this.maxSpeed = randomizer.nextInt(10) + 60;
        this.element = element;
        this.price = randomizer.nextInt(20) + 40;
        if (this.element == "Fire") this.price += 5;
    }

    @Override
    public String sound() {
        return "Hrrraaaarr";
    }
    
    @Override
    public int wildness() {
        return 9000;
    }

    @Override
    public String dangerLevel() {
        return "Extremely dangerous!!";
    }
    
    @Override
    public String getColor() {
        return "Shiny with hints of " + this.element;
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
        return this.price;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +", Element: " + this.element + ")";
    }
}
