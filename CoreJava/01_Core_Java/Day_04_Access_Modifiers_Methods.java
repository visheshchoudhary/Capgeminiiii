// import java.util.*;
// public class twentythree {

//     	public static void main(String[] args){
//             Scanner sc=new Scanner(System.in);
//             System.out.println("Enter the first no:--");
//             int n=sc.nextInt();
//             System.out.println("Enter the first no:--");
//             int b=sc.nextInt();
//             int k=0;
//             for(int i=1;i<100;i++){
//                 int a=i%10;
//                 if(i%7==0 || a==7){
//                     System.out.println(i);
//                     k++;
//                 }
//             }
//             System.out.println("total no count:--"+k);
//     }
// }

////////////////////////////////////////////////////////////////

// import java.util.*;
// public class twentythree {

//     	public static void main(String[] args){
//             Scanner sc=new Scanner(System.in);
//             System.out.println("Enter the no:--");
//             int n=sc.nextInt();
//             for(int i=1;i<n;i++){
//                 if(n%i==0){
//                     System.out.println(i);
//                 }
//             }
//     }
// }

/////////////////////////////////////////////////


// import java.util.*;
// public class twentythree {
//     	public static void main(String[] args){
//             Scanner sc=new Scanner(System.in);
//             System.out.println("Enter the no:--");
//             int n=sc.nextInt();
//             int a=0;
//             int b=1;
//              if(n>=1){
//             System.out.println(a);
//                         }
//             if(n>=2){
//             System.out.println(b);
//                     }
//             for(int i=3;i<=n;i++){
//                 int c=a+b;
//                 System.out.println(c);
//                 a=b;
//                 b=c;
//             }
//     }
// }



///////////////////////////////////////////


// import java.util.*;
// public class twentythree {
//     	public static void main(String[] args){
//             Scanner sc=new Scanner(System.in);
//             System.out.println("Enter the no:--");
//             int n=sc.nextInt();
//             int c=0;
//             for(int i=1;i<=n;i++){
//                 c+=(i*i);
//             }
//             System.out.println(c);
//     }
// }

////////////////////////////////////////////////////////////////

// import java.util.*;
// public class twentythree {
//     	public static void main(String[] args){
//             Scanner sc=new Scanner(System.in);
//             System.out.println("Enter the no:--");
//             int n=sc.nextInt();
//             int c=0;
//             for(int i=1;i<=n;i++){
//                 if(i%2==0){
//                     c+=(i*i);
//                 }
//             }
//             System.out.println(c);
//     }
// }





// method is the block of code which is used t perform a specifictask .
// it allows code usability define once ans use multiple times.
// u can break a complex program into  smaller chunks of cide
// u can only create a method within a  class there are a total six components include in a method declaration the comppnents
// about the method

/*

=================================================================================================
                            METHODS IN JAVA (CLASS NOTES)
========================================================================================================

1) What is a Method?
--------------------
A method is a block of code that is used to perform a specific task.
It helps in:
- Code reusability (define once, use multiple times)
- Breaking a complex program into smaller parts
- Improving readability and maintainability of code


2) Where can we create a method?
--------------------------------
✔ A method can be created only inside a class.
✔ We can create any number of methods inside a class.
❌ We cannot create a method inside another method.


3) General Syntax of a Method
-----------------------------
access_modifier modifier return_type method_name(arguments) {
    // method body
    return value;
}


4) Example: main() Method
-------------------------
public static void main(String[] args) {
    // program execution starts from here
}


5) Components of a Method Declaration
-------------------------------------
A method declaration consists of 6 components:

1. Access Modifier
2. Non-Access Modifier
3. Return Type
4. Method Name
5. Parameters (Arguments)
6. Method Body


6) Method Signature
-------------------
Method Signature = Method Name + Parameters

Example:
add(int a, int b)


7) Method Declaration
---------------------
Method Declaration =
Access Modifier + Modifier + Return Type + Method Signature

Example:
public static int add(int a, int b)


8) Method Definition
--------------------
Method Definition = Method Declaration + Method Body


====================================================
               ACCESS MODIFIERS
====================================================

Access modifiers define the accessibility of a method.

Java provides four access modifiers:

1) public
-----------
- Accessible from anywhere
- Any class, any package

Example:
public void show() { }


2) private
------------
- Accessible only within the same class

Example:
private void display() { }


3) protected
--------------
- Accessible within the same package
- Accessible in subclasses of other packages

Example:
protected void print() { }


4) default (no keyword)
------------------------
- Used when no access modifier is specified
- Accessible only within the same package

Example:
void test() { }


====================================================
            NON-ACCESS MODIFIERS
====================================================

Non-access modifiers change the behavior of a method.

Common non-access modifiers:
- static
- final
- abstract
- synchronized
- native

Note:
volatile and transient are NOT used with methods
(they are used with variables).


====================================================
                RETURN TYPE
====================================================

Return type specifies the type of value returned by a method
after execution is completed.

Rules:
- If a method returns a value, return type must match that value.
- If a method does not return anything, use void.


Examples:

1) void return type
-------------------
void show() {
    System.out.println("Hello");
}


2) Primitive return type
------------------------
int sum() {
    return 10;
}


3) Non-Primitive return type
----------------------------
int[] getArray() {
    return new int[]{1, 2, 3};
}


====================================================
                IMPORTANT POINTS
====================================================

✔ Method can be created only inside a class
✔ Method cannot be created inside another method
✔ Method signature does NOT include return type
✔ main() is a predefined static method
✔ void means no return value


====================================================
           ONE-LINE DEFINITION
====================================================

A method is a block of code that performs a specific task
and provides code reusability.

====================================================

public class Methods_In_Java {
    public static void main(String[] args) {
        System.out.println("Methods in Java - Notes File");
    }
}

 type of methd based on arguments:--

 2

 no arguments method
 parameterized method 

 we can call a no arguemnts method without apssing actual arguments in the method call statemnet 


 no arguments methd :--

 not have formal argument s 



 ================***************************==================***********************
====================================================
     TYPES OF METHODS (BASED ON ARGUMENTS)
====================================================

There are mainly TWO types of methods based on arguments:

1) No-Argument Method
2) Parameterized Method


----------------------------------------------------
1) No-Argument Method
----------------------------------------------------

A no-argument method is a method that does NOT take
any parameters (formal arguments).

- It does not have formal arguments
- We can call this method WITHOUT passing any value
- Method call statement does not contain arguments


Syntax:
-------
return_type methodName() {
    // method body
}


Example:
--------
void showMessage() {
    System.out.println("Hello, Java");
}


Method Call:
------------
showMessage();


----------------------------------------------------
2) Parameterized Method
----------------------------------------------------

A parameterized method is a method that takes
one or more parameters (formal arguments).

- Values are passed during method call
- Actual arguments are passed to formal arguments


Syntax:
-------
return_type methodName(dataType variable) {
    // method body
}


Example:
--------
void add(int a, int b) {
    System.out.println(a + b);
}


Method Call:
------------
add(10, 20);


----------------------------------------------------
IMPORTANT DIFFERENCE
----------------------------------------------------

No-Argument Method:
- No parameters
- No values passed during call

Parameterized Method:
- Has parameters
- Values must be passed during call


            ========================***---____--***============================
====================================================
        FORMAL ARGUMENTS & ACTUAL ARGUMENTS
====================================================

1) Formal Arguments
-------------------
Formal arguments are the variables that are declared
in the method declaration.

They receive the values that are passed during
the method call.

Example:
--------
void add(int a, int b) {
    // a and b are formal arguments
}


2) Actual Arguments
-------------------
Actual arguments are the values that are passed
in the method call statement.

Example:
--------
add(10, 20);
// 10 and 20 are actual arguments


====================================================
                    RETURN
====================================================

return is a keyword in Java.

It is a control transfer statement.
When a return statement is executed:
- The execution of the method is terminated
- Control is transferred back to the calling method


----------------------------------------------------
Rules of return Statement
----------------------------------------------------

1) The return statement should be the LAST statement
   in a method block.

2) The data type of the value returned by the return
   statement must match the method's return type.

3) The return statement is NOT compulsory if the
   return type of the method is void.


----------------------------------------------------
Types of Data Returned by a Method
----------------------------------------------------

1) void
   - No value is returned

2) Primitive data types
   - int, float, double, char, boolean, etc.

3) Non-Primitive data types
   - Array
   - String
   - Object
   - Class reference


----------------------------------------------------
Examples
----------------------------------------------------

void show() {
    System.out.println("No return value");
}

int getNumber() {
    return 10;
}

String getName() {
    return "Lucky";
}

int[] getArray() {
    return new int[]{1, 2, 3};
}

====================================================



*/




// import java.util.*;
// public class twentythree {
//     	public static void main(String[] args){
            
//             System.out.println("ys");
//            sum();
//             System.out.println("no");
//     }

//     public static void sum(){
//         int a=2;
//         int b=5;
//         System.out.println(a+b);
//     }
// }

// // parametr




///////////////////////////////
/// 
/// 
/// 


// import java.util.Scanner;

// class Calculator {
//     void add(int a, int b) {
//         System.out.println(a + b);
//     }
//     void sub(int a, int b) {
//         System.out.println(a - b);
//     }
//     void mul(int a, int b) {
//         System.out.println(a * b);
//     }
//     void div(int a, int b) {
//         System.out.println(a / b);
//     }
//     void rem(int a, int b) {
//         System.out.println(a % b);
//     }
//     void discount(int price, int percent) {
//         System.out.println(price - (price * percent / 100));
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         Calculator c = new Calculator();

//         System.out.println("1 Add");
//         System.out.println("2 Sub");
//         System.out.println("3 Mul");
//         System.out.println("4 Div");
//         System.out.println("5 Rem");
//         System.out.println("6 Discount");

//         int ch = sc.nextInt();

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         switch (ch) {
//             case 1: c.add(a, b); break;
//             case 2: c.sub(a, b); break;
//             case 3: c.mul(a, b); break;
//             case 4: c.div(a, b); break;
//             case 5: c.rem(a, b); break;
//             case 6: c.discount(a, b); break;
//             default: System.out.println("Wrong choice");
//         }
//     }
// }



////////////////////////////////////////////////////////////////////
/// 
/// 
/// 




// import java.util.Scanner;

// class Calculator {
//     void add(int a, int b) {
//         System.out.println(a + b);
//     }
//     void sub(int a, int b) {
//         System.out.println(a - b);
//     }
//     void mul(int a, int b) {
//         System.out.println(a * b);
//     }
//     void div(int a, int b) {
//         System.out.println(a / b);
//     }
//     void rem(int a, int b) {
//         System.out.println(a % b);
//     }
//     void discount(int price, int percent) {
//         System.out.println(price - (price * percent / 100));
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         Calculator c = new Calculator();

//         System.out.println("1 Add");
//         System.out.println("2 Sub");
//         System.out.println("3 Mul");
//         System.out.println("4 Div");
//         System.out.println("5 Rem");
//         System.out.println("6 Discount");

//         int ch = sc.nextInt();

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         switch (ch) {
//             case 1: c.add(a, b); break;
//             case 2: c.sub(a, b); break;
//             case 3: c.mul(a, b); break;
//             case 4: c.div(a, b); break;
//             case 5: c.rem(a, b); break;
//             case 6: c.discount(a, b); break;
//             default: System.out.println("Wrong choice");
//         }
//     }
// }
/////////////////////////////////
/// 
/// 
/// 


// import java.util.Scanner;

// class Calculator {

//     void areaOfRectangle(int l, int b) {
//         System.out.println("Area of Rectangle = " + (l * b));
//     }

//     void areaOfSquare(int s) {
//         System.out.println("Area of Square = " + (s * s));
//     }

//     void areaOfCircle(double r) {
//         System.out.println("Area of Circle = " + (3.14 * r * r));
//     }

//     void areaOfTriangle(double b, double h) {
//         System.out.println("Area of Triangle = " + (0.5 * b * h));
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         Calculator c = new Calculator();

//         System.out.println("Choose operation:");
//         System.out.println("1. Area of Rectangle");
//         System.out.println("2. Area of Square");
//         System.out.println("3. Area of Circle");
//         System.out.println("4. Area of Triangle");

//         int ch = sc.nextInt();

//         switch (ch) {
//             case 1:
//                 System.out.print("Enter length: ");
//                 int l = sc.nextInt();
//                 System.out.print("Enter breadth: ");
//                 int b = sc.nextInt();
//                 c.areaOfRectangle(l, b);
//                 break;

//             case 2:
//                 System.out.print("Enter side: ");
//                 int s = sc.nextInt();
//                 c.areaOfSquare(s);
//                 break;

//             case 3:
//                 System.out.print("Enter radius: ");
//                 double r = sc.nextDouble();
//                 c.areaOfCircle(r);
//                 break;

//             case 4:
//                 System.out.print("Enter base: ");
//                 double base = sc.nextDouble();
//                 System.out.print("Enter height: ");
//                 double h = sc.nextDouble();
//                 c.areaOfTriangle(base, h);
//                 break;

//             default:
//                 System.out.println("Wrong choice");
//         }
//     }
// }


//////////////////////////////////////////////////////////////
/// 
/// 
/// 
/// 
/// 
// import java.util.Scanner;

// class Calculator {

//     void areaOfRectangle(int l, int b) {
//         System.out.println("Area of Rectangle = " + (l * b));
//     }

//     void areaOfSquare(int s) {
//         System.out.println("Area of Square = " + (s * s));
//     }

//     void areaOfCircle(double r) {
//         System.out.println("Area of Circle = " + (3.14 * r * r));
//     }

//     void areaOfTriangle(double b, double h) {
//         System.out.println("Area of Triangle = " + (0.5 * b * h));
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         Calculator c = new Calculator();

//         System.out.println("Choose operation:");
//         System.out.println("1. Area of Rectangle");
//         System.out.println("2. Area of Square");
//         System.out.println("3. Area of Circle");
//         System.out.println("4. Area of Triangle");

//         int ch = sc.nextInt();

//         switch (ch) {
//             case 1:
//                 System.out.print("Enter length: ");
//                 int l = sc.nextInt();
//                 System.out.print("Enter breadth: ");
//                 int b = sc.nextInt();
//                 c.areaOfRectangle(l, b);
//                 break;

//             case 2:
//                 System.out.print("Enter side: ");
//                 int s = sc.nextInt();
//                 c.areaOfSquare(s);
//                 break;

//             case 3:
//                 System.out.print("Enter radius: ");
//                 double r = sc.nextDouble();
//                 c.areaOfCircle(r);
//                 break;

//             case 4:
//                 System.out.print("Enter base: ");
//                 double base = sc.nextDouble();
//                 System.out.print("Enter height: ");
//                 double h = sc.nextDouble();
//                 c.areaOfTriangle(base, h);
//                 break;

//             default:
//                 System.out.println("Wrong choice");
//         }
//     }
// }


// create a class notebook , create two non static variable no of pages and price use a method to accept 
// these two data and initialize the variable, and craete a display methid craeet two object in main 

// public class Calculator {

//     int pages;
//     int  prices;


//     void data(int p,int r){
//         pages=p;
//         prices=r;
//     }

//     void display(){
//         System.out.println("Pages:-"+pages);
//         System.out.println("Price:--"+prices);
//     }

//     public static void main(String[] args) {

//         Calculator n1 = new Calculator();
//         Calculator n2 = new Calculator();

//         n1.data(100, 50);
//         n1.display();

//         System.out.println("----------");

//         n2.data(200, 100);
//         n2.display();
//     }

// }