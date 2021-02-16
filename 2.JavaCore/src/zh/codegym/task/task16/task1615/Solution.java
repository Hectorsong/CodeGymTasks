package zh.codegym.task.task16.task1615;

/* 
机场
*/

public class Solution {

    public static volatile Runway RUNWAY = new Runway();   // 1 号跑道

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Plane #1");
        Plane plane2 = new Plane("Plane #2");
        Plane plane3 = new Plane("Plane #3");
    }

    private static void waitForTakeoff() {
        // 在此编写你的代码
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored){
        }
    }

    private static void takeOff() {
        // 修复此方法
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean hasAlreadyTakenOff = false;
            while (!hasAlreadyTakenOff) {
                if (RUNWAY.trySetCurrentPlane(this)) {    //如果此跑道可用，我们将使用
                    System.out.println(getName() + " 正在起飞");
                    takeOff();// 正在起飞
                    System.out.println(getName() +" 已起飞");
                    hasAlreadyTakenOff = true;
                    RUNWAY.setCurrentPlane(null);
                } else if (!this.equals(RUNWAY.getCurrentPlane())) {  // 如果跑道被飞机占据
                    System.out.println(getName() + " 正在等待");
                    waitForTakeoff(); // 正在等待
                }
            }
        }
    }

    public static class Runway {
        private Thread t;
        public Thread getCurrentPlane() {
            return t;
        }

        public void setCurrentPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }
        public boolean trySetCurrentPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

