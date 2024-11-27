package lab61;

public abstract class Product {
    private int inventoryNumber;
    private double price;
    private int quantity;
    private Provider provider;

    public Product(int inventoryNumber, double price, int quantity, Provider provider){
        setInventoryNumber(inventoryNumber);
        setPrice(price);
        setQuantity(quantity);
        setProvider(provider);
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0 ){
            this.quantity = 0;
            return;
        }
        this.quantity = quantity;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public abstract double getPromotionalPrice();

    public abstract boolean sellProduct(int piece) throws NoMoreProductsException;
}
