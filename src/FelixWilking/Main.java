package FelixWilking;

public class Main {

    public static void main(String[] args) {
        long time = System.nanoTime();
        int[] arr = randIntArr(10, 10);
        for(int i : selectionSort(arr)){
            System.out.print(i + " ");
        }
        System.out.println("\n" + (System.nanoTime() - time));
    }

    public static int[] selectionSort(int[] arr){
        boolean found = true;
        int searchi = 0;
        while (!isSorted(arr)) {
            for (int i = 0; i < arr.length; i++) {
                found = true;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    System.out.println(i + " " + searchi);
                    swap(arr, i, searchi);
                    searchi++;
                }
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
}
