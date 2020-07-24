public class arrays5 {
    public static void main(String[] args) {
        exercise251();
    }

    public static void exercise251() {
        int numbers[] = { 3, 1, 16, 6, 1, 9, -1, 27, 15, 1, 7, 5, 4 };
        int max = numbers[0];
        for (int i = 1; i < 13; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
    }
}