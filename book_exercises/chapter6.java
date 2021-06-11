import java.util.Scanner;
public class chapter6 {
    public static void main(String[] args) {
        //int i = 5;
        //int j = 2;
        //int k = max(i, j);
        //System.out.println("The max of " + i + " and " + j + " is " + k);

        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter a HEX number");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase())); */

        //Test Method Overloading
        System.out.println("The maximum of 3  and 4 is " + max(3, 4));

        System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
        System.out.println("The maximum of 3.0, 5.4 and 10.14 is " + max(3.0, 5.4, 10.14));


    } 
    /*public static int max(int num1, int num2) {
        int result;
        if(num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    } */

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for(int i = 0; i<hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') 
        return 10 + ch - 'A';
        else return ch - '0';
    }

    // Test Method Overloading
    public static int max(int num1, int num2)  {
    if (num1 > num2)
        return num1;
    else 
        return num2;
    }

    public static double max (double num1, double num2) {
    if  (num1 > num2) 
        return num1;
    else 
        return num2;}
    

    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }   
}