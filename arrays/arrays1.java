public class arrays1 {
    public static void main(String[] args) {
        exercise211();

        exercise213();

    }

    public static void exercise211() {
        int numbers[] = { 1, 4, -58, 12, -12 };
        double S = 0;
        int k = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                S = S + numbers[i];
                k = k + 1;
            }
        }
        S = S / k;
        System.out.println("S = " + S);
    }

    public static void exercise213() {
        int numbers[] = { -10, -7, 2, 1, -3, -1, 3 };
        double S = 0;
        int k = 0;
        for (int i = 0; i < 7; i++) {
            if (numbers[i] < 0) {
                S = S + Math.pow(numbers[i], 2);
                k = k + 1;
            }
        }
        S = Math.sqrt(S) / k;
        System.out.println("S = " + S);
    }
}