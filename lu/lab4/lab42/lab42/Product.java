package lab42;

public abstract class Product {
    protected int number;
    protected double price;

    Product(int number, double price) throws PriceException {
        this.number = number;
        setPrice(price);
    }

    public abstract double checkPromo();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws PriceException {
        if (price <= 0){
            throw new PriceException();
        }
        else{
            this.price = price;
        }
    }
}
