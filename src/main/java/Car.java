public class Car implements Drivable, Tradable{

    String model;
    int maxSpeed;
    int price;

    // Car constructor
    public Car(String model, int maxSpeed, int price){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    // getter for max speed
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    // Increases speed by 10
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    }

    // Decreases speed by 10
    @Override
    public void downgradeSpeed() {
        this.maxSpeed += 10;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
