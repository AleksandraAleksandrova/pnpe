package lab31;

public class Trip extends Journey implements Nights{
    private int hotels;

    public Trip(String destination, int days, double price, int hotels){
        super(destination, days, price);
        this.hotels = hotels;
    }

    public int getHotels() {
        return hotels;
    }

    public void setHotels(int hotels) {
        this.hotels = hotels;
    }

    @Override
    public double fixPrice(){
        double newPrice = getPrice() + 0.1*getPrice();
        setPrice(newPrice);
        return newPrice;
    }

    @Override
    public int nights(){
        if(days<2) return 0;
        return days-2;
    }
}
