
import java.util.Arrays;


public class ArrayFun {

    
    public static void main(String[] args) {
        int myArray1[]=new int[10];
        myArray1[0]=1;
        myArray1[1]=3;
        myArray1[2]=5;
        myArray1[3]=7;
        myArray1[4]=9;
        myArray1[5]=11;
        myArray1[6]=13;
        myArray1[7]=15;
        myArray1[8]=17;
        myArray1[9]=19;
        
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);
        System.out.println(myArray1[5]);
        System.out.println(myArray1[6]);
        System.out.println(myArray1[7]);
        System.out.println(myArray1[8]);
        System.out.println(myArray1[9]);
        
        int count;
        count=0;
        double myArray2[]=new double[10];
        
        
        while(count < 10) {
            myArray2[count]=1.25;
            System.out.println(myArray2[count]);
            count++;
        }
    }
}