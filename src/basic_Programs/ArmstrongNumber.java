package basic_Programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Number :");
        int num =sc.nextInt(); //153
        int rem=0,temp=0,res=0;
        while (num !=0){
            rem = num%10; //5
            temp = rem*rem*rem; //125
            res = res+temp; // 27+125
            num /= 10; //1

        }
        if(res == num) {
            System.out.println("it is vaild");
        }else {
            System.out.println("not vaild "+res);
        }
    }
}
