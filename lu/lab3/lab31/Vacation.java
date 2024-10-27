package lab31;

public class Vacation extends Journey {
    private String hotelName;

    public Vacation(String destination, int days, double price, String hotelName){
        super(destination, days, price);
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public double fixPrice() {
        double newPrice = getPrice() + 0.4*getPrice();
        setPrice(newPrice);
        return newPrice;
    }
}
