package lab44;

public class Main {
    public static void main(String[] args){
        try {
            House h = new House(10, 150, "Veliko Tarnovo", 3, "Goshko");
        } catch (ZeroOrNegativeValue e) {
            System.out.println(e.getMessage());
        } catch (BlankOrEmptyString e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("All good with house.");
        }

        try {
            House h2 = new House(0, 150, "Gina Kuncheva", 2, "Peshko");
        } catch (ZeroOrNegativeValue e) {
            System.out.println(e.getMessage());
        } catch (BlankOrEmptyString e) {
            System.out.println(e.getMessage());
        }

        try {
            House h3 = new House(10, 150, "", 2, "Peshko");
        } catch (ZeroOrNegativeValue e) {
            System.out.println(e.getMessage());
        } catch (BlankOrEmptyString e) {
            System.out.println(e.getMessage());
        }
    }
}
