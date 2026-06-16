import java.util.*;

public class Merge {
//complexity -> nlogn
    // Merge two sorted parts
    public static void conquer(int arr[], int si, int mid, int ei) {

        // Temporary array
        int merged[] = new int[ei - si + 1];

        int idx1 = si;      // left half
        int idx2 = mid + 1; // right half
        int x = 0;

        // Compare elements
        while (idx1 <= mid && idx2 <= ei) {

            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Remaining left elements
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Remaining right elements
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy back to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // Divide array recursively
    public static void divide(int arr[], int si, int ei) {

        // Base case
        if (si >= ei) {
            return;
        }

        // Find middle
        int mid = si + (ei - si) / 2;

        // Left part
        divide(arr, si, mid);

        // Right part
        divide(arr, mid + 1, ei);

        // Merge
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        divide(arr, 0, arr.length - 1);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}