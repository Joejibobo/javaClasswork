
import java.util.Scanner;

public class ForLoopFun {

    public static int input;
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input a number and I will repeat 'I love Java' that many times");
        input = keyboard.nextInt();
        int myList[]=new int[input];
        for(int i=0; i<myList.length; i++){
            myList[i]=input;
            System.out.println(myList[i]);
        }
    }
}