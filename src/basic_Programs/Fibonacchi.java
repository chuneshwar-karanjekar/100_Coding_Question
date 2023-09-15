package basic_Programs;

import java.util.Scanner;

public class Fibonacchi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num = sc.nextInt();
        int a = 0, b = 1;
        int nextNum = 0;

        for (int i = 2; i <= num; i++) {
            nextNum = a + b;
            a = b;
            b = nextNum;
            System.out.println(nextNum);
        }

    }
}
