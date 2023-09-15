package basic_Programs;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number :");
        int num = sc.nextInt();
        int temp = 1;
        for (int i = 1; i <= num; i++) {
            temp = temp * i;
        }
        System.out.println(temp);
    }
}
