package basic_Programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Number :");
        int num =sc.nextInt();
        int rev = 0,temp=0;
        while(num != 0){
            temp = num %10;
            rev = rev * 10 + temp;
            num /=10;
        }
        System.out.println("reverse number :"+rev);
    }
}
