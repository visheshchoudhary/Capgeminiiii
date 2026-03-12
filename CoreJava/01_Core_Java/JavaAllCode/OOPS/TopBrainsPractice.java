//=========================             Question - 1.            ===================================
// public class TopBrainsPractice {
    //     static String n ;
    //     static double p ;
    //     static int q;
    
    //     public static void getItemDetails(){
        //         n = "Rice";
        //         p = 50.0;
        //         q= 2;
//     }
//     public static double calc(int q, double p){
    //         return q*p;
    //     }
    //     public static double disc(double t){
        //         return t - (t*0.10);
//     }
//     public static double disc(double t , double r){
    //         return t-(t*r/100);
//     }
//     public static void main(String[] args){
    //         getItemDetails();
    //         double r = 15.0;

//         double total = calc(q,p);
//         double fin = disc(total,r);

//         System.out.println("Total before discount: "+ total);
//         System.out.println("Discount applied: "+r+"%");
//         System.out.println("Final amount: "+fin);
//     }
// }

//=========================                    Question - 2.                ===================================
// public class TopBrainsPractice {
    //    static double distance;
    //    static double Mileage;
    //    static double Fuelprice;
    //    static double TollCharge;

//    public static void getTravelDetails(){
    //     distance=250;
    //     Mileage=12;
    //     Fuelprice=105;
    //     TollCharge=80;
    //    }
    
//    public static double calculateCost(double distance, double Mileage, double Fuelprice){
//     double fuelcost=(distance/Mileage)*Fuelprice;
//     return fuelcost;
//    }
//    public static double calculateCost(double t,double TollCharge){
//     double TotalCost = t+ TollCharge;
//     return TotalCost;
//    }


//     public static void main(String[] args){
//         getTravelDetails();
//         double t=calculateCost(distance, Mileage, Fuelprice);
//         double s=calculateCost(t,TollCharge);
//         System.out.println("Fuel cost = "+(int)Math.ceil(t));
//         System.out.println("Total Cost = "+(int)Math.ceil(s));
//     }
// }
//=========================                    Question - 3.                ===================================

import java.util.Scanner;

public class TopBrainsPractice {
    //static int user;
    static int steps;
    static double weight;

    public static void inputSteps(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your steps:--");
        steps=sc.nextInt();
       // double calories=steps*0.04;
       System.out.println("Enter your weight:--");
       weight=sc.nextDouble();

    }
    public static double calculateCalories(double steps){
        double calories= steps*0.04;
        return calories;
    }
    public static double calculateCalories(double steps, double weight){
        double cal= steps*weight*0.0005;
        return cal;
    }
    public static void showSummary(double c){
        System.out.println("Total Steps: "+steps);
        System.out.println("Calories Burned: "+Math.round(c));
    } 

    public static void main(String[] args) {
        inputSteps();
        calculateCalories(steps);
       double c= calculateCalories(steps,weight);
        showSummary(c);
    }

    
}