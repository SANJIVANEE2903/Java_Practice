//Recursion class1
//Recursion -> A function that calls its innser function
//f(f(x))->Recursion
//f(x)->x^2
//inner function f(x), outer function f(f(x))

//when x = 2, f(x)=4, f(f(x))=16
//it uses stack

//Q->print numbers from 1 to n
// import java.util.*;

// public class l17 {
//     public static void printNumb(int n){
//         if(n ==0){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n-1);
//     }
//     public static void main(String[] args) {
//       int n = 5;
//       printNumb(n);  

//     }
// }


//Qprint numbers from 1 to n
// import java.util.*;

// public class l17 {
//     public static void printNumb(int n){
//         if(n ==6){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1);
//     }
//     public static void main(String[] args) {
//       int n = 1;
//       printNumb(n);  

//     }
// }


//Print sum of first n natural numbers

// public class l17 {
//     public static void printSum(int i, int n, int sum){
//         if(i == n) {
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         printSum(i+1, n, sum);
//         System.out.println(i);

//     }
//     public static void main(String[] args) {
//       int n = 1;
//       printSum(1, 5, 0);  

//     }
// }

//  Q-> print factorial of n number

// public class l17 {
//     public static int calcfactorial(int n) {
//         if(n ==1 || n==0){
//             return 1;
//         }
//            int fact_nm1 = calcfactorial(n-1);
//            int fact_n = n*fact_nm1;
//            return fact_n;

//     }
//     public static void main(String[] args) {
//       int n = 5;
//       int ans  = calcfactorial(n);
//       System.out.println(ans);

//     }
// }

// Q-> print the fibonacci sequence till nth term*

// public class l17 {
//     public static void printFibonacci(int a, int b, int n) {
//         if(n ==0){
//             return;
//         }
//         int c = a + b;
//         System.out.println(c);
//         printFibonacci(b, c, n-1);
//     }
//     public static void main(String[] args) {
//       int a = 0, b=1;
//       System.out.println(a);
//       System.out.println(b);
//       int n = 7;
//       printFibonacci(a, b, n-2);

//     }
// }

//Q -> print x^n(stack height = n)

// public class l17 {
//     public static int calcPower(int x, int n) {
//         if(n == 0){//base case 1
//             return 1;
//         }
//         if(x == 0){//base case 2
//             return 0;
//         }
//         int xPownm1 = calcPower(x, n-1);
//         int xPown = x*xPownm1;
//         return xPown;
//     }
//     public static void main(String[] args) {
//       int x = 2, n=5;
//       int ans = calcPower(x, n);
//       System.out.println(ans);
//     }
// }


//Qprint x^n (stack height = logn)

public class l17 {
    public static int calcPower(int x, int n) {
        if(n == 0){//base case 1
            return 1;
        }
        if(x == 0){//base case 2
            return 0;
        }

        //if n is even
        if(n%2 == 0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        }
        else{
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
      int x = 2, n = 5;
      int ans = calcPower(x, n);
      System.out.println(ans);
    }
}