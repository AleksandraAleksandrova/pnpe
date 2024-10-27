package lab33;

public class Car extends Vehicle implements isLandVehicle{
    double power;

    public Car(double maxSpeed, String model, double price, double power){
        super(maxSpeed, model, price);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public double checkPromo() {
        double promo = getPrice() - 0.2*getPrice();
        System.out.println("New price is " + promo + " lv.");
        return promo;
    }

    @Override
    public void enterLand() {
        System.out.println("The car " + getModel() + " is entering land.");
    }
}
