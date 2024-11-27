package lab61;

public class Book extends Product{
    private String author;
    private String title;

    public Book(int inventoryNumber, double price, int quantity, Provider provider, String author, String title){
        super(inventoryNumber, price, quantity, provider);
        setAuthor(author);
        setTitle(title);
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
    public double getPromotionalPrice() {
        return 0.5*getPrice();
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
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", inventoryNumber=" + getInventoryNumber() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", provider=" + getProvider().getName() +
                '}';
    }
}
