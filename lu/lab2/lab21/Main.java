package lab21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course math = new Course ("Math");

        Teacher Pesho = new Teacher("Pesho", "9547167098", "16.07.1995", math);
        Pesho.greet();

        Course bd = new Course ("Bazi danni");
        Teacher Gosho = new Teacher("Goshko", "0152177878", "17.12.2001",bd );
        Gosho.greet();

        Student lexi = new Student("Lexi", "0447167098", "16.07.2004", "121223023", 5.67, 4.57, 4.98);
        lexi.printInfo();

        System.out.println("Change grades after exam:\nEnter 1 for pik, 2 for te and 3 for ppe.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Now enter the new grade:");
        double newGrade = sc.nextDouble();
        if(choice == 1){
            lexi.setPik(newGrade);
        }
        if(choice == 2){
            lexi.setTe(newGrade);
        }
        if(choice == 3){
            lexi.setPpe(newGrade);
        }

        lexi.printInfo();

    }
}