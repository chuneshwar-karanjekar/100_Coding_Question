package threading_practice;

//Java Thread Example by extending Thread class
public class Thread1  extends  Thread{
    @Override
    public void run() {
        System.out.println("This is Thread");
    }

    public static void main(String[] args) {
        Thread1 th = new Thread1();
        th.start();

    }
}
