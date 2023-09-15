package exception_handling;

import java.util.Scanner;

public class TestThrows {
    public  static  void fun() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try {
           System.out.println(num1 / num2);
        }catch (ArithmeticException e) {
            System.out.println("this is wrong");
        }
    }
    public static void main(String[] args) {
        try {
            fun();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
