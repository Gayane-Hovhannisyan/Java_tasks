import java.util.Random;
public class Arrays6 {
    static int[] x1;
    static int[] y1;
    public static void main(String[] args) {
        int[] x1 = array1(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("x1[" + i + "]=" + x1[i]);
        }

        int[] y1 = array2(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("y1[" + i + "]=" + y1[i]);
        }
        
        exercise261();
    }
    public static int[] array1(int n) {
        Random rand = new Random();
        x1 = new int[n];
        for (int i = 0; i < 10; i++) {
            x1[i] = rand.nextInt(100);

        }
        return x1;
    }

    public static int[] array2(int n) {
        Random rand = new Random();
        y1 = new int[n];
        for (int i = 0; i < 10; i++) {
            y1[i] = rand.nextInt(100);

        }
        return y1;
    }

    public static void exercise261() {
        double P = 1;
        double S1 = 0;
        int k1 = 0;
        for (int i = 0; i < x1.length; i++) {
            S1 = S1 + x1[i];
            k1 = k1 + 1;
        }
        S1 = S1 / k1;

        double S2 = 0;
        int k2 = 0;
        for(int i = 0; i < y1.length; i++) {
            S2 = S2 + y1[i];
            k2 = k2 + 1;
        }
        S2 = S2 / k2;
        P = S1 * S2;
        System.out.println("P = " + P);
    }
}