
import java.util.Scanner;

public class HighOrLow {
    
    static int randomNumber;
    static int input;
    
    public static void main(String[] args) {
        randomNumber = (int)(Math.random()*100 + 1);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("The computer has chosen a number, guess the number");
        input = keyboard.nextInt();
        
        while(input != randomNumber) {
            if(input < randomNumber) {
                System.out.println("Your guess was too low");
                    System.out.println("Guess again");
                    input = keyboard.nextInt();
            }
            if (input > randomNumber) {
                System.out.println("Your guess was too high");
                    System.out.println("Guess again");
                    input = keyboard.nextInt();
            }
    }
    }
}
