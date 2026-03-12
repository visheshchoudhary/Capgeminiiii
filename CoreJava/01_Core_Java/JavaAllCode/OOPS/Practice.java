// Requirements

// Create a class BankAccount.

// Make these variables private:

// accountNumber

// accountHolderName

// balance

// Provide:

// Getter for accountNumber

// Getter for accountHolderName

// Getter for balance

// Create methods:

// deposit(double amount)

// Add amount to balance only if amount > 0

// withdraw(double amount)

// Withdraw only if:

// amount > 0

// amount ≤ balance

// Otherwise print "Insufficient balance"

// In main():

// Create one bank account

// Perform deposit and withdraw operations

// Display final balance

// 🧪 Test Cases (You MUST test all)
// ✅ Test Case 1: Normal Deposit & Withdrawal

// Steps

// Initial Balance: 1000
// Deposit: 500
// Withdraw: 300


// Expected Output

// Deposit successful
// Withdrawal successful
// Final Balance: 1200

//===============   ANSWER  ===========================================================

// class BankAccount {
//     private int accountNumber;
//     private String accountHolderName;
//     public double balance;

//    public BankAccount(int accountNumber, String accountHolderName,int balance){
//     this.accountNumber=accountNumber;
//     this.accountHolderName=accountHolderName;
//     this.balance=balance;
//     }

//     public int getaccountNumber(){
//         return accountNumber;
//     }
//     public String getaccountHolderName(){
//         return accountHolderName;
//     }

//     public double getbalance(){
//         return balance;
//     }
//     public void deposit(double amount){
//         if(amount>0){
//             balance+=amount;
//             System.out.println("Deposit successful");
//         }else{
//             System.out.println("Invalid deposit amount");
//         }
//     }
//     public void withdraw(double amount){
//         if(amount>0 && amount<=balance){
//             balance-=amount;
//             System.out.println("Withdrawal successful");
//         }else{
//             System.out.println("Insufficient balance");
//         }
//     }
// }
// public class Practice {
//     public static void main(String[] args){
//         BankAccount a=new BankAccount(1,"Lucky Singh",1000);
//         a.deposit(500);
//         a.withdraw(300);
//         System.out.println("Final Balance: "+(int)a.getbalance());
//     }
// }



/*
========  Question 2 Inheritance =======

*/

// class Employee{
//     int id;
//     String name;
//     double salary;
//    void displayEmployeeDeatils(){
//     System.out.println("ID:-"+id);
//     System.out.println("Name:-"+name);
// System.out.println("Salary:-"+salary);
//    }
// }

// class Manager extends Employee{
//     String department;
    
//     void displayManagerDeatils(){
//         System.out.println("Department:-"+department);
//     }
// }

// public class Practice {

//     public static void main(String[] args) {
//         Manager e=new Manager();
//         e.id=4;
//         e.name="Lucky";
//         e.salary=4500;
//         e.department="IT";
//         e.displayEmployeeDeatils();
//         e.displayManagerDeatils();
//     }
// }



//====== solution 2


// class Employee{
//     private int id;
//     private String name;
//     private double salary;
//    Employee(int id, String name,int salary){
//     this.id=id;
//     this.name=name;
//     this.salary=salary;
//    }
//    void displayEmployeeDeatils(){
//     System.out.println("ID:-"+id);
//     System.out.println("Name:-"+name);
// System.out.println("Salary:-"+salary);
//    }
// }
// class Manager extends Employee{
//    private String department;
//     Manager(int id, String name,int salary, String department){
//         super(id, name, salary);
//     this.department=department;
//    }
//     void displayManagerDeatils(){
//         System.out.println("Department:-"+department);
//     }
// }
// public class Practice {
//     public static void main(String[] args) {
//         Manager e=new Manager(4,"Lucky Singh",4500,"IT");
//         e.displayEmployeeDeatils();
//         e.displayManagerDeatils();
//     }
// }



public class Practice {

    public static void main(String[] args) {
        
    }
}


