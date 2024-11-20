package su2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class All {
    public static final Scanner sc = new Scanner(System.in);

    public void compare(){
        System.out.println("a:");
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        if(a > b){
            System.out.println("Larger " + a);
        }else{
            System.out.println("Larger " + b);
        }
    }

    public void isEven(){
        System.out.println("Num: ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println(num + " is even.");
        }else{
            System.out.println(num + " is odd.");
        }
    }

    public void day(){
        System.out.println("day:");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public void add(){
        System.out.println("a:");
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        System.out.println("a + b = " + (a+b) );
    }

    public void workday(){
        System.out.println("day:");
        int day = sc.nextInt();
        ArrayList<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        ArrayList<String> weekend = new ArrayList<>();
        weekend.add("Saturday");
        weekend.add("Sunday");

        if(weekdays.contains(day)){
            System.out.println("Weekday");
        }else if (weekend.contains(day)){
            System.out.println();
        }else{
            System.out.println("Error");
        }
    }

    public void a100(){
        System.out.println("a:");
        int a = sc.nextInt();
        if(a !=0 && a >=-100 && a <=100){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public void isValid(){
        System.out.println("a:");
        int a = sc.nextInt();
        if(a >= 100 && a <=200){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }

    public void oneToN(){
        System.out.println("N:");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            System.out.println(i);
        }
    }

    public void nToOne(){
        System.out.println("N:");
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }

    }

    public void oneToN37(){
        System.out.println("N:");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            if(i%3==0 && i%7==0) continue;
            System.out.println(i);
        }
    }

    public void oneToN57(){
        System.out.println("n:");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            if(i%5==0 && i%7==0)
                System.out.println(i);
        }
    }

    public void minMax(){
        System.out.println("a:");
        int a = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<a; i++){
            int vhod = sc.nextInt();
            sc.nextLine();

            if(vhod > max){
                max = vhod;
            }
            if(vhod < min){
                min = vhod;
            }
        }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
    }

    public void sum(){
        int sum = 0;
        System.out.println("a:");
        int a = sc.nextInt();
        for(int i = 0; i<a; i++){
            int num = sc.nextInt();
            sc.nextLine();
            sum+= num;
        }
        System.out.println("Sum is " + sum);
    }

    public void readText(){
        System.out.println("Enter text until Stop command:");
        String word = "";
        while(!word.equals("Stop")){
            word = sc.nextLine();
            System.out.println("Word is " + word);
        }
    }

    public void dividedBy10(){
        int num = 5;
        while(!(num%10==0)){
            System.out.println("Enter number divisible by 10:");
            num = sc.nextInt();
            sc.nextLine();
        }
    }

    public void clock(){
        int hours;
        do{
            System.out.println("Enter hours");
            hours = sc.nextInt();
            sc.nextLine();
        }
        while(hours < 0 || hours > 23);

        int minutes;
        do{
            System.out.println("Enter minutes");
            minutes = sc.nextInt();
            sc.nextLine();
        }while(minutes < 0 || minutes > 59);

        if(minutes <=9){
            System.out.println(hours + ":0" + minutes);
        }else{
            System.out.println(hours + ":" + minutes);
        }
    }

    public void validNumber(){
        System.out.println("n:");
        int n = sc.nextInt();
        if((n>=1) && (n%5==0)){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid!");
        }
    }

    public void calc1(){
        // Напишете програма, която пресмята N!/K! за дадени N и K, 1<n<k
        int n, k;
        do {
            System.out.println("n:");
            n = sc.nextInt();
            sc.nextLine();
            System.out.println("k:");
            k = sc.nextInt();
        }while(!(1<k) || !(k<n));

        int up = 1;
        for(int i = n; i>=1; i--){
            up *= i;
        }

        int down = 1;
        for(int i = k; i>=1; i--){
            down *= i;
        }

        System.out.println("N!/K! = " + up/down);
    }

    public void calc2(){
        //Напишете програма, която пресмята N!*K!/(N-K)! за дадени N и K
        System.out.println("n:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("k:");
        int k = sc.nextInt();

        int up = 1;
        for(int i = n; i>=1; i--){
            up *= i;
        }
        for(int i = k; i>=1; i--){
            up *= i;
        }
        int down = 1;
        for(int i = (n-k); i>=1; i--){
            down *= i;
        }
        System.out.println("N!*K!/(N-K)! = " + up/down);
    }

    public void film(){
        double budget;
        do{
            budget = sc.nextDouble();
            sc.nextLine();
        }
        while(budget < 1 || budget > 1000000);
        int statisti;
        do{
            statisti = sc.nextInt();
            sc.nextLine();
        }while(statisti <= 0 || statisti > 500);
        double clothingPrice;
        do{
            clothingPrice = sc.nextDouble();
            sc.nextLine();
        }while (clothingPrice < 1 || clothingPrice > 1000);

        if(statisti > 150) {
            clothingPrice = clothingPrice - 0.1 * clothingPrice;
        }

        double moneyNeeded = statisti*clothingPrice + 0.1*budget;
        if(moneyNeeded > budget){
            System.out.println("Not enough money!");
            System.out.println("Money more needed " + (moneyNeeded - budget));
        }else{
            System.out.println("Action!");
            System.out.println("Money left " + (budget - moneyNeeded));
        }
    }

    public void area(){
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);
        String command = sc.nextLine();
        if (command.equals("square")) {
            int side = sc.nextInt();
            System.out.println("Area of square is " + df.format((long) side *side));
        }
        if(command.equals("rectangle")){
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            System.out.println("Area of rectangle is " + df.format((long) a*b));
        }
        if(command.equals("circle")){
            int r = sc.nextInt();
            System.out.println("Area of circle is " + df.format(Math.PI*r*r));
        }
        if(command.equals("triangle")){
            int a = sc.nextInt();
            sc.nextLine();
            int ha = sc.nextInt();
            System.out.println("Area of triangle is " + df.format((long) a *ha/2));
        }
    }
}