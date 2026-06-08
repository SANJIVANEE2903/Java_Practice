import java.util.*;

public class Conditions {
 
    // //if -else condition
    // public static void main(String[] args) {
    //   Scanner sc = new Scanner(System.in);
    //     int age = sc.nextInt();


    //     if(age>=18){
    //         System.out.println("Adult");
    //     }
    //     else{
    //         System.out.println("Not Adult");
    //     }
    // }

    //even-odd condition
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b= sc.nextInt();

//         if(a==b){
//             System.out.println("Even");
//         }
//         else{
//             if(a>b){
//                 System.out.println("a is greater");
//             }
//              else{
//                 System.out.println("a is lesser");
//         }
// }
//     }


//else-if ladder simple than
//  public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b= sc.nextInt();

//         if(a==b){
//             System.out.println("Even");
//         }
//         else if(a>b){
//                 System.out.println("a is greater");
//             }
//         else{
//                 System.out.println("a is lesser");
//         }
//     }

// }

// //button pressing condition
// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         if(button==1){
//             System.out.println("Hello");
//         }
//         else if(button==2){
//                 System.out.println("Namaste");
//             }
//         else if(button==3){
//                 System.out.println("Bonjour");
//         }else {
//                 System.out.println("Invalid Button");
//         }
//     }

// }


//Switch case is more efficient than if-else ladder
// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         switch(button) {
//             case 1:System.out.println("Hello");
//                 break;
//             case 2:System.out.println("Namaste");
//                 break;
//             case 3:System.out.println("Bonjour");
//                 break;
//             default:
//                 System.out.println("Invalid Button");
//         }
       
//     }
// }

// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b= sc.nextInt();
//         int operation = sc.nextInt();

//         switch(operation) {
//             case 1:System.out.println(a+b);
//                 break;
//             case 2:System.out.println(a-b);
//                 break;
//             case 3:System.out.println(a*b);
//                 break;
//             case 4:System.out.println(a/b);
//                 break;
//             case 5:System.out.println(a%b);
//                 break;
//             default:
//                 System.out.println("Invalid Operation");
//         }
       
//     }
// }

//Ask the user to enter the number of the month & print the name of the month. 
//For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int month = sc.nextInt();

//         switch(month) {
//             case 1:System.out.println("January");
//                 break;
//             case 2:System.out.println("February");
//                 break;
//             case 3:System.out.println("March");
//                 break;
//             case 4:System.out.println("April");
//                 break;
//             case 5:System.out.println("May");
//                 break;
//             case 6:System.out.println("June");
//                 break;
//             case 7:System.out.println("July");
//                 break;
//             case 8:System.out.println("August");
//                 break;
//             case 9:System.out.println("September");
//                 break;
//             case 10:System.out.println("October");
//                 break;
//             case 11:System.out.println("November");
//                 break;
//             case 12:System.out.println("December");
//                 break;
//             default:
//                  System.out.println("Invalid Month Number");
//         }
       
//     }
// }