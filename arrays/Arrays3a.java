public class Arrays3a {
    public static void main(String[] args) {
        exercise231();

       /* exercise232();

        exercise235();

        exercise238();

        exercise240(); */
    }

    public static void exercise231() {
        int numbers[] = { 12, 5, 48, -9, -1, 13, 31, 12, 4 };
        double S = 0;
        for (int i = 0; i < 9; i++) {
            if (numbers[i] % 2 == 0) {
                S = S + Math.pow(numbers[i], 2);
            }
        }
        System.out.println("S = " + S);

    }
}