
package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Type something, and I will repeat it however many times you want");
       String input = keyboard.nextLine();
       
       System.out.println("now tell me how many times you want me to repeat it?");
       int timesToRepeat = keyboard.nextInt();
       
       System.out.println("Here we go!");
       int count = 1;
       while (count < timesToRepeat + 1) {
           System.out.println(count + ". " + input);
           count++;
       }
    }
    
}
