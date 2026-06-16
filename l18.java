import java.util.*;
//Recursion
//tower of hanoi
//rules - 1.only 1 disk transferred in 1 step
//2.Smaller disks are always kept on top of larger disk

// public class l18 {
//     public static void towerOfHanoi(int n, String src, String helper, String dest){
//         if(n == 1){
//             System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
//         towerOfHanoi(n-1, helper, src, dest);
//     }
//     public static void main(String[] args) {
    //     int n = 1;
    //     towerOfHanoi(n, "S", "H", "D");

           // int n = 2;
        //towerOfHanoi(n, "S", "H", "D");

        //     int n = 3;
        // towerOfHanoi(n, "S", "H", "D");

        //         int n = 4;
        // towerOfHanoi(n, "S", "H", "D");

        //     int n = 5;
    //     towerOfHanoi(n, "S", "H", "D");


//     }
// }

//Print string in reverse

// public class l18 {
//     public static void printRev(String str, int idx){
//         if(idx == 0){
//             System.out.println(str.charAt(idx));
//             return;
//         }
//             System.out.print(str.charAt(idx));
//        printRev(str, idx-1);
// }
//     public static void main(String[] args) {
//         String str = "abcd";
//         printRev(str, str.length()-1);
//     }
// }

// Find the 1st and last occurance of an element in string
//"abaacdaefaah"
// public class l18 {
//     public static int first = -1;
//     public static int last = -1;


//     public static void findOccurance(String str, int idx, char element){

//         if(idx == str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(currChar == element){
//             if(first == -1){
//                 first = idx;
//             }
//             else{
//                 last = idx;
//             }
//         }
//         findOccurance(str, idx+1, element);

// }
//     public static void main(String[] args) {
//         String str = "abaacdaefaah";
//         findOccurance(str, 0, 'a');
//     }
// }

// check if an Array is sorted(Strictly increasing)
// //{1, 2, 3, 4, 5}
// public class l18 {
//     public static boolean isSorted(int arr[], int idx){

//         if(idx == arr.length-1){
//             return true;
//         }
//         if(arr[idx] < arr[idx+1]){
//             //array is sorted till now
//             return isSorted(arr, idx+1);
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//       //  int arr[] = {1, 3, 5};
//         int arr[] = {1, 3, 3};
//         System.out.println(isSorted(arr,0));
//     }
// }


// check if an Array is sorted(Strictly increasing)
// //{1, 2, 3, 4, 5}
//optimised code than above
// public class l18 {
//     public static boolean isSorted(int arr[], int idx){

//         if(idx == arr.length-1){
//             return true;
//         }
//         if(arr[idx] >= arr[idx+1]){
//             //array is unsorted 
//             return false;
//         }
//        return isSorted(arr, idx+1);
//     }
//     public static void main(String[] args) {
//       //  int arr[] = {1, 3, 5};
//         int arr[] = {1, 3, 3};
//         System.out.println(isSorted(arr,0));
//     }
// }


//Move all 'x' to end of the string
// //"axbcxxd"
// public class l18 {
//     public static void moveAllX(String str, int idx, int count, String newString){
//         if(idx == str.length()){
//             for(int i=0; i<count; i++){
//                 newString += 'x';
//             }
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(currChar == 'x'){
//             count++;
//             moveAllX(str, idx+1, count, newString);
//         }
//         else{
//             newString += currChar; // newString = newString + currChar
//             moveAllX(str, idx+1, count, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxd";
//         moveAllX(str, 0, 0, "");

//     }
// }

// //Remove duplicates in astring
// public class l18 {
//     public static boolean[] map = new boolean[26];

//     public static void removeDuplicates(String str, int idx, String newString){
//        if(idx == str.length()){
//         System.out.println(newString);
//         return;
//        }
//         char currChar = str.charAt(idx);
//         if(map[currChar - 'a']){
//             removeDuplicates(str, idx+1, newString);
//         }
//         else{
//             newString += currChar;
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, idx+1, newString); 

//         }
//     }
//     public static void main(String[] args) {
//         String str = "abbccda";
//         removeDuplicates(str, 0, "");

//     }
// }


//Print all the subsequences of a string 

// public class l18 {
//         public static void subsequence(String str, int idx, String newString){
//            if(idx == str.length()){
//                 System.out.println(newString);
//                 return;
//            }
//            char currChar = str.charAt(idx);
//            //to be
//            subsequence(str, idx+1, newString+currChar);

//            //or not to be
//            subsequence(str, idx+1, newString);
//         }
//     public static void main(String[] args) {
//         String str = "abc";
//         subsequence(str, 0, "");

//     }
// }

// //print all unique subsequences of string 
// public class l18 {
//         public static void subsequence(String str, int idx, String newString, HashSet<String> set){
//            if(idx == str.length()){
//             if(set.contains(newString)){
//                 return;
//             }else{
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//            }
//            char currChar = str.charAt(idx);
           
//            //to be
//            subsequence(str, idx+1, newString+currChar, set);

//            //or not to be
//            subsequence(str, idx+1, newString, set);
//         }
//     public static void main(String[] args) {
//         // String str = "abc";
//         String str = "abc";

//         HashSet<String> set = new HashSet<>();
//         subsequence(str, 0, "", set);

//     }
// }

//print keypad combination
//0 ->.
//1 ->abc
//2 ->def
//3 ->ghi
//4 ->jkl
//5 ->mno
//6 ->pqrs
//7 ->tu
//8 ->vwx
//9 ->yz
public class l18 {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        public static void printComb(String str, int idx, String combination){
            if(idx == str.length()){
                System.out.println(combination);
                return;
            }
            char currChar = str.charAt(idx);
            String mapping = keypad[currChar - '0'];

            for(int i=0; i<mapping.length(); i++){
                printComb(str, idx+1, combination+mapping.charAt(i));
            }
 
        }
    public static void main(String[] args) {
        //String str = "23";
        String str = "4";

        printComb(str, 0, "");

    }
}