public class BMW extends Car {


    public BMW(int wheels, String color, String engine, int maxSpeed) {
        super(wheels, color, engine, maxSpeed);

        }

        public void speed(int number){
            System.out.println("this car name -  " + number);

        }

        public final void speed(String name){
            System.out.println("this car name -  " + name);

        }
}


