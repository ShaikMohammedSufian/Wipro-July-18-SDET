package lab02_08;

import java.util.Arrays;

// Thread class to sort a portion of the array
class merge extends Thread {
    int[] arr;
    int start, end;

    public merge(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run() {
        Arrays.sort(arr, start, end);
    }
}

public class Sortarray {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {9, 4, 7, 1, 5, 3, 6, 2};

        int mid = arr.length / 2;

        // Create two threads to sort each half
        merge t1 = new merge(arr, 0, mid);
        merge t2 = new merge(arr, mid, arr.length);

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join(); // main thread waits for t1
        t2.join(); // main thread waits for t2

        System.out.println("Array after individual sorting: " + Arrays.toString(arr));

        // Merge both halves (inefficient, but as per your code)
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        System.out.println("Result array before sorting: " + Arrays.toString(result));

        Arrays.sort(result); // final sorting after both halves are merged

        System.out.println("Result array after sorting: " + Arrays.toString(result));
    }
}
