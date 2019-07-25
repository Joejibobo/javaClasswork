
package person;

public class Person {
   static int age=13;
   static int ageInDays=4870;
   static double hight=1.6764;
   public static String firstName="Meir";
   public static String middleName="Nadiv";
   public static String lastName="Ross";
   static boolean isAStudent=true;
   
   
   
   
    public static void main(String[] args) {
       System.out.println("I am " + age + " years old");
       System.out.println("My age in days is " + ageInDays);
       System.out.println("I am " + hight + " meters tall");
       System.out.println("My name is " + firstName + " " + lastName);
       System.out.println("My middle name is " + middleName);
       System.out.println("The fact that I am a student is" + isAStudent);
    }
    
}
