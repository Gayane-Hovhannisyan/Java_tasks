import java.util.Random;

public class Arrays5 {
    static int[] numbers;

    public static void main(String[] args) {
        int[] numbers = array(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("numbers[" + i + "]=" + numbers[i]);
        }

        //exercise251();

        //exercise253();

        //exercise255();

        //exercise257();

        exercise259();

    }

    public static int[] array(int n) {
        Random rand = new Random();
        numbers = new int[n];
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(100);

        }
        return numbers;
    }

    public static void exercise251() {

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
    }

    public static void exercise253() {
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }
        System.out.println("max = " + max + "   min = " + min);
    }

    public static void exercise255() {
        int max = numbers[0];
        int k = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                k = i;
            }
        }
        int m = max + k;
        System.out.println("max + i  = " + m);

    }

    public static void exercise257() {

        int max = numbers[0];
        int k = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                k = i;
            }
        }
        System.out.println("i = " + k);
    }

    public static void exercise259() {

        int min = numbers[0];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= min) {
                min = numbers[i];
                k = i;
            }
        }
        System.out.println("min = " + min + "  i = " + k);

    }

}