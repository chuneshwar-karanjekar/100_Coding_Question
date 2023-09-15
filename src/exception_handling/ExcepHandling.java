package exception_handling;

import java.util.Scanner;

public class ExcepHandling {

    public static void main(String[] args) {
//        SimpleTryCatch sp = new SimpleTryCatch();
//        sp.test();
        TryCatchWithFinaly tf = new TryCatchWithFinaly();
        tf.test1();

    }
}

class  SimpleTryCatch {
    public  void test(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int a = 123;
        try {
            int divide = a / num;
            System.out.println("divide number output :" + divide);
        }catch (ArithmeticException e){
            System.out.println("Not Vailid number ");
        }
    }

}
class TryCatchWithFinaly {

    public void test1() {

        try {
            int divide = 22/8;
            System.out.println("divide number output :" + divide);
        } catch (ArithmeticException e) {
            System.out.println("Not Vailid number ");
        }
        finally {
            System.out.println("This statement always executed !!!");
        }

    }
}
class TryCatchWithThrow{
    public void withThrow(){

    }
}