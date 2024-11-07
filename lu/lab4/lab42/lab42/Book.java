package lab42;

public class Book extends Product {
    private String author;
    private String title;

    public Book(int number, double price, String author, String title) throws PriceException {
        super(number, price);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double checkPromo() {
        return this.price - 0.15*this.price;
    }
}
