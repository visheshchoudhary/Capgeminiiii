// public class Day_06_Oops_concepts {
    
// }

/////////////**************** */  Syllabus '''''''''''************************'
/// 
/*


# 🔷 MODULE 1: Introduction to OOPS (Foundations)

---

## 1️⃣ What is Programming?

Programming means **giving instructions to a computer** to solve a problem.

Example problems:

* Calculate marks
* Manage bank accounts
* Build a shopping app
* Create a student database

To solve problems, programmers follow a **style of programming**, which is called a **Programming Paradigm**.

---

## 2️⃣ What is a Programming Paradigm?

👉 A **Programming Paradigm** is **a way or style of writing programs**.

It answers:

* How should code be written?
* How should problems be solved?

There are many paradigms, but here we focus on **two important ones**:

### 🔹 Procedural Programming

### 🔹 Object-Oriented Programming (OOPS)

---

## 3️⃣ Procedural Programming (Old Style)

### 🔸 What is Procedural Programming?

Procedural programming focuses on:

* **Functions**
* **Steps**
* **Logic flow**

The program is written as **a sequence of instructions**.

👉 Data and functions are **separate**.

---

### 🔸 Example (Real Life)

Imagine cooking Maggi 🍜

Steps:

1. Boil water
2. Add Maggi
3. Add masala
4. Cook for 2 minutes

This is **procedural**:

* Step-by-step execution
* No grouping of data + behavior

---

### 🔸 Procedural Programming in Code (Idea)

* One function to calculate marks
* Another function to print marks
* Data is passed again and again

---

### 🔸 Problems with Procedural Programming

❌ No proper data security
❌ Difficult to manage large programs
❌ Code reusability is poor
❌ Hard to represent real-world things
❌ Changes in one part affect many functions

👉 Works fine for **small programs**, but **fails for big applications**.

---

## 4️⃣ Object-Oriented Programming (OOPS)

### 🔸 What is OOPS?

OOPS is a programming approach where:

* We **think in terms of objects**
* We **combine data + behavior together**

👉 Just like the **real world**.

---

### 🔸 What is an Object?

An **object** is anything that:

* Has **properties (data)**
* Has **actions (methods)**

#### Real-world examples:

* Student
* Car
* Mobile
* Bank Account

---

### 🔸 Example: Student Object 🎓

**Properties (Data):**

* Name
* Roll number
* Marks

**Actions (Behavior):**

* Study()
* GiveExam()
* GetResult()

👉 Data + actions are kept **together**
This is the **core idea of OOPS**.

---

## 5️⃣ Why OOPS is Needed?

Procedural programming cannot handle **real-world complexity**.

OOPS solves this by:

### ✅ Organizing code properly

### ✅ Making programs easy to understand

### ✅ Reusing code

### ✅ Protecting data

### ✅ Managing large applications

That’s why:

* Java
* C++
* Python
* C#
  are **OOPS-based languages**

---

## 6️⃣ Real-World Problem Modeling using OOPS

### 🔸 What does “modeling” mean?

Modeling means:
👉 **Converting real-life things into program objects**

---

### 🔸 Example: Bank System 🏦

Real World:

* Customer
* Account
* Balance
* Deposit
* Withdraw

OOPS Thinking:

* Create a **BankAccount class**
* Data → accountNumber, balance
* Methods → deposit(), withdraw()

👉 This feels **natural**, just like real life.

---

### 🔸 Another Example: Car 🚗

| Real World   | OOPS      |
| ------------ | --------- |
| Car          | Class     |
| Color, Speed | Variables |
| Drive, Brake | Methods   |

---

## 7️⃣ Advantages of OOPS

### ✅ 1. Real-World Mapping

Programs look like real life → easy to understand

### ✅ 2. Code Reusability

Write once, use many times (inheritance)

### ✅ 3. Data Security

Sensitive data can be hidden (encapsulation)

### ✅ 4. Easy Maintenance

Changes in one class don’t break whole program

### ✅ 5. Scalability

Large projects can be expanded easily

---

## 8️⃣ Limitations of OOPS

❌ More memory usage
❌ Slightly slower than procedural code
❌ More planning required
❌ Not ideal for very small programs

👉 But for **real applications**, benefits >> drawbacks

---

## 9️⃣ OOPS vs Procedural Programming (Very Important)

| Procedural                | OOPS                      |
| ------------------------- | ------------------------- |
| Focus on functions        | Focus on objects          |
| Data & functions separate | Data & functions together |
| Less secure               | More secure               |
| Hard to maintain          | Easy to maintain          |
| Not real-world friendly   | Real-world based          |

---

## 🔟 Final Summary of Module 1

After this module, you should clearly understand:

✔ What programming paradigms are
✔ Difference between procedural and OOPS
✔ Why OOPS was introduced
✔ How OOPS matches real-world thinking
✔ Advantages and limitations of OOPS

---

### 🎯 Interview Line You Can Use:

> “OOPS is a programming approach that organizes code into objects by combining data and behavior, making programs more secure, reusable, and closer to real-world scenarios.”

*************************

                        **************************** 

                                                   ************************************
                            
 
create bank system where account(r) Accountholdername(r/m) 
IFSC(r) BAlance(r/m) MICR(r)

here:-

r means read(getter)
m means modify(setter)





*/

// import java.util.*;

// public class Day_06_Oops_concepts {

//     static class BankAccount {

//         private String accountNumber;
//         private String accountHolderName;
//         private String ifscCode;
//         private double balance;
//         private String micrCode;

//         public BankAccount(String accountNumber, String ifscCode, String micrCode) {
//             this.accountNumber = accountNumber;
//             this.ifscCode = ifscCode;
//             this.micrCode = micrCode;
//         }

//         public String getAccountNumber() {
//             return accountNumber;
//         }

//         public String getAccountHolderName() {
//             return accountHolderName;
//         }

//         public String getIfscCode() {
//             return ifscCode;
//         }

//         public double getBalance() {
//             return balance;
//         }

//         public String getMicrCode() {
//             return micrCode;
//         }

//         public void setAccountHolderName(String accountHolderName) {
//             this.accountHolderName = accountHolderName;
//         }

//         public void setBalance(double balance) {
//             if (balance >= 0) {
//                 this.balance = balance;
//             }
//         }
//     }

//     public static void main(String[] args) {

//         BankAccount account = new BankAccount(
//                 "9876543210",
//                 "SBIN0004567",
//                 "400009876"
//         );

//         account.setAccountHolderName("Lucky Singh");
//         account.setBalance(75000);

//         System.out.println(account.getAccountNumber());
//         System.out.println(account.getAccountHolderName());
//         System.out.println(account.getIfscCode());
//         System.out.println(account.getBalance());
//         System.out.println(account.getMicrCode());
//     }
// }
