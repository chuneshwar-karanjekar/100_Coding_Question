package basic_Programs;

import java.util.Scanner;

public class PalimdromNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Number :");
        int num =sc.nextInt();
        int rem =0, temp=num, temp2=0;
        //int []arr = new int[num];
        //int n = arr.length;
        while (temp != 0){
            rem = temp%10;
            temp2 = temp2 * 10 +rem;
            temp /= 10;
        }
        if(num == temp2){
            System.out.println("it is palindrome !!");
        }else {
            System.out.println("it is not a valid number");
        }

    }
}
