package Patterns;

import java.util.Scanner;

public class LeftHalfPyramidPattern {
    static void startPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        LeftHalfPyramidPattern.startPattern();
    }
}
