import java.util.Scanner;
public class mathfunction1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        int x = input.nextInt();
        System.out.print("y = ");
        int y = input.nextInt();
         double value;
        value = (y+1)*(x + Math.pow((Math.pow(x,2)+1),6)* Math.sin(Math.pow(x,2)-3) - Math.sin(y)/Math.cos(y));
         System.out.println("value = "+value);
    }
}
