package string;

import java.util.Scanner;

public class ASCIIValueOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Charecter :");
        String n = sc.nextLine();
        char ch = n.charAt(0);
        System.out.println((int)ch);
    }
}
