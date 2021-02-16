package zh.codegym.task.task17.task1708;

public class TestVolatile {
    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final TestVolatile test1 = new TestVolatile();
        for(int i=0;i<5;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<5;j++)
                        test1.increase();
                    System.out.println("1");
                };
            }.start();
        }

        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test1.inc);
    }
}
