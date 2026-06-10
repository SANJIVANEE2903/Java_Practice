
import java.util.*;
public class l4 {
    public static void main(String[] args) {
        //counter++ => counter = counter + 1
        // for(int counter=0; counter<11; counter++){
        //     System.out.print(counter+" ");
        // }


        // for(int i=0; i<11; i++){
        //     System.out.println(i);
        // }

        //While Loop
        // int i = 0;
        // while(i<11){
        //     System.out.println(i);
        //     i++;

        //do while loop
        // int i = 0;
        // do  {
        //     System.out.println(i);
        //     i = i+1;
        // }   while(i<11);

        //  int i = 12;
        //  while(i<11){
        //     System.out.println("Apana College");
        //  }

        // do  {
        //     System.out.println("Apana College");
        // }   while(i<11);
        //Print sum of 1st n natural numbers
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //         int sum = 0;
    //         for(int i=1; i<=n; i++){
    //             sum = sum + i;
    //         }
    //         System.out.println(sum);
    
    // }
//Print multiplication table of a number n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=11; i++){
            System.out.println(i*n);

        }
    }
}