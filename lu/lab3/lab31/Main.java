package lab31;

public class Main {
    public static void main(String[] args) {
        Vacation v = new Vacation("Andorra la Vella", 5, 1000, "Andorra");
        System.out.println("Destination of vacay is " + v.getDestination());
        v.fixPrice();
        System.out.println("Final price of vacay is " + v.getPrice());

        System.out.println(); // easier to read

        Trip t = new Trip("Palma de Mallorca", 7, 1500, 3);
        System.out.println("Number of hotels is " + t.getHotels());
        System.out.println("Days of trip " + t.getDays());
        t.fixPrice();
        System.out.println("Final price of trip is " + t.getPrice());
        System.out.println("Nights of trip are " + t.nights());
    }
}
