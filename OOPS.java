

//class Pen(){
//     String color;
//     String type;  //ballpen,gelpen

//     public void write(){
//         System.out.println("writing something");
//     }


// }

// public class OOPS {
//     public static void main(String[] args) {
//         //creating object
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "gel";

//         //pen1.write();
//     }
// }




// class Pen{
//     String color;
//     String type;  //ballpen,gelpen

//     public void write(){
//         System.out.println("writing something");
//     }

//     public void printColor(){
//         System.out.println(this.color);
//     }
// }

// class Student{
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
// }

// public class OOPS {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         s1.name = "aman";
//         s1.age = 24;

//         s1.printInfo();
//     }
// }


//constructor-> non parametrisized

// class Pen{
//     String color;
//     String type;  //ballpen,gelpen

//     public void write(){
//         System.out.println("writing something");
//     }

//     public void printColor(){
//         System.out.println(this.color);
//     }
// }

// class Student{
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     Student() {
//         System.out.println("constructor called");
//     }
// }

// public class OOPS {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         s1.name = "aman";
//         s1.age = 24;

//         s1.printInfo();
//     }
// }



// //constructor parametrized
// class Pen{
//     String color;
//     String type;  //ballpen,gelpen
//     public void write(){
//         System.out.println("writing something");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
// }
// class Student{
//     String name;
//     int age;
//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
// }

// public class OOPS {
//     public static void main(String[] args) {

//         Student s1 = new Student("aman", 84);
//         s1.printInfo();
//     }
// }



// //copy constructor 
// class Pen{
//     String color;
//     String type;  //ballpen,gelpen
//     public void write(){
//         System.out.println("writing something");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
// }
// class Student{
//     String name;
//     int age;
//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(Student s2) {
//         this.name = s2.name;
//         this.age = s2.age;
//     }

//     Student(){
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         s1.name = "aman";
//         s1.age = 24;

//         Student s2 = new Student(s1);
//         s2.printInfo();
//     }
// }

//OOPS concepts
//ploymorphism

// class Student{
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     public void printInfo(String name){
//         System.out.println(name);
//     }

//     public void printInfo(int age){
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age){
//         System.out.println(name+ " "+ age);
//     }

// }
// public class OOPS {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         s1.name = "aman";
//         s1.age = 24;

//         //s1.printInfo();
//         s1.printInfo(s1.name, s1.age);
//     }
// }


//inheritance

// class Shape{
//     String color;
// }
// class Triangle extends Shape{
// }
// public class OOPS{
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         t1.color = "red";
//     }
// }

// //single level inheritance
// class Shape{
//     public void area(){
//         System.out.println("displays area");
//     }
// }
// class Triangle extends Shape{
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }
// public class OOPS{
//     public static void main(String[] args) {
//     }
// }





// //multiple level inheritance
// class Shape{
//     public void area(){
//         System.out.println("displays area");
//     }
// }
// class Triangle extends Shape{
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }

// class EquilateralTriangle extends Triangle{
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }
// public class OOPS{
//     public static void main(String[] args) {

//     }
// }


//import java.util.*;
// //import bank;
// class Shape{
//     public void area(){
//         System.out.println("displays area");
//     }
// }
// class Triangle extends Shape{
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }

// class Circle extends Shape{
//     public void area(int r){
//         System.out.println((3.14)*r*r);
//     }
// }
// public class OOPS{
//     public static void main(String[] args) {
//         // bank.Account account1 = new bank.Account();
//         // account1.name = "customer1";

//     }
// }




// abstract class Animal{
//    abstract  void walk();

//    public void eat(){
//     System.out.println("Animal eats");

//    }
// }

// class Horse extends Animal{
//     Horse(){
    //     System.out.println("walks on 4 legs");
    // }
    // public void walk(){
    //     System.out.println("walk on 4 legs");
    // }

// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }

// public class OOPS{
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk();
//         horse.eat();

//         // Animal animal = new Animal();//Animal is abstract
//         // animal.walk();         
//     }
// }



// abstract class Animal{
//    abstract  void walk();

//    Animal(){//constructor
//     System.out.println("you are creating a new animal");
//    }
//    public void eat(){
//     System.out.println("Animal eats");

//    }
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("walks on 4 legs");
//     }
//     public void walk(){
//         System.out.println("walk on 4 legs");
//     }
// }

// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }

// public class OOPS{
//     public static void main(String[] args) {
//         Horse horse = new Horse(); 
//     }
// }



// //interfaces
// interface Animal{
//     int eyes = 2;
//      void walk();

// }
// interface Herbivore {

// }
// class Horse implements Animal, Herbivore{
//     public void walk(){
//         System.out.println("walk on 4 legs");
//     }
// }

// public class OOPS{
//     public static void main(String[] args) {
//         Horse horse = new Horse(); 
//         horse.walk();
//     }
// }



class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school = "newschool";
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student.school = "JVM";
        Student student1 = new Student();
        student1.name = "tony";
        System.out.println(student1.school);
    }
}

