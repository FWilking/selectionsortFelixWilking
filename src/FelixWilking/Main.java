package FelixWilking;

public class Main {

    public static void main(String[] args) {
        int[] arr = randIntArr(10, 10);

        for(int i : arr) System.out.print(i + " ");
        System.out.println();

        long time = System.nanoTime();
        for(int i : selectionSort(arr)) System.out.print(i + " ");
        System.out.println("\n" + (System.nanoTime() - time));
    }

    public static int[] selectionSort(int[] arr){
        while (!isSorted(arr)) {
            for (int i = 0; i < arr.length; i++) {
                swap(arr, i, minimum(arr, i));
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] randIntArr(int len, int range){
        int[] output = new int[len];
        for (int i = 0; i < len; i++){
            output[i] = (int) (Math.random() * (range + 1));
        }
        return output;
    }

    public static boolean isSorted(int[] arr){
        for (int i = 2; i < arr.length; i += 2){
            if (arr[i] < arr[i - 2]) return false;
        }
        return true;
    }

    public static int minimum(int[] arr, int index){
        for(int i = index; i < arr.length; i++){
            if(arr[i] < arr[index]) index = i;
        }
        return index;
    }
}
