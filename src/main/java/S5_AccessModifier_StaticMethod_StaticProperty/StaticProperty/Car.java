package S5_AccessModifier_StaticMethod_StaticProperty.StaticProperty;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;


    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "Skyactive 6");
        System.out.println(Car.numberOfCars);
    }
}
