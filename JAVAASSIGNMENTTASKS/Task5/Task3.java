// 3. Write a Java program that sorts an array of integers using multiple threads.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {

        int[] array = { 9, 3, 7, 1, 4, 8, 2, 6, 5, 0 };
        int mid = array.length / 2;

        SortThread firstHalf = new SortThread(array, 0, mid - 1);
        SortThread secondHalf = new SortThread(array, mid, array.length - 1);

        Thread t1 = new Thread(firstHalf);
        Thread t2 = new Thread(secondHalf);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        mergeArr(array, 0, mid - 1, array.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void mergeArr(int[] arr, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArray.length && j < rightArray.length) {
            arr[k++] = (leftArray[i] <= rightArray[j]) ? leftArray[i++] : rightArray[j++];
        }

        while (i < leftArray.length)
            arr[k++] = leftArray[i++];
        while (j < rightArray.length)
            arr[k++] = rightArray[j++];
    }

}

class SortThread implements Runnable {
    int[] arr;
    int left;
    int right;

    public SortThread(int[] arr, int left, int right) {
        this.arr = arr;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        Arrays.sort(arr, left, right+1);
    }
}
