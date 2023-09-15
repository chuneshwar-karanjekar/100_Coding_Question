package threading_practice;

public class ThreadPractice1 {
    public static void main(String[] args) {
        A obj = new A();
        B b = new B();
        Thread obj1 = new Thread(obj);
        Thread obj2 = new Thread(b);
        obj1.start();
        obj2.start();

    }
}
class  A extends  Thread{
    @Override
    public void run() {
        System.out.println("This is a normal thread.");

    }

    public  void  print() {
        for (int i = 1; i < 5; i++)
            System.out.println("i= " + i);
    }
}
class  B extends A {
    @Override
    public void run() {
        print2();
        super.print();
    }

    public  void  print2() {
        for (int j = 1; j < 5; j++)
            System.out.println("i= " + j);
    }
}
