package zh.codegym.task.task16.task1601;

/* 
我的第一个线程
*/

public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable{
        @Override
        public void run() {
            System.out.println("我的第一个线程");
        }
    }
}

class Test1{
    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");
    }
    static void pong() {
        System.out.print("pang");
    }
}

class Test2{
    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.start();
        System.out.print("ping");
    }
    static void pong() {
        System.out.print("pang");
    }
}
/*
1。start():
先来看看Java API中对于该方法的介绍：
使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
结果是两个线程并发地运行；当前线程（从调用返回给 start 方法）和另一个线程（执行其 run 方法）。
多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
用start方法来启动线程，真正实现了多线程运行，这时无需等待run方法体中的代码执行完毕而直接继续执行后续的代码。
通过调用Thread类的 start()方法来启动一个线程，这时此线程处于就绪（可运行）状态，并没有运行，一旦得到cpu时间片，
就开始执行run()方法，这里的run()方法 称为线程体，它包含了要执行的这个线程的内容，Run方法运行结束，此线程随即终止。

2。run():
同样先看看Java API中对该方法的介绍：
如果该线程是使用独立的 Runnable 运行对象构造的，则调用该 Runnable 对象的 run 方法；否则，该方法不执行任何操作并返回。
Thread 的子类应该重写该方法。
run()方法只是类的一个普通方法而已，如果直接调用Run方法，程序中依然只有主线程这一个线程，其程序执行路径还是只有一条，
还是要顺序执行，还是要等待run方法体执行完毕后才可继续执行下面的代码，这样就没有达到写线程的目的。

3。总结：
调用start方法方可启动线程，而run方法只是thread类中的一个普通方法调用，还是在主线程里执行。
* */
