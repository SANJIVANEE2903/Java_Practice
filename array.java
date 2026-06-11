// public class array {
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         marks[0] = 85;//phy
//         marks[1] = 90;//chem
//         marks[2] = 95;//eng
//     System.out.println(marks);
    
//     }
// }

// now it will print the value of the array because we have assigned the value to the array
// public class array {
//     public static void main(String[] args) {
//         //we can initialize the array in two ways
//        // int[] marks = new int[3];
//        int marks[] = new int[3];
//         marks[0] = 85;
//         marks[1] = 90;
//         marks[2] = 95;
//         //simple way to print marks
//     // System.out.println(marks[0]);
//     // System.out.println(marks[1]);
//     // System.out.println(marks[2]);

//     //print marks using loop
//     for(int i=0; i<3; i++) {
//         System.out.println(marks[i]);
    
//     }
// }
// }

//another way of initializing the array
// public class array {
//     public static void main(String[] args) {
//         int[] marks = {85, 90, 95};
//         for(int i=0; i<marks.length; i++) {
//             System.out.println(marks[i]);
//         }
    
//     }
// }

//Take user input for the array
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[]= new int[size];

//         //input
//         for(int i=0; i<size; i++) {
//             numbers[i] = sc.nextInt();
//         }
//         //output
//         for(int i=0; i<size; i++) {
//            System.out.println(numbers[i]);
//         }
    
//     }
// }

//Take an array as input from user.
//Search for a given number x and print the index at which it occurs
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number to search
        System.out.print("Enter number to search: ");
        int x = sc.nextInt();

        // Search element
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        // If element not found
        if (!found) {
            System.out.println("Element not found in array.");
        }

        sc.close();
    }
}