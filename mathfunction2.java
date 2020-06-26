import java.util.Scanner;

public class mathfunction2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        int x = input.nextInt();
        System.out.print("y = ");
        int y = input.nextInt();

        double value, a, b, c;
        a = Math.cos(Math.abs(Math.pow(x, 2) - y) / (Math.pow(x, 2) + Math.pow(y, 2)));
        b = Math.sin(Math.abs(Math.pow(x, 2) - y) / (Math.pow(x, 2) + Math.pow(y, 2)));
        c = Math.log10(Math.pow(x, 2) + 1);
        value = a / b + c;
        System.out.println("value= " + value);
    }
}