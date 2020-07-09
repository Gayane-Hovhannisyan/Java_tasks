import  java.util.Scanner;

public class mathfunction4 {
    public static void main(String args[] ) {
        Scanner input = new Scanner(System.in);
        System.out.print("x= " );
        int x = input.nextInt() ;
        System.out.print("y = ") ;
        int y = input.nextInt() ;
        System.out.print("z = ");
        int z = input.nextInt();
        double a, b, c,  value ;
        a = Math.sin(Math.PI / 12 + x ) ;
        b = Math.cos((y + z) / (Math.PI + Math.pow(z,2))) ;
        c = Math.exp(x+4) ;
        value = a * b + c ; 
        System.out.println("value =" + value) ;
    
    }
}