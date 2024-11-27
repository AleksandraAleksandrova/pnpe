package lab61;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BlackFriday {
    public static Electronics[] electronics;
    public static Book[] books;

    public static void processSales() {
        ProductLoader loader = new ProductLoader();
        try {
            Object[] products = loader.importDataFromFile();

            List<Electronics> electronicsList = new ArrayList<>();
            List<Book> booksList = new ArrayList<>();

            for (Object product : products) {
                if (product instanceof Electronics) {
                    electronicsList.add((Electronics) product);
                } else if (product instanceof Book) {
                    booksList.add((Book) product);
                }
            }

            electronics = electronicsList.toArray(new Electronics[0]);
            books = booksList.toArray(new Book[0]);
        } catch (IOException | WrongPhoneNumberException e) {
            System.err.println("Error loading products: " + e.getMessage());
        }
    }
}

