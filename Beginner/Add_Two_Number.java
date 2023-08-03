package Beginner;

import java.util.Scanner;
/**
 * Add_Two_Number
 */
public class Add_Two_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = num1+num2;
        System.out.println("After Adding your number is :"+result);
    }
}