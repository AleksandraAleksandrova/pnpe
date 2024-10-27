package lab31;

public abstract class Journey {
    protected String destination;
    protected int days;
    protected double price;

    public Journey(String destination, int days, double price){
        this.destination = destination;
        this.days = days;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double fixPrice();
}
