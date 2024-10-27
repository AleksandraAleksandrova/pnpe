package lab22;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(3.3, "intel core i5", 8, 216);
        Laptop l2 = new Laptop(3.5, "intel core i7", 16, 512);

        if (l1.isBetter(l2)){
            System.out.println("Laptop 1 is better than laptop 2.");
        }else{
            System.out.println("Laptop 2 is better than laptop 1.");
        }

        System.out.println(l1);
        System.out.println(l2);


    }
}