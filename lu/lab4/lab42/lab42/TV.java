package lab42;

public class TV extends Product implements ElectricalAppliance{
    private String manufacturer;
    private String model;
    private double power;

    public TV(int number, double price, String manufacturer, String model, double power) throws PriceException, PowerException {
        super(number, price);
        this.manufacturer = manufacturer;
        this.model = model;
        setPower(power);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) throws PowerException {
        if (power <= 0){
            throw new PowerException();
        }
        else{
            this.power = power;
        }
    }

    @Override
    public double checkPromo() {
        return this.price - 0.09*this.price;
    }

    @Override
    public double electricityConsumption() {
        return 24*this.power*0.001;
    }
}
