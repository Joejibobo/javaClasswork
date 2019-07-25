
package userdata;

import java.util.Scanner;
public class UserData {
    
    static String firstName;
    static String lastName;
    static int age;
    static int birthDay;
    static String birthMonth;
    static int birthYear;
    static String favoriteBook;
    static String hometown;
    static double luckyNumber;
    static double shoeSize;
    static double exitment;
    static String coolFact;
    
    static int x;
    static int agePlusFive;
    static double shoeSizeTimesExitment;
    
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your first name?");
            firstName = keyboard.nextLine();
        System.out.println("What is your last name?");
            lastName = keyboard.nextLine();
        System.out.println("Hi, " + firstName + "! How old are you");
            age = keyboard.nextInt();
        System.out.println("What is your birthday? ex: 23");
            birthDay = keyboard.nextInt();
        System.out.println("What is your birth month? ex: March");
            birthMonth = keyboard.nextLine();
        System.out.println("What is your birth year? ex: 2006");
            birthYear = keyboard.nextInt();
        System.out.println("What is your favorite book?");
            favoriteBook = keyboard.nextLine();
        System.out.println("What is your hometown?");
            hometown = keyboard.nextLine();
        System.out.println("What is your lucky number?");
            luckyNumber = keyboard.nextDouble();
        System.out.println("What is your shoe size?");
            shoeSize = keyboard.nextDouble();
        System.out.println("On a scale from one to five, how exited are you to learn Java?");
            exitment = keyboard.nextDouble();
        System.out.println("What is a cool fact about you?");
            coolFact = keyboard.nextLine();
        
        //System.out.println(firstName + " " + lastName + ", age " + age + " was born on " + birthMonth + " " + birthDay + ", " + birthYear ". From " + hometown ", " + firstName + " has the luck number " + luckyNumber + " and a shoe size of " + shoeSize + ". On a scale from one to five, " + firstName + ", is this exited to learn about Java: " + exitment + "! A fun fact about " + firstName + " is: " + coolFact + "!");
        
        //static int agePlusFive;
        //static boolean ageEaqualsBirthday;
        //static boolean bornAfter2000;
        //static double shoeSizeTimesExitment;
    x = 5;   
        agePlusFive = age + x;
        System.out.println("In five years you will be " + agePlusFive + " years old");
        
        if(age == birthDay){
        System.out.println("You age is the same number as the day you where born" );
        }
        
        if((birthYear / 2000) > 1){
        System.out.println("You where born after the year 2000");
        }
        
        shoeSizeTimesExitment = shoeSize * exitment;
        System.out.println("Your shoe size times your level of exitment is: " + shoeSizeTimesExitment);
}
