package constructor;

public class Toyota extends Car {
    String name;

    public Toyota(String name, String carType) {
        super(carType);
        this.name = name;
    }

    public Toyota(String name) {
        super("suv");
        this.name = name;
    }

    public static void main(String[] args) {
        Toyota toyota = new Toyota("suv");
        System.out.println(toyota.cartype);
        System.out.println(toyota.name);

        toyota = new Toyota("Classic", "toyota");
        System.out.println(toyota.name);
        System.out.println(toyota.cartype);
    }
}