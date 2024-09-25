package test.debug;

/**
 * @description:
 * @Title: Test
 * @Package debug
 * @Author 芝士汉堡
 * @Date 2024/6/6 21:48
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // 启动线程
    }

}
