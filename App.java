public class App {
    public static void main(String[] args) {
        int[] array = {14, 652, 123, 634, 9, 3467, 2389, 32, 631, 46, 64};

        InsertionSort sortClass = new InsertionSort(array);

        sortClass.sort();

        sortClass.printArray();
    }
}
