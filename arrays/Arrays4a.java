import java.util.Random;
import java.util.Scanner;

public class Arrays4a {
    static int[] numbers;

    public static void main(String[] args) {
        int[] numbers = array(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("numbers[" + i + "]=" + numbers[i]);}

        exercise241(5);

        exercise243(8);

        /*exercise245();
            
        exercise247();
        
        exercise249(); */

    }
    public static void exercise241(int k) {
        int S = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % k == 0) {
                S = S + numbers[i];
            }
        }
        System.out.println("S = " + S);
    }

    public static void exercise243(int t) {
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % t == 0) {
                k = k + 1;
            }
        }
        System.out.println("k = " + k);
    }
}