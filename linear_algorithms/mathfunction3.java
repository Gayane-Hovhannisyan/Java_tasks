import java.util.Scanner;

public class mathfunction3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("x = ") ;
        int x = input.nextInt() ;
        System.out.print("y = ") ;
        int y = input.nextInt() ;
        double a, b, c,  value ;
        a = Math.atan((3 * x + 4 ) / Math.pow(y,2) + 4 ) ;
        b = Math.pow(x,2) + 3 ;
        c = Math.pow(b,1.5) ;
        value = a + c ;
        System.out.println ("value = " + value);
    }
}
