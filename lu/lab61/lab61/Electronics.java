package lab61;

public class Electronics extends Product {
    private String manufacturer;
    private String model;

    public Electronics(int inventoryNumber, double price, int quantity, Provider provider, String manufacturer, String model){
        super(inventoryNumber, price, quantity, provider);
        setManufacturer(manufacturer);
        setModel(model);
    }

    public String getManufacturer(){
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

    @Override
    public double getPromotionalPrice() {
        return 0.9*getPrice();
    }

    @Override
    public boolean sellProduct(int piece) throws NoMoreProductsException {
        if(getQuantity() == 0){
            throw new NoMoreProductsException();
        }
        if(piece <= getQuantity()){
            setQuantity(getQuantity() - piece);
            return true;
        }else{
            setQuantity(0);
            throw new NoMoreProductsException();
        }
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", inventoryNumber=" + getInventoryNumber() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", provider=" + getProvider().getName() +
                '}';
    }
}
