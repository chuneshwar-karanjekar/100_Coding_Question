
package basic_Programs;

import java.util.Scanner;

/**
 * Odd_and_Even
 */
public class Odd_and_Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Your Number is Even + ");
        }
        else{
            System.out.println("Your Number is Odd - ");
        }

    }
}