

public class Patterns {
    // public static void main(String[] args) {
       
    //     int n = 4;
    //     int m = 5;

    //     //outer loop
    //     for(int i=1; i<=n; i++){
    //         //inner loop
    //         for(int j=1; j<=m; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }


    // }

//Hollow rectangle pattern
    // public static void main(String[] args) {
    //     int n = 4;
    //     int m = 5;

    //     //outer loop
    //     for(int i=1; i<=n; i++){
    //         //inner loop
    //         for(int j=1; j<=m; j++){
    //             //cell ->(i,j)
    //             if(i == 1|| j == 1 || i == n || j == m){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


    //Triangle pattern

//     public static void main(String[] args) {
       
//         int n = 4;

//         //outer loop
//         for(int i=1; i<=n; i++){
//             //inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Inverted Triangle pattern
// public static void main(String[] args) {
       
//         int n = 4;
//         //outer loop
//         for(int i=n; i>=1; i--){
//             //inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//One side Triangle pattern
// public static void main(String[] args) {
       
//         int n = 4;
//         //outer loop
//         for(int i=1; i<=n; i++){
//             //inner loop -> space print
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             //inner loop -> star print
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Print number pattern
// public static void main(String[] args) {  
//         int n = 5;

//         //outer loop
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//Print inverted  number pattern
// public static void main(String[] args) {  
//         int n = 5;

//         //outer loop
//         for(int i=1; i<=n; i++){
//             //inner loop
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//Print given number pattern
// public static void main(String[] args) {  
//         int n = 5;
//         int number = 1;

//         //outer loop
//         for(int i=1; i<=n; i++){
//             //inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print(number+" ");
//                 number++;//number = number + 1;
//             }
//             System.out.println();
//         }
//     }
// }

//Print given number pattern
public static void main(String[] args) {  
        int n = 5;

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2 == 0){//even
                    System.out.print("1 ");
                }
                else{//odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}