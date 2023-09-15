package exception_handling;

import java.util.Scanner;

public class TestThrow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student roll number :");
        int roll = sc.nextInt();
        try {
            if (roll < 0) {
                throw new ArithmeticException("roll number can't be negative");
            } else
                System.out.println("student roll number is:" + roll);
        }catch (ArithmeticException e){
            System.out.print(e.getMessage());
        }
    }
}
