package lab1;

import java.util.Scanner;

// Exercise: http://javac.bg/?p=56

public class BMICalculator {

    public static void printIntroduction() {
        System.out.println("\nHello, this is a BMI Calculator.\nThis program will ask you for your height and weight and will calculate your BMI.\nYou will be given a report at the end.\n");
    }

    public static double bmiFor(double weight, double height){
        return weight * 703 / (height * height);
    }

    public static double getBMI(Scanner sc){
        System.out.println("Please enter your height (cm): ");
        double height = sc.nextDouble();
        System.out.println("Please enter your weight (kg): ");
        double weight = sc.nextDouble();
        height = height * 0.3937;
        weight = weight * 2.20462;
        System.out.println("Your height in inches is: " + Math.round(height * 100.0) / 100.0);
        System.out.println("Your weight in pounds is: " + Math.round(weight * 100.0) / 100.0);

        return bmiFor(weight, height);
    }

    public static String getStatus(double bmi){
        if(bmi <= 18.5){
            return "underweight";
        } else if(bmi <= 25){
            return "normal";
        } else if(bmi <= 30){
            return "overweight";
        } else {
            return "obese";
        }
    }

    public static void ReportResults(int number, double bmi, String status){
        System.out.println("Person " + number + " has BMI = " + Math.round(bmi * 100.0) / 100.0 + " and is " + status);
    }

    public static void main(String[] args){
        int counter = 1;
        while(true){
            printIntroduction();
            Scanner sc = new Scanner(System.in);
            double bmi = getBMI(sc);
            getStatus(bmi);
            ReportResults(counter, bmi, getStatus(bmi));
            counter += 1;
        }
    }
}