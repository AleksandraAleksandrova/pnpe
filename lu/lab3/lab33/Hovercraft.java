package lab33;

public class Hovercraft extends Vehicle implements isLandVehicle, isSeaVessel{
    int passengers;

    public Hovercraft(double maxSpeed, String model, double price, int passengers){
        super(maxSpeed, model, price);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public double checkPromo() {
        double promo = getPrice() - 0.03*getPrice();
        System.out.println("New price is " + promo + " lv.");
        return promo;
    }

    @Override
    public void enterLand() {
        System.out.println("The hovercraft " + getModel() + " is entering land.");
    }

    @Override
    public void enterSea() {
        System.out.println("The hovercraft " + getModel() + " is entering sea.");
    }
}
