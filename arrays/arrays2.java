public class arrays2 {
    public static void main(String[] args) {
        exercise223(0, 100);
        
    }

    public static void exercise223(int a, int b) {
            int numbers[] = {2, 17, -5, -52, 15, 26, -6, 12, -6};
            int k = 0;
            for ( int i = 0; i < 9; i++) {
                if (numbers[i] > a && numbers[i] < b) {
                    k = k + 1;
                }
            }
            System.out.println("k = " + k);
        }
    }
