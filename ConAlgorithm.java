import java.util.Scanner;
public class ConAlgorithm {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        double Y = exercise11(a, b, x) ;
        System.out.println("Y = " + Y) ;

        double A = exercise13(a, b, x) ;
        System.out.println("A = " + A) ;

        double B = exercise16(a, x) ;
        System.out.println("B = " + B) ;

        double C = exercise19(a, b, c) ;
        System.out.println("C = " + C) ;

    }
    public static double exercise11(int n1, int n2, int n3) {
        double Y;
        if ( Math.pow(n1,2) + Math.pow(n2,2) > 5) {
            Y = 3 * Math.exp(n1 - n3) + Math.log( Math.pow(n1, 2) + Math.pow(n2,2) + 5) / Math.log(3) ;
        }
        if (  Math.pow(n1,2) + Math.pow(n2,2) < 1 ) {
            Y = Math.pow(Math.tan(n1 + n2), 4)  ;
        }
        else {
            Y = -3;
        }
        return Y ;
    } 
    public static double exercise13( int n1, int n2, int n3) {
        double A;
        if ( n1 + Math.abs(n2) < -5) {
            A = Math.exp(Math.abs(n1 + n2)) * Math.pow(Math.cos(n1 + n2 + n3), 2) ;
        }
        if (n1 + Math.abs(n2) > 2) {
            A = Math.pow( Math.atan(n1 + n3) , 1/3 ) ;
        }
        else {
            A = n1 + Math.abs(n2) ;
        }
        return A;
    }
    public static double exercise16 (int n1, int n2 ) {
        double B ;
        if ( Math.abs(n1) < 3 ) { 
           B = Math.pow(Math.sin (Math.abs( n1 + n2)),2) + Math.pow(Math.cos(Math.pow(n2, 2)),2);
        }
        else {
            double k = Math.pow(n1, 2) + Math.pow(n2, 2) ;
            double j = Math.pow(n1, 2) + Math.pow(n2, 4) ;
            B = Math.pow(k, 1/4) *  ( Math.log(j) / Math.log(2) ) ;  
        }
        return B ;
    }
    public static double exercise19 (int n1, int n2, int n3) {
        double C ;
        if(n1 + n2 < 7) {
            C = 1 / Math.pow(Math.tan(Math.pow(n1,2) + Math.pow(n2,2) + n3), 2) ;
        }
        else {
            C = Math.pow(10 , -7) ;
        }
        return C ;
    }
}
