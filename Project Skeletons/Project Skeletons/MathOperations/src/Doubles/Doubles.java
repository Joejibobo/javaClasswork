
package Doubles;

import java.util.Scanner;

public class Doubles {
    
    static int diOne;
    static int diTwo;
    static int count;
    static String input;
    
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Do you want to roll? note: only answer Yes or No");
    input = keyboard.nextLine();
//       if("Yes".equals(input)) { 
    
    count = 1;
        while(diceRoller()) {
            System.out.println(". Your first di rolled a " + diOne + ", and your second di rolled a " + diTwo); 
        }
    
      
    }
          public static boolean diceRoller(){
            diOne = (int)(Math.random()*6 + 1);
            diTwo = (int)(Math.random()*6 + 1);
            if(diOne != diTwo){
            System.out.println(count + ". ");
            count++;
            return true;
            }
            else{
            System.out.println("Congradulations! You recived two of the same numbers on dice roll ettempt number " + count);
            return false;
            }
        }
}

