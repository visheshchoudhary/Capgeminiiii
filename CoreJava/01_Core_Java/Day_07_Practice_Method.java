

// 1️⃣ Currency Conversion Calculation

// Question

// Convert INR to USD with optional fee deduction using method overloading.

// Rules

// Base = amount × rate

// Fee = percentage deduction


// Expected Output

// Base 60.0
// Fee = 1.2
// Final = 58.8

// Code

// class Currency {

//     double convert(double amount, double rate) {
//         return amount * rate;
//     }

//     double convert(double amount, double rate, double fee) {
//         double base = amount * rate;
//         return base - (base * fee / 100);
//     }

//     public static void main(String[] args) {
//         Currency c = new Currency();

//         double base = c.convert(5000, 0.012);
//         double finalValue = c.convert(5000, 0.012, 2);

//         System.out.printf("Base %.1f%n", base);
//         System.out.printf("Fee = %.1f%n", base - finalValue);
//         System.out.printf("Final = %.1f%n", finalValue);
//     }
// }


// ---

// 2️⃣ Library Fine Calculation

// Question

// Calculate fine based on overdue days with premium discount.

// Expected Output

// Total 90
// Premium 45

// Code

// class LibraryFine {

//     static int fine(int days) {
//         int total = 0;
//         if (days > 0) total += Math.min(days, 5) * 2;
//         if (days > 5) total += Math.min(days - 5, 10) * 5;
//         if (days > 15) total += (days - 15) * 10;
//         return total;
//     }

//     static int fine(int days, boolean premium) {
//         int total = fine(days);
//         return premium ? total / 2 : total;
//     }

//     public static void main(String[] args) {
//         System.out.println("Total " + fine(18));
//         System.out.println("Premium " + fine(18, true));
//     }
// }


// ---

// 3️⃣ Fitness Calories Calculator

// Question

// Calculate calories burned with optional premium bonus.

// Expected Output

// Base 450
// Premium bonus - 45
// Final 495

// Code

// class Fitness {

//     static int calories(String activity, int minutes) {
//         int rate = 0;
//         if (activity.equals("RUN")) rate = 10;
//         if (activity.equals("CYCLING")) rate = 7;
//         if (activity.equals("YOGA")) rate = 4;
//         return rate * minutes;
//     }

//     static int calories(String activity, int minutes, boolean premium) {
//         int base = calories(activity, minutes);
//         return premium ? base + base / 10 : base;
//     }

//     public static void main(String[] args) {
//         int base = calories("RUN", 45);
//         int finalCal = calories("RUN", 45, true);

//         System.out.println("Base " + base);
//         System.out.println("Premium bonus - " + (finalCal - base));
//         System.out.println("Final " + finalCal);
//     }
// }


// ---

// 4️⃣ Electricity Bill Calculation

// Question

// Calculate electricity bill using slab system and optional meter rent.

// Expected Output

// Base 1175
// Meter Rent 150
// Final 1325

// Code

// class Electricity {

//     static double bill(int units) {
//         double total = 0;
//         if (units > 0) total += Math.min(units, 100) * 3;
//         if (units > 100) total += Math.min(units - 100, 200) * 5;
//         if (units > 300) total += (units - 300) * 8;
//         return total;
//     }

//     static double bill(int units, boolean rent) {
//         double total = bill(units);
//         return rent ? total + 150 : total;
//     }

//     public static void main(String[] args) {
//         System.out.println("Base " + bill(275));
//         System.out.println("Meter Rent 150");
//         System.out.println("Final " + bill(275, true));
//     }
// }


// ---

// 5️⃣ Restaurant Billing System

// Question

// Calculate restaurant bill with service charge and tip.

// Expected Output

// Base 850
// Service Charge 42.5
// Tip 89.25
// Final 981.75

// Code

// class Restaurant {

//     static double bill(double[] items) {
//         double sum = 0;
//         for (double x : items) sum += x;
//         return sum;
//     }

//     static double bill(double[] items, boolean service) {
//         double total = bill(items);
//         return service ? total + total * 0.05 : total;
//     }

//     static double bill(double[] items, boolean service, double tip) {
//         double total = bill(items, service);
//         return total + total * tip / 100;
//     }

//     public static void main(String[] args) {
//         double[] items = {250, 180, 420};

//         double base = bill(items);
//         double withService = bill(items, true);
//         double finalBill = bill(items, true, 10);

//         System.out.println("Base " + base);
//         System.out.println("Service Charge " + (withService - base));
//         System.out.println("Tip " + (finalBill - withService));
//         System.out.println("Final " + finalBill);
//     }
// }


// ---

// 6️⃣ Integer Dataset Filter (Input Based)

// Question

// Filter integers using overloaded methods.

// Expected Output

// Filtered Result [7, 9]

// Code

// import java.util.*;

// class FilterData {

//     static void filter(int[] data, String type, int threshold) {
//         System.out.print("Filtered Result [");
//         boolean first = true;

//         for (int x : data) {
//             if (x > threshold) {
//                 if ((type.equals("ODD") && x % 2 != 0) ||
//                     (type.equals("EVEN") && x % 2 == 0)) {
//                     if (!first) System.out.print(", ");
//                     System.out.print(x);
//                     first = false;
//                 }
//             }
//         }
//         System.out.println("]");
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] data = new int[n];
//         for (int i = 0; i < n; i++) data[i] = sc.nextInt();

//         String type = sc.next();
//         int threshold = sc.nextInt();

//         filter(data, type, threshold);
//     }
// }
