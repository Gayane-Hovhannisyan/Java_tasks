import java.util.Random;

public class Arrays6 {

    public static void main(String[] args) {
        int[] x1;
        int[] y1;
        

        x1 = array(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("x1[" + i + "]=" + x1[i]);
        }

         y1 = array(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("y1[" + i + "]=" + y1[i]);
        }

        exercise261(x1, y1);

        exercise263(x1, y1);

        exercise265(x1, y1);
        
        exercise269(x1, y1);
    }

    public static int[] array(int n) {
        Random rand = new Random();
        int []x1 = new int[n];
        for (int i = 0; i < 10; i++) {
            x1[i] = rand.nextInt(100);

        }
        return x1;
    }

    public static void exercise261(int[] x1, int[] y1) {
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
        for (int i = 0; i < y1.length; i++) {
            S2 = S2 + y1[i];
            k2 = k2 + 1;
        }
        S2 = S2 / k2;
        P = S1 * S2;
        System.out.println("P = " + P);
    }

    public static void exercise263(int[] x1, int[] y1) {
        int k1 = 0;
        int k2 = 0;
        for (int i = 0; i < x1.length; i++) {
            if (x1[i] > 0) {
                k1 = k1 + 1;
            }
        }

        for (int i = 0; i < y1.length; i++) {
            if (y1[i] > 0) {
                k2 = k2 + 1;
            }
        }
        int k = k1 + k2;
        System.out.println("k = " + k);
    }

    public static void exercise265(int[] x1, int[] y1) {
        int S1 = 0;
        int P2 = 1;
        for(int i = 0; i< x1.length; i++) {
            S1 = S1 + x1[i];
        }

        for(int i = 0; i < y1.length; i++) {
            P2 = P2 * y1[i];
        }
        double S = S1 / P2;
        System.out.println("S = " + S);
    }

    public static void exercise269(int[] x1, int y1[]) {
        int S = 0;
        for(int i = 0; i < x1.length; i++) {
            if(i % 2 == 0) {
                S = S + x1[i];
            }
        }

        for(int i = 0; i < y1.length; i++) {
            if( i % 2 == 0) {
                S = S + y1[i];
            }
        }
        System.out.println("S = " + S);
    }
}