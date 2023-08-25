package Beginner;

public class Fibonacchi{
    public static void main(String[] args) {
        int a=0,b=1,c;
        for(int i=2; i<=20; i++){
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
