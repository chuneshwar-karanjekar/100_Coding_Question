package Patterns;

import java.util.Scanner;

public class Right_Half_Pyramid_Pattern {
    static void startPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Right_Half_Pyramid_Pattern.startPattern();
    }
}
