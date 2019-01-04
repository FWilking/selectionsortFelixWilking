package FelixWilking;

public class Main {

    public static void main(String[] args) {

    }

    public static int[] selectionSort(int[] arr){
        int lowest = arr[0];
        int searchi = 0;
        while !(isSorted(arr)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < lowest) {
                    lowest = arr[i];
                    searchi++;
                }
                swap(arr, i, searchi);
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] isSorted(int[] arr){
        int sum = 0;
        int product = 1;
        for(int i : arr){
            sum += i;
            product = product * ((int) i / 2);
        }
        return new int[]{sum, product};
    }
}
