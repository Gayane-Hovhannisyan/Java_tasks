public class arrays3 {
    public static void main(String[] args) {
        exercise231();

        exercise233();
    }

    public static void exercise231() {
        int numbers[] = {12, 5, 48, -9, -1, 257, 31, 12, 4 };
        double S = 0;
        for(int i = 0; i < 9; i++) {
            if (numbers[i] % 2 == 0) {
                S = S + Math.pow(numbers[i], 2);
            }
        }
        System.out.println("S = " + S);

    }

    public static void exercise233() {
        int numbers[] = {12, 5, 48, -9, -1, 257, 31, 12, 4 };
        double S = 0;
        double P = 1;
        for(int i = 0; i < 9; i++) {
            if (numbers[i] % 2 == 0) {
                S = S + numbers[i];
                P = P * numbers[i];
            }
        }
        System.out.println("S = " + S + "   P = " + P);

    }
}