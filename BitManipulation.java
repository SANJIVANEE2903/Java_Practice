
import java.util.*;

public class BitManipulation {
    public static void main(String[] args) {
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;

        // if((bitMask & n) == 0){
        //     System.out.println("bit was zero");
        // }
        // else{
        //     System.out.println("bit was one");
        // }

        // performing or operation
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1<<pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

    //performing not operation
       
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
    //oper = 1 : set oper=0 : clear
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper == 1){
            //set
        int newNumber = bitMask | n;
        System.out.println(newNumber);
        }
        else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
