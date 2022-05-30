public class SelectionSortImplementation {
    public static void selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            int t = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = t;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 2, 4, 1, 3};
        selection(array);
    }
}
