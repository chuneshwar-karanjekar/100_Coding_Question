package basic_Programs;

import java.util.Scanner;

public class Fibbonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        int a=0,b=1,next=0;
        for(int i=0; i<num; i++) {
            next = a + b;
            a = b;
            b = next;
            System.out.println(next);
        }

    }
}
