import java.util.Random;

public class Arrays3a {
    static int[] numbers;
    public static void main(String[] args) {

        int[] numbers = array(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("numbers[" + i + "]=" + numbers[i]);}

        exercise231();

        exercise232();

        /*exercise235();

        exercise238();

        exercise240(); */
    }

    public static int[] array(int n) {
        Random rand = new Random();
        numbers = new int[n];
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(100);

        }
        return numbers;
    }


    public static void exercise231() {
        double S = 0;
        for (int i = 0; i < 9; i++) {
            if (numbers[i] % 2 == 0) {
                S = S + Math.pow(numbers[i], 2);
            }
        }
        System.out.println("S = " + S);

    }

    public static void exercise232() {
        int a = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                a = a + 1;
            }
        }
        System.out.println(a);
    
    }
}