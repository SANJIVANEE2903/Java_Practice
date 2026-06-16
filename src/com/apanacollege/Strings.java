package com.apanacollege;

import java.util.*;

//In java there was already clsaa String Present
//Thats why we have given out class name as Strings
//Inside String Spaces are valid characters
public class Strings {
    
    public static void main(String[] args) {
        //String  Declaration
        //simple one 
        // String name = "Tony";
        // String FullName = "Tony Stark";
        // String sentence = "My name is Tony Stark.";

        //User input
        // Scanner sc = new Scanner(System.in);
        //it will print only single word output-> tony
        // String name = sc.next();
        // System.out.println("Your name is: "+ name);

        //for complte output we use sc.nextLine();
        // String name = sc.nextLine();
        // System.out.println("Your name is: "+ name);
        //Part 1:concatination
        //concatination
        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + " " + lastName;
        // String fullName = firstName + " @" + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length()); //-> for printing length of string

        //charAt  -> it will give that character which we have passed index
        // for (int i=0 ;i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
            
        // }

       // part2: string compare
    //     String name1 = "Tony";
    //    String name2 = "Stark";
        // Q2 use equalto to to check strings are equal or not
        // q1

        // if(name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal");
        // } else{
        //     System.out.println("Strings are not equal");
        // }
//Inside java strings are objects, thats why they are not equal
        // if(new String("Tony") == new String("Tony")){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        // String sentence = "My name is Tony";
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name);

        //take substring
        // String sentence = "TonyStark";
        // String name = sentence.substring(0, 4);
        // System.out.println(name);

        // String sentence = "TonyStark";
        // String name = sentence.substring( 4);
        // System.out.println(name);

        //strings are immutable

}

}




