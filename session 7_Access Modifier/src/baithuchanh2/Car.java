package baithuchanh2;

public class Car {

    // Khoi tao doi tuong object co 3 thuoc tinh name, engine, numberOfCar
    private String name;
    private String engine;
    public static int numberOfCar;

    // Khoi tao 1 contructor

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

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

}
