public class Lizard implements Domesticatable, Tradable{
    @Override
    public String sound() {
        return "Hiss";
    }

    @Override
    public int wildness() {
        return 5;
    }

    @Override
    public String dangerLevel() {
        return "Harmless";
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getColor() {
        return "Green";
    }
}
