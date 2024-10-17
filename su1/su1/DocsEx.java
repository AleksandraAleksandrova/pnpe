package su1;

import java.util.Scanner;

public class DocsEx {
    private Scanner sc;

    public DocsEx(Scanner sc){
        this.sc = sc;
    }

    // 1
    public void printTo10(){
        for (int i = 0; i < 10; i ++){
            System.out.println(i);
        }
    }
    //2
    public void squareArea(){
        System.out.println("Enter side:");
        double side = Double.parseDouble(sc.nextLine());
        System.out.println("The area is " + String.format("%.2f", (side*side)));
    }
    //3
    public void inchToCm(){
        System.out.println("Enter inches:");
        double inches = Double.parseDouble(sc.nextLine());
        System.out.println(inches + " inches is " + String.format("%.2f", (inches*2.54)) + " centimeters.");
    }
    //4
    public void usdToBgn(){
        System.out.println("Enter usd to be converted:");
        double usd = Double.parseDouble(sc.nextLine());
        double bgn = 1.79549*usd;
        System.out.println(usd + " dollars is " + String.format("%.2f", bgn) + " leva.");
    }
    //5
    public void radiansToDegrees(){
        System.out.println("Enter radians:");
        int radians = Integer.parseInt(sc.nextLine());
        double degrees = 180*radians/Math.PI;
        degrees = Math.round(degrees);
        System.out.println(radians + " radians is " + degrees + " degrees.");
    }
    //6
    public void architect(){
        System.out.println("Enter architect name:");
        String name = sc.nextLine();
        System.out.println("Enter number of projects:");
        int num = Integer.parseInt(sc.nextLine());
        int hours = 3*num;
        System.out.println("The architect " + name + " will need " + hours + " hours to complete " + num + " project/s.");
    }
    //7
    public void zoo(){
        System.out.println("Enter number of dogs:");
        int dogs = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number of other animals:");
        int others = Integer.parseInt(sc.nextLine());
        System.out.println("All food cost is " + (dogs*2.5) + (others*4) + " lv.");
    }
    //8
    public void yards(){
        System.out.println("Enter area:");
        double area = Double.parseDouble(sc.nextLine());
        double price = area*7.61;
        double discount = 0.18*price;
        System.out.println("The final price is " + (price-discount) + " lv.");
        System.out.println("The discount is " + discount + " lv.");
    }
    //9
    public void deposits(){
        System.out.println("Enter first deposit:");
        double first = Double.parseDouble(sc.nextLine());
        System.out.println("Enter months:");
        int months = Integer.parseInt(sc.nextLine());
        System.out.println("Enter percent:");
        double percent = Double.parseDouble(sc.nextLine());
        percent = percent/100;
        double finalSum = first + months*((first*percent)/12);
        System.out.println("The final is " + finalSum);
    }
    //10
    public void literature(){
        System.out.println("Enter pages:");
        int pages = Integer.parseInt(sc.nextLine());
        System.out.println("Enter pages per hour:");
        double pagesPerHour = Double.parseDouble(sc.nextLine());
        System.out.println("Enter days:");
        int days = Integer.parseInt(sc.nextLine());

        double hoursNeeded = pages/pagesPerHour;
        double hoursPerDay = hoursNeeded/days;

        System.out.println("Joro should read " + hoursPerDay + " hours per day.");
    }
    //11
    public void bakers(){
        // int days = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number of people participating in charity:");
        int people = Integer.parseInt(sc.nextLine());

        double money = 0;

        int cakes; //45
        int gofreti; //5.8
        int pancakes; //3.2
        for (int i = 0; i < people; i++){
            System.out.println("Enter cakes, gofreti and pancakes for person " + (i+1) + ":");
            cakes = Integer.parseInt(sc.nextLine());
            money += cakes*45;
            gofreti = Integer.parseInt(sc.nextLine());
            money += gofreti*5.8;
            pancakes = Integer.parseInt(sc.nextLine());
            money += pancakes*3.2;
        }
        System.out.println("The final amount of money raised is " + (money - ((1/8)*money)));
    }
    //12
    public void fruits(){
        System.out.println("Enter price for 1kg qgodi:");
        double qgodiKg = Double.parseDouble(sc.nextLine());
        double maliniKg = qgodiKg/2;
        double portokaliKg = maliniKg - 0.4*maliniKg;
        double bananiKg = maliniKg - 0.8*maliniKg;

        System.out.println("Enter kg Maria wants to buy for qgodi, malini, portokali and banani:");
        double banani = Double.parseDouble(sc.nextLine());
        double portokali = Double.parseDouble(sc.nextLine());
        double malini = Double.parseDouble(sc.nextLine());
        double qgodi = Double.parseDouble(sc.nextLine());

        double money = qgodi*qgodiKg + malini*maliniKg + banani*bananiKg + portokali*portokaliKg;
        System.out.println("The money Maria needs are " + String.format("%.2f", money) + " lv.");
    }
    //13
    public void aquarium(){
        System.out.println("Enter l, w, h ((all in cm)) and percent:");
        int l = Integer.parseInt(sc.nextLine()); //cm
        int w = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());
        percent = percent/100;

        // 1 l = 1 dm2
        double full = 0.1*l*0.1*w*0.1*h;
        System.out.println("Litres needed is " + (full-(percent*full)) + ".");
    }

    public void allExer(){
        printTo10();
        squareArea();
        inchToCm();
        usdToBgn();
        radiansToDegrees();
        architect();
        zoo();
        yards();
        deposits();
        literature();
        bakers();
        fruits();
        aquarium();
    }
}
