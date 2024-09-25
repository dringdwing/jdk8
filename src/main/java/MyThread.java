public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // 启动线程
        System.out.println("Current MyThread: " + t.getName());


        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Current MyThread1: " + t1.getName());
        System.out.println(t ==t1);
    }
}