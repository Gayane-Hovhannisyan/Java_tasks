public class arrays4 {
    public static void main(String[] args) {

        exercise242(2);

    }

    public static void exercise242(int m) {
        int numbers[] = { 0, 5, 18, 6, 35, 9, -1, 27, 15, 115, 0, 0, 4 };
        int P = 1;
        for (int i = 0; i < 13; i++) {
            if (numbers[i] % m == 0 && numbers[i] > 0) {
                P = P * numbers[i];
            }
        }
        System.out.println("P = " + P);
    }
}