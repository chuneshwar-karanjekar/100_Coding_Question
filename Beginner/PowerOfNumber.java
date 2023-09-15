package Beginner;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number :");
        int num = sc.nextInt();
        System.out.println("Enter Power you want :");
        int pow = sc.nextInt();
        int temp = 1;
        for (int i = 1; i <= pow; i++) {
            temp = temp * num;
        }
        System.out.println(temp);
    }
}
