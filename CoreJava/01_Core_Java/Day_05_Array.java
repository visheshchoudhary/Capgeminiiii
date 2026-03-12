/*

array is the fixed size which store same type data homogenous  

*/

// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of array:--");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Result:--");
//         Arrays.sort(arr);   
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


///////////////////////////////
/// 
/// 
// /// 

// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of array:--");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Result:--");
//         //Arrays.sort(arr);   
//         int i=0;
//         int j=n-1;
//         while(i<j){
//             if(arr[i]!=arr[j]){
//                 System.out.println("not pali");
//             }
//             i++;
//             j--;
//         }
//         System.out.println("pali");
//     }
// }


//////////////////////////////////////////
/// 
/// 


// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the size of second array:--");
//         int n2=sc.nextInt();
//         int[] arr2=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr2[i]=sc.nextInt();
//         }
//         System.out.println("Result:--");
//         int i=0;
//         int j=0;
//         while(i<j){
//             if(arr[i]!=arr2[j]){
//                 System.out.println("not same");
//             }
//             i++;
//             j++;
//         }
//         System.out.println("same");
//     }
// }




/////////////////////////////////////////////////////////
/// 
/// 
/// 

// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         char[] arr=new char[n];
//         for(int i=0;i<arr.length;i++){
//             System.out.println("Enter "+(i+1)+" char");
//             arr[i]=sc.next().charAt(0);
//         }
        
//         System.out.println("Result:--");
//         int i=0;
//         int j=n-1;
//         while(i<j){
//             if(arr[i]!=arr[j]){
//                 System.out.println("not pali");
//             }
//             i++;
//             j--;
//         }
//         System.out.println("pali");
//     }
// }



//////////////////////////////////
/// 
/// 
/// 

// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             System.out.println("Enter "+(i+1));
//             arr[i]=sc.nextInt();
//         }
        
//         System.out.println("Result:--");
//         int i=0;
//         int j=n-1;
//         while(i<j){
//             int a=arr[i];
//             arr[i]=arr[j];
//             arr[j]=a;
//             i++;
//             j--;
//         }
//         for(int k=0;k<arr.length;k++){
//             System.out.println(arr[k]);
//         }
     
//     }
// }


////////////////////////////////////////////
/// 
/// 
/// 

// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             System.out.println("Enter "+(i+1));
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the size of second array:--");
//         int n2=sc.nextInt();
//         int[] arr2=new int[n];
//         for(int i=0;i<arr.length;i++){
//             System.out.println("Enter "+(i+1));
//             arr2[i]=sc.nextInt();
//         }
        
//         System.out.println("Result:--");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n2;j++){
//                 if(arr[i]!=arr2[j]){
//                     System.out.println("all are not present in array2");
//                     break;
//                 }

//             }
//         }
//         System.out.println("all are present");        
//     }
// }








// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             System.out.println("Enter "+(i+1));
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Result:--");
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 int c=arr[i]+arr[j];
//                 if(c==10){
//                     System.out.println("Pair whose sum is 10:--("+arr[i]+","+arr[j]+")");
//                 }

//             }
//         }
//     }
// }


/////////////////////////////////////////////////


//*******************************---------------____Pattern_Printing_____________------------------****************************** */



// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                System.out.print("*");

//             }
//             System.out.println();
//         }
//     }
// }


/////////////////////////////////////////////////////
/// 



// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                System.out.print(j+1);

//             }
//             System.out.println();
//         }
//     }
// }


////////////////////////////////////////////////////////
/// 



// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
//         for(int j=n;j>=0;j--){
//             for(int i=0;i<n;i++){
//                System.out.print(j+1);

//             }
//             System.out.println();
//         }
//     }
// }




// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
//         int a=1;
//         for(int j=0;j<n;j++){
//             for(int i=0;i<n;i++){
//                System.out.print(a+" ");
//                a++;
//             }
//             System.out.println();
//         }
//     }
// }


////////////////////////////////////////////////
/// 
/// 
/// 
/// 


// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
//         int a=1;
//         for(int j=0;j<n;j++){
//             for(int i=0;i<n;i++){
//                System.out.print(a+" ");
//                a++;
//                if(a>9){
//                 a=1;
//                }
//             }
//             System.out.println();
//         }
//     }
// }



///////////////////////////////
/// 
/// 
/// 
/// 
/// 

// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
       
//         for(int j=0;j<n;j++){
//              char a='A';
//             for(int i=0;i<n;i++){
//                System.out.print(a);
//                a++;
//             }
//             System.out.println();
//         }
//     }
// }




// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
//        char a='Z';
//         for(int j=0;j<n;j++){
//             for(int i=0;i<n;i++){
//                System.out.print(a);
//             }
//             a--;
//             System.out.println();
//         }
//     }
// }





// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
       
//         for(int j=0;j<n;j++){
//             char a='Z';
//             for(int i=0;i<n;i++){
//                System.out.print(a);
//                a--;
//             }
            
//             System.out.println();
//         }
//     }
// }





// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
//        int a=1;
//         for(int j=0;j<n;j++){
//             int a = (j%2==0)?1:0; 
//             for(int i=0;i<n;i++){
//                 if((i+j)%2==0) {
//                  System.out.print(a);
//                 } else {
//                     System.out.print("0");
//                 }
//                 // if(a==1){
//                 //     a=0;
//                 // }else{
//                 //     a=1;
//                 // }


//             }
            
//             System.out.println();
//         }
//     }
// }







// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
       
//         for(int j=0;j<n;j++){
//         int a=1;
//             for(int i=0;i<j;i++){
//                System.out.print(a);
//                a++;
//             }
            
//             System.out.println();
//         }
//     }
// }


//////////////////////////////////////////
/// 
/// 
/// 




// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of first array:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
       
//         for(int j=0;j<n;j++){
//         int a=5;
//             for(int i=0;i<j;i++){
//                System.out.print(a);
//                a--;
//             }
            
//             System.out.println();
//         }
//     }
// }


//////////////////////////////////////////////////////////////


// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
//         char a='L';
//         for(int j=0;j<n;j++){
            
//             for(int i=0;i<j;i++){
//                System.out.print(a+" ");
//                a++;
//             }
//             System.out.println();
//         }
//     }
// }


//////////////////////////////////////////////////////////////////////////////////////////////
/// 



// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
//         for(int j=0;j<n;j++){
//             for(int i=0;i<j;i++){
//                 int a=(i%2==0) ? 1 : 0;
//                System.out.print(a+" ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////
/// 
/// 

// import java.util.*;
// public class Day_05_Array {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no:--");
//         int n=sc.nextInt();
//         System.out.println("Result:--");
//         for(int j=0;j<n;j++){
//             for(int i=0;i<j;i++){
//             int a=(i%2==0) ? 1 : 0;
//                System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }