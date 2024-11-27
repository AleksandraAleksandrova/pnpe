package lab61;

public class Main {
    public static void main(String[] args) {
        BlackFriday.processSales();

        System.out.println("Electronics:");
        for (Electronics e : BlackFriday.electronics) {
            System.out.println(e);
        }

        System.out.println("\nBooks:");
        for (Book b : BlackFriday.books) {
            System.out.println(b);
        }
    }
}
