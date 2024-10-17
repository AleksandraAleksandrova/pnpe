package su1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //1
        System.out.println("Hello!");
        //2
        for (int i = 0; i < 5; i ++){
            System.out.println(i);
        }
        //3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("The name you entered is " + name + ".");
        //4
        System.out.println("Enter a:");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter b:");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("a + b = " + (a+b));
        //5
        double side;
        System.out.println("Enter side:");
        side = Double.parseDouble(sc.nextLine());
        System.out.println("The area is " + String.format("%.2f", (side*side)));
        //6
        double inches;
        System.out.println("Enter inches:");
        inches = Double.parseDouble(sc.nextLine());
        System.out.println(inches + " inches is " + String.format("%.2f", (inches*2.54)) + " centimeters.");
        //7
        System.out.println("Enter name to greet:");
        String name2 = sc.nextLine();
        System.out.println("Hello, " + name2);
        //8
        String fname, lname, city;
        int age;
        System.out.println("Enter first name:");
        fname = sc.nextLine();
        System.out.println("Enter last name:");
        lname = sc.nextLine();
        System.out.println("Enter age:");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter city:");
        city = sc.nextLine();
        System.out.println("You are " + fname + " " + lname + ", a " + age + "-years old person from " + city + ".");
        //9
        System.out.println("Triangle:");
        int j = 0;
        for(int i = 0; i < 5; i ++) {
            j++;
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        DocsEx d = new DocsEx(sc);
        d.allExer();

    }
}


