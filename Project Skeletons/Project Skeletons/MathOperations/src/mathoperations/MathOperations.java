package mathoperations;

public class MathOperations {
     public static void main( String[] args ) {
         int p,q,r,s,t,u,d,e,f,g;
          double a,b,c,h;
          String first, second, together;
 
          p = 8;
          q = 25;
          
          System.out.println( "p is " + p + ", q is " + q );
          
          System.out.println("------------------------------");
          d = p + p + q;
          System.out.println("p+p+q is " + d);
          e = p - p - q;
          System.out.println("p-p-q is " + e);
          f = p * p * q;
          System.out.println("p*p*q is " + f);
          g = p + p - p * q;
          System.out.println("p+p-p*q is " + g);
          h = p / p / q;
          System.out.println("p/p/q is " + h);
          
          p += 4;
          System.out.println("p + 4 is " + p);
          p -= 4;
          System.out.println("p - 4 is " + p);
          
          System.out.println("------------------------------");
          
         
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();

         first = "peanut butter";
         second = " and jelly";
         together = first + second;
         System.out.println( together );
     }
}