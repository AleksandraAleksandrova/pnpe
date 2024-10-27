package lab33;

public class Ship extends Vehicle implements isSeaVessel{
    double deadWeight;

    public Ship(double maxSpeed, String model, double price, double deadWeight){
        super(maxSpeed, model, price);
        this.deadWeight = deadWeight;
    }

    public double getDeadWeight() {
        return deadWeight;
    }

    public void setDeadWeight(double deadWeight) {
        this.deadWeight = deadWeight;
    }

    @Override
    public double checkPromo() {
        double promo = getPrice() - 0.003*getPrice();
        System.out.println("New price is " + promo + " lv.");
        return promo;
    }

    @Override
    public void enterSea() {
        System.out.println("The ship " + getModel() + " is entering sea.");
    }
}
