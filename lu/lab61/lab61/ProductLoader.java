package lab61;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class ProductLoader implements ImportData {
    private static final String FILE_NAME = "C:\\Users\\Admin\\IdeaProjects\\laboratorni\\src\\lab61\\salesproducts.txt";

    @Override
    public Object[] importDataFromFile() throws IOException {
        List<Product> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("#");
                int type = Integer.parseInt(parts[0]);
                String companyName = parts[1];
                String phoneNumber = parts[2];
                Provider provider = new Provider(companyName, phoneNumber);
                int inventoryNumber = Integer.parseInt(parts[3]);
                double price = Double.parseDouble(parts[4]);
                int quantity = Integer.parseInt(parts[5]);

                if (type == 1) { // Electronics
                    String manufacturer = parts[6];
                    String model = parts[7];
                    products.add(new Electronics(inventoryNumber, price, quantity, provider, manufacturer, model));
                } else if (type == 2) { // Book
                    String author = parts[6];
                    String title = parts[7];
                    products.add(new Book(inventoryNumber, price, quantity, provider, author, title));
                }
            }
        }
        return products.toArray(new Product[0]);
    }

    public int getNumberOfRows() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            int count = 0;
            while (reader.readLine() != null) {
                count++;
            }
            return count;
        }
    }
}
