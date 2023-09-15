package threading_practice;

// Java Thread Example by implementing Runnable interface
public class RunnablePractice{

    public static void main(String[] args) {
        Test t = new Test();
        Thread th = new Thread(t); // Using the constructor Thread(Runnable r)
        th.start();
    }

}
class  Test implements  Runnable{
    @Override
    public void run() {
        System.out.println("This is the Runnable interface");
    }
}