package basic_Programs;

import java.util.Scanner;

/**
 *  calculate Area Of Ractangle
 */
public class AreaOfRactangle {

    public void calculateArea(int h, int w){
        int area = h * w;
        System.out.println("Area of ractangle is :"+area);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Height = sc.nextInt();
    int Width  = sc.nextInt();

    AreaOfRactangle foo = new AreaOfRactangle();
    foo.calculateArea(Height, Width);

    }
}