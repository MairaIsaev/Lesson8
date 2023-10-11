public class Main {
    public static void main(String[] args){
            BMW car = new BMW(
                4,
                "Black",
                "V15",
                420
        );
            car.speed(300);
            car.speed("bmw");

            Audi audi1 = new Audi(
                4,
                "White",
                "V7",
                250
        );
            audi1.speed(300);
            audi1.speed("audi");


        Audi audi = new Audi(
                4,
                "GRAY",
                "V5",
                250
        );
        audi.speed(300);
        audi.speed("audi");


        System.out.println(car.getEngine());
        System.out.println(car.getMaxSpeed());
        System.out.println(car.getWheels());
        System.out.println(car.getColor());

        System.out.println(audi.getEngine());
        System.out.println(audi.getMaxSpeed());
        System.out.println(audi.getWheels());
        System.out.println(audi.getColor());

        System.out.println(audi1.getEngine());
        System.out.println(audi1.getMaxSpeed());
        System.out.println(audi1.getWheels());
        System.out.println(audi1.getColor());
        }


    }
