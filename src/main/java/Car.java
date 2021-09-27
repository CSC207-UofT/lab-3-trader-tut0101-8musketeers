public class Car implements Drivable, Tradable{
    public static void main(String[] args) {

    };
    private int speed;
    private int price;
    public Car() {this.speed =1;
    this.price = 7;}

    @Override
    public void upgradeSpeed() { this.speed++;}
    @Override
    public void downgradeSpeed () {this.speed--;}
    @Override
    public int getMaxSpeed () {return this.speed;}

    public int getPrice () {return 6;}
    public String sound () {return "vroom vroom";}

};
