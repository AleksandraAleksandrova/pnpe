package lab33;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(250.0, "Audi A3", 25000, 100);
        System.out.println("Car price is " + car.getPrice() + " lv."); //25000
        System.out.println("Car power is " + car.getPower() + " kW.");
        car.checkPromo(); // 20000
        car.enterLand();

        System.out.println(); // easier to differentiate classes demonstration

        Hovercraft hc = new Hovercraft(60.0, "ABC123", 100000.0, 15);
        System.out.println("Hovercraft max speed is " + hc.getMaxSpeed() + " km/h.");
        System.out.println("Hovercraft passengers capacity is " + hc.getPassengers() + " people.");
        hc.checkPromo(); // 97000
        hc.enterLand();
        hc.enterSea();

        System.out.println(); // easier to differentiate classes demonstration

        Ship ship = new Ship(100.0, "Titanic", 3000000, 25.5);
        System.out.println("Ship model is " + ship.getModel() + ".");
        System.out.println("Ship dead weight is " + ship.getDeadWeight() + " tons.");
        ship.checkPromo(); // 2 991 000
        ship.enterSea();
    }
}