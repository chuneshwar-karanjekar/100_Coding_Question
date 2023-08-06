package Beginner;
import java.util.Scanner;

/**
 * Sum_Of_N_Natural_Number
 */
public class Sum_Of_N_Natural_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Natural Number :");
        int num = sc.nextInt();
        int result = get_sum(num);
/* 
  Method 1:  This is using formula
         result = num*(num+1)/2;
         System.out.println("Sum of your Naturals : "+result);
*/

/*  Method 2: using loop
         for (int i=0; i<=num; i++){
            result = num+i;
         }
         System.out.println("Sum of your Naturals : "+result);
*/
/*  Method 3 :Using recursion
        1. Initialize the required variables.
        2. Define a recursive function with base case as num == 0.
        3. Set recursive step call as num + recursum(num-1).
        4. Call the recursive function and print the value returned by the function.
*/ 
     System.out.println("Sum of your Naturals : "+result);
    
    }
      static int get_sum(int num){
        if(num == 0)
        return num;

        return num + get_sum(num-1);
        
    }

}