
package booleans;

public class Booleans {

     public static String s1 = "Good morning.";
     public static String s2 = "Hi there!";
     public static String s3 = "Howdy, partner!";
     
     static boolean b1 = true;
     static boolean b2 = false;
     
        
     
    public static void main(String[] args) {
        int x,y;
        boolean a,b,c,d,e,f;
        x=3;
        y=4;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        
        System.out.println("-------------------------------------------------");
       
         // == returnes true if the two numbers eaqual each other
         // != returnes true if the two numbers do NOT eaqual each other
         // > returnes true if the first number is greater than the second
         // < returnes true if the first number is less than the second
         // >= returnes true if the first number is greater than or eaqual to the second number
         // <= returnes true if the first number is less than or eaqual to the second number
         
        boolean g = s1.equals(s2);
        int h = s1.compareTo(s2);
        int i = s2.compareTo(s3);
        
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        
        System.out.println(x + " is equal to " + y + ": " + (b1 && !b2));
        System.out.println("True and True: " + (b1 && !b2));
       
        x=4;
        y=3;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        
        System.out.println("-------------------------------------------------");
    }
    
}
