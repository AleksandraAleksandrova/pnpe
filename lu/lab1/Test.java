package lab1;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args){
        
        /* 
        Examples of basics

        int i = 1;
        int x = 2;
        int y = i + x;
        String s = "Ivan";
        String s4 = "Ivan";
        // s = "Georgi"
        String s1 = "Ivanov";
        String s2 = s + ' ' + s1;
        String s3 = new String("Georgi");
        System.out.println(s==s4);
        System.out.println("Please enter your name:");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println("Your name is " + in );

        String[] names = {"Ivan", "Georgi", "Petar"};
        for (String str : names) {
            System.out.println(str);
        }
        
        */

        // Exercise 1
        // programa koqto zadava vuprosi i zapisva otgovorite ot string vars
        // vrakrame vsichki otgovori i pravim for each 

        System.out.println("Hello!");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("What is your name?"); 
            String name = sc.nextLine();
            name = "My name is " + name + ".";
            System.out.println("How old are you?");
            String age = sc.nextLine();
            age = "I am " + age + " years old.";
            System.out.println("What is your job?");
            String job = sc.nextLine();
            job = "My job is " + job + ".";
            System.out.println("Which city do you live in?");
            String city = sc.nextLine();
            city = "I live in " + city + " city.";
            System.out.println("What is your favourite colour?");
            String colour = sc.nextLine();
            colour = "My favourite colour is " + colour + ".";


            System.out.println("\nInformation after questions:");
            String[] all_info = {name, age, job, city, colour};
            for (String s : all_info){
                System.out.println(s);
            }
        }
    }

}
