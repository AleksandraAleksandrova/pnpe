package lab42;

public class Main {
    public static void main(String[] args){
        System.out.println("Book");
        try{
            Book b = new Book(2, -45, "Hristo Botev", "Izbrani tvorbi");
        }catch(PriceException e){
            System.out.println(e.getMessage());
        }
        System.out.println("TV");
        try{
            TV tv = new TV(2, 100, "LG", "A5", -16);
        }catch(PowerException e) {
            System.out.println(e.getMessage());
        } catch (PriceException e) {
            throw new RuntimeException(e);
        }
    }
}
