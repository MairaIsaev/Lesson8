public final class Audi extends BMW {
    int wheels;
    String color;
    String engine;
    int MaxSpeed;

    @Override
    public void speed(int number) {
        System.out.println(300);
    }

    public Audi(int wheels, String color, String engine, int maxSpeed) {
        super(wheels, color, engine, maxSpeed);

    }
}
