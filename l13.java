import java.util.*;

public class l13 {
    public static void main(String[] args) {
        //StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // char at index 0
        //System.out.println(sb.charAt(0));

        // set char at index 0 - we can replace char at specific index
        //Method 1
        //sb.setCharAt(0, 'p');   // modify character
        //System.out.println(sb); // print updated StringBuilder

        //Method 2 -> insert
        //Write Stony-> insert s at 1st position
        // sb.insert(0, 'S');
        // System.out.println(sb);

         //Write Tonny-> insert n at 2nd position
        // sb.insert(2, 'n');
        // System.out.println(sb);
        //Method3 -> delete char 
        // delete extra 'n'
        // sb.delete(2, 3);
        // System.out.println(sb);

        // sb.delete(2, 4);
        // System.out.println(sb);

        //Method 4
        // StringBuilder sb = new StringBuilder("h");
        // sb.append("e");// str = str + "e"
        // sb.append("l");// str = str + "l"
        // sb.append("l");// str = str + "l"
        // sb.append("o");// str = str + "o"
        // //System.out.println(sb);
        // System.out.println(sb.length());

        //Method5
        StringBuilder sb = new StringBuilder("hello");

        for(int i =0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 => 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
