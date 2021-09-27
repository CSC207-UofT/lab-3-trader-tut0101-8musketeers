public class Motorcycle implements Drivable, Tradable{

    private int maxSpeed;

    public Motorcycle() {
        this.maxSpeed = 100;
    }

    @Override
    public int getPrice(){return 500;}

    /**
     * Increase the maximum speed of this Vehicle.
     **/
    @Override
    public void upgradeSpeed(){this.maxSpeed+=10;}

    /**
     * Decrease the maximum speed of this Vehicle.
     **/
    @Override
    public void downgradeSpeed(){this.maxSpeed-=10;}


    /**
     * Return the maximum speed of this Vehicle.
     *
     * @return    The current maximum speed of this Vehicle.
     **/
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }


}