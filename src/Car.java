import javax.xml.namespace.QName;

public class Car {
    private String title;
    int wheels;
    String color;
    String engine;
    int MaxSpeed;




    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }


    public int getMaxSpeed() {
        return MaxSpeed;
    }


    public Car(int wheels, String color, String engine, int maxSpeed) {
        this.wheels = wheels;
        this.color = color;
        this.engine = engine;
        this.MaxSpeed = maxSpeed;


    }
}
