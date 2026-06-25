package java.softskill;

import java.util.Scanner;

public class TargetFrequency {

    // Find First Occurrence
    static int firstOccurrence(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1; // search left
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Find Last Occurrence
    static int lastOccurrence(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1; // search right
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input sorted array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Target element
        int x = sc.nextInt();

        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);

        if (first == -1) {
            System.out.println("Element not found");
        } 
        else {
            int gap = last - first;
            int frequency = gap + 1;

            System.out.println("First Occurrence = " + first);
            System.out.println("Last Occurrence = " + last);
            System.out.println("Gap = " + gap);
            System.out.println("Frequency = " + frequency);
        }

        sc.close();
    }
}
