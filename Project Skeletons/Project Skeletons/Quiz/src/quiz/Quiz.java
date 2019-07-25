
package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
        
        System.out.println("Question 2: What is 1 + 1");
        System.out.println("\tA) 3");
        System.out.println("\tB) 2");
        System.out.println("\tC) 4");
        System.out.println("\tD) 5");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the answer is actually 2!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
        
        System.out.println("Question 3: What is 1 + 2");
        System.out.println("\tA) 2");
        System.out.println("\tB) 3");
        System.out.println("\tC) 4");
        System.out.println("\tD) 5");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the answer is actually 3!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
         
        System.out.println("Question 4: What is 1 + 3");
        System.out.println("\tA) 3");
        System.out.println("\tB) 4");
        System.out.println("\tC) 2");
        System.out.println("\tD) 5");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the answer is actually 4!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
         
        System.out.println("Question 5: How many electrons does a standard Hydrogen atom have?");
        System.out.println("\tA) 2");
        System.out.println("\tB) 1");
        System.out.println("\tC) 2");
        System.out.println("\tD) 4");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the answer is actually 1!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
         
        System.out.println("Question 6: How do you spell Java Programming?");
        System.out.println("\tA) Jaba Programming");
        System.out.println("\tB) Java Programming");
        System.out.println("\tC) Jaba Programing");
        System.out.println("\tD) Java Programing");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the answer is actually Java Programming!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
        
        if (rightAnswers == 6) {
            System.out.println("Congradulation, you have a PERFECT score!");
        }
    }
    
}
