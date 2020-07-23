public class arrays2 {
    public static void main(String[] args) {
        exercise223(0, 100);

        exercise225(100);

    }

    public static void exercise223(int a, int b) {
        int numbers[] = { 2, 17, -5, -52, 15, 26, -6, 12, -6 };
        int k = 0;
        for (int i = 0; i < 9; i++) {
            if (numbers[i] > a && numbers[i] < b) {
                k = k + 1;
            }
        }
        System.out.println("k = " + k);
    }

    public static void exercise225(int t) {
        int numbers[] = {5, 25, -125, -7, -36, 47, 36, 9, 71, -8, -37, -19}; 
        int k = 0;
        for(int i = 0; i < 12; i++) {
            if( Math.abs(numbers[i]) < t) {
                k = k + 1;
            }
        }
        System.out.println("k = " + k);
    }
}
