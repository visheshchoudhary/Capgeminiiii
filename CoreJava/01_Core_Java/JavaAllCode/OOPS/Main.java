// import java.util.*;
// class demo{
//     int a=10;
//     String b="ankush";
//     void show(){
//         System.out.println(a+" "+b);
//     }
// }
// public class object {
//     public static void main(String[] args){
//         demo r=new demo();
//         r.show();
//     }
// }




// import java.util.*;
// class demo{
//     int a;
//     String b;
//     demo(){
//         a=20;
//         b="raj";
//     }
//     void show(){
//         System.out.println(a+" "+b);
//     }
// }
// public class object {
//     public static void main(String[] args){
//         demo r=new demo();
//         r.show();
//     }
// }

//=======================  default constructor =====



// import java.util.*;
// class demo{
//     int a;
//     String b;
//     demo(){
//         a=20;
//         b="raj";
//     }
//     void show(){
//         System.out.println(a+" "+b);
//     }
// }
// public class object {
//     public static void main(String[] args){
//         demo r=new demo();
//         r.show();
//     }
// }



// // 
// //=======================  parametrized constructor =====



// import java.util.*;
// class demo{
//     int x;
//     String y;
//     demo(int a, String b){
//         x=a;
//         y=b;
//     }
//     demo(String c, int b){
//         System.out.println(c+" "+b);
//     }
//     void show(){
//         System.out.println(x+" "+y);
//     }
// }
// public class object {
//     public static void main(String[] args){
//         demo r=new demo(5,"lucky");
//         demo ref=new demo("kumar", 4);
//         r.show();

//     }
// }










//=======================  copy constructor =====



// import java.util.*;
// class demo{
//     int a;
//     String b;
//     demo(){
//         a=10;
//         b="lucky";
//         System.out.println(a+" "+b);
//     }
//     demo(demo r){
//         a=r.a;
//         b=r.b;
//         System.out.println(a+" "+b);
//     }
// }
// public class object {
//     public static void main(String[] args){
//         demo d=new demo();
//         demo d2=new demo(d);
//     }
// }


// ===========  Private constructor     ======

// import java.util.*;
// class demo{
//     int a;
//     double b;
//     String c;
//    private demo(){
//         a=10;
//         b=30.56;
//         c="Lucky";
//         System.out.println(a+" "+b+" "+c);
//     }
//      public static void main(String[] args){
//         demo d=new demo();
        
//     }
    
// }



//==========    constructor overloading   =========================
// class A{
//     int a; double b; String c;
//     A(){
//         a=100;
//         b=45.35;
//         c="Lucky";
//        // System.out.println(a+" "+b+" "+c);
//     }
//     A(int x){
//         a=x;
//         //System.out.println(a);
//     }
//     A(double y, String z){
//         b=y;
//         c=z;
//         //System.out.println();
//     }
// }
// public class object {
//     public static void main(String[] args){
//         A a=new A();
//         A a2=new A(10);
//         A a3=new A(20.53,"luck");
//         System.out.println(a.a+" "+a.b+" "+a.c);
//         System.out.println(a2.a);
//         System.out.println(a2.b+" "+a3.c);
//     }
// }


//  ============   static block    ===============

// class object {
//     object (){
//         System.out.println("constructor");
//     }
//     {
//         System.out.println("instance block");
//     }
//     static {
//         System.out.println("Static block executed");
//     }
//     public static void main(String[] args) {
//         object a=new object();
//         System.out.println("Main method executed");
//     }
// }



// // instance block vs static block

// class object {
//     {
//         System.out.println("kumar");
//     }
//     public static void main(String[] args) {
//        // object ob=new object();
//     }

    
// }


//======================================================================================

//     Inheritance




// class oobject {
//     int speed =4;
//     void start(){
//         System.out.println("Vehicle is strating:--");
//     }
// }
// class child extends oobject{
//     void opendoor(){
//         System.out.println("car door opened");
//     }
// }
// public class object {
//     public static void main(String[] args){
//         child c=new child();
//         c.start();
//         System.out.println(c.speed);
//         c.opendoor();
//     }
// }

///===========================================================================
/// 
// class Animal {
//     void sound() {
//         System.out.println("Animal makes sound");
//     }
// }

// class Dog extends Animal {
    
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Animal a = new Dog();   // parent reference, child object
//         a.sound();              // overridden method call
//     }
// }
