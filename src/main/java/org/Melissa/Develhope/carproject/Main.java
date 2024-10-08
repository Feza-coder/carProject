interface Car {
    void run();
    void stop();
    void repair();
}
abstract class FourDoorCar implements Car {
    protected String brand;
    protected String color;

    public FourDoorCar(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(brand + " " + color + " is running.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + color + " has stopped.");
    }

    @Override
    public void repair() {
        System.out.println(brand + " " + color + " is being repaired.");
    }
}

abstract class TwoDoorCar implements Car {
    protected String brand;
    protected String color;

    public TwoDoorCar(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(brand + " " + color + " is running.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + color + " has stopped.");
    }

    @Override
    public void repair() {
        System.out.println(brand + " " + color + " is being repaired.");
    }
}
class FourDoorToyota extends FourDoorCar {
    public FourDoorToyota(String color) {
        super("Toyota", color);
    }

}

class FourDoorBMW extends FourDoorCar {
    public FourDoorBMW(String color) {
        super("BMW", color);
    }

}

class FourDoorFord extends FourDoorCar {
    public FourDoorFord(String color) {
        super("Ford", color);
    }

}

class FourDoorHyundai extends FourDoorCar {
    public FourDoorHyundai(String color) {
        super("Hyundai", color);
    }

}
class TwoDoorToyota extends TwoDoorCar {
    public TwoDoorToyota(String color) {
        super("Toyota", color);
    }

}

class TwoDoorBMW extends TwoDoorCar {
    public TwoDoorBMW(String color) {
        super("BMW", color);
    }

}

class TwoDoorFord extends TwoDoorCar {
    public TwoDoorFord(String color) {
        super("Ford", color);
    }

}

class TwoDoorHyundai extends TwoDoorCar {
    public TwoDoorHyundai(String color) {
        super("Hyundai", color);
    }

}
public class Main {
    public static void main(String[] args) {
        FourDoorCar toyota = new FourDoorToyota("Red");
        toyota.run();
        toyota.stop();
        toyota.repair();

        TwoDoorCar bmw = new TwoDoorBMW("Blue");
        bmw.run();
        bmw.stop();
        bmw.repair();
    }
}