package lab32;

public class Main {
    public static void main(String[] args) {
        SickPatient a = new SickPatient("ABC", "DEF", "GHI", "nastinka", false, 200);
        a.cure("Nurifen", 1);
        a.cure("Paracetamol", 2);
        a.cure("Nurifen", 1);
    }
}
