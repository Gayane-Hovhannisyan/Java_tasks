import java.util.Random;

public class Myrandom {
    public static void main(String[] args) {
        int[] numbers = array(10);
        for(int i = 0; i < 5; i++) {
            System.out.println("numbers[" + i + "]=" + numbers[i]);
        }

    }

    public static int[] array(int n) {
        Random rand = new Random();
        int numbers[] = new int[n];
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(2);

        }
        return  numbers;
    }

}