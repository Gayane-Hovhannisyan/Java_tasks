import java.util.Scanner;

import javax.xml.namespace.QName;
public class ComputerAreaWithConsoleInput {
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;
        System.out.println("The area the circle of radius " + radius + " is " + area); */

       /*  Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers  ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average of " + num1 + ", " + num2 + ", " + num3 + " is " + Descriptive  abbreviationsaverage); */

        /* int i, j, k;
         i = j = k = 2;
        System.out.println(i + " " + j + " " + k + " "); */

        /* int k = 0;
        int i = k + 2;
        System.out.println(i); */

        /*
         final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area); */

       /* double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609; 
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println(kilometers); */

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for seconds:  ");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds "); */

       /* System.out.println("Exercise 2.9.2 ");

        int a = 56 % 6;
        System.out.println("a= " + a);
        
        a = 78 % -6;
        System.out.println("a= " + a);

        a = -34 % 5;
        System.out.println("a= " + a);

        a = -34 % -5;
        System.out.println("a= " + a);

        a = 5 % 1;
        System.out.println("a= " + a);

        a = 1 % 5;
        System.out.println("a= " + a); */

       /*  System.out.println("Exercise 2.9.3 ");
        int day = (2 + 100) % 7;
        System.out.println("Sunday = 0, Monday = 1, Tuesday = 2 ");
        System.out.println(" Wednesday = 3, Thursday = 4, Friday = 5, Saturday = 6, Sunday = 7 ");
        System.out.println("day = " + day); */

       /* System.out.println("Exercise about operators ");
        System.out.println("25 / 4 is " + 25 /4);
        System.out.println("25 / 4.0 is " + 25/ 4.0);
        System.out.println("3 * 2 / 4 is " + 3* 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4); */

       
            
            long totalMilliseconds = System.currentTimeMillis();
            
            long totalSeconds = totalMilliseconds / 1000;
            
            long currentSecond = totalSeconds % 60;
            
            long totalMinutes = totalSeconds / 60; 
            
            long currentMinute = totalMinutes % 60; 
            
            long totalHours = totalMinutes / 60; 
            
            long currentHour = totalHours % 24;
            
            System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        
        
   
        

        }
}