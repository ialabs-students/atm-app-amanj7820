//1)Equal four numbers

// import java.util.*;
// class Main {
//   public static void main(String[] args) {
//    Scanner sc= new Scanner(System.in);
// 		System.out.println("Enter Numbers: ");
// 		int a=sc.nextInt();
// 		int b=sc.nextInt();
// 		int c=sc.nextInt();
// 		int d=sc.nextInt();
// 		if(a==b) {
// 			if(b==c){
// 				if(c==d) {
// 			System.out.println("Equal");
// 				}
// 				}	
// 		}
// 		else {
// 			System.out.println("Not Equal");
// 		}

//   }
// }

//2)two double variables and test if both strictly between 0 and 1 and false otherwise.

// import java.util.*;

// public class Main{

// 	public static void main(String[] args) {
		
// 		      Scanner sc = new Scanner(System.in);
//           System.out.println("Input the 1st number");
//           double s = sc.nextDouble();
//           System.out.println("Input the 2nd number");
//           double t = sc.nextDouble();
//           if ((s>0.0 && s < 1.0) && (t>0.0 && t < 1.0))
//           {
//               System.out.println("true");
//           }
//           else
//           {
//               System.out.println("false");
//           }

// 	}

// }

//3)find the k largest elements in a given array. Elements in the array can be in any order

// import java.util.*;
// public class Main{

// 	public static void main(String[] args) {
// 		int arr[] = new int[] { 9, 3, 6, 7, 45 };
// 		int arrayLength=arr.length;
// 		int k=3;
// 		Arrays.sort(arr);
// 		System.out.println(arr[arrayLength-k]);
// }

// }

//4) Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

// public class Main{

// 	public static void main(String[] args) {
// 		int sum=0;
// 		for(int i =1;i<1000;i++) {
// 			sum+=i;
// 		}
// 		System.out.println(sum);
// }
// }


//5)Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).

// import java.util.*;
// public class Main{

// 	public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.print("Input 1st integer: ");
//     int firstInt = in.nextInt();
//     System.out.print("Input 2nd integer: ");
//     int secondInt = in.nextInt();

//         System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
//         System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
//         System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
//         System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
//         System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
//         System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
//         System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));
//     }
// }

//6)Write java program to get a number from the user and print whether it is positive or negative

// import java.util.*;
// public class Main{

// 	public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int a=in.nextInt();
//     if(a>=0){
//       System.out.println("Positive");
//     }
//     else{
//       System.out.println("Negative");
//     }
//     }
// }

//7) Take three numbers from the user and print the greatest number

// import java.util.*;
// public class Main{

// 	public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.print("Input the 1st number: ");
//     int num1 = in.nextInt();
   
//   System.out.print("Input the 2nd number: ");
//   int num2 = in.nextInt();
   
//   System.out.print("Input the 3rd number: ");
//   int num3 = in.nextInt();
   
   
//   if (num1 > num2)
//    if (num1 > num3)
//     System.out.println("The greatest: " + num1);
   
//   if (num2 > num1)
//    if (num2 > num3)
//     System.out.println("The greatest: " + num2);
   
//   if (num3 > num1)
//    if (num3 > num2)
//     System.out.println("The greatest: " + num3);
//  }
// }

//8)Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

// import java.util.*;
//  public class Main{

//  	public static void main(String[] args) {
//      Scanner in = new Scanner(System.in);
//     System.out.print("Input number: ");
//         int day = in.nextInt();

//         System.out.println(getDayName(day));
//     }

//     public static String getDayName(int day) {
//         String dayName = "";
//         switch (day) {
//             case 1: dayName = "Monday"; break;
//             case 2: dayName = "Tuesday"; break;
//             case 3: dayName = "Wednesday"; break;
//             case 4: dayName = "Thursday"; break;
//             case 5: dayName = "Friday"; break;
//             case 6: dayName = "Saturday"; break;
//             case 7: dayName = "Sunday"; break;
//             default:dayName = "Invalid day range";
//         }

//         return dayName;
//     }
// }

//9)Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user 

// import java.util.*;
//  public class Main{

//  	public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.print("Input an alphabet: ");
//         String input = in.next().toLowerCase();

//         boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
//         boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
//         boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
//                 || input.equals("o") || input.equals("u");

//         if (input.length() > 1)
//         {
//             System.out.println("Error. Not a single character.");
//         }
//         else if (!(uppercase || lowercase))
//         {
//             System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
//         }
//         else if (vowels)
//         {
//             System.out.println("Input letter is Vowel");
//         }
//         else
//         {
//             System.out.println("Input letter is Consonant");
//         }
//     }
// }

//10)Write a program in Java to display the n terms of odd natural number and their sum.

// import java.util.*;
// class Main{
//   public static void main(String[] args){
//     int i,n,sum=0;

//    System.out.print("Input number of terms is: ");
// {
//    Scanner in = new Scanner(System.in);
// 		    n = in.nextInt();
//   System.out.println ("\nThe odd numbers are :");
//    for(i=1;i<=n;i++)

//    {
//      System.out.println (2*i-1);
//      sum+=2*i-1;
//    }
//    System.out.println ("The Sum of odd Natural Number upto " +n+" terms is: " +sum);

// }
// }
// }




    

