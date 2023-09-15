package basic_Programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int num = sc.nextInt();
        int temp = 0;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                temp += i;
            }
        }
        if (temp > 0) {
            System.out.println("not prime number");
        } else {
            System.out.println("it is prime number");
        }
    }
}
