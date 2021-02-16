package zh.codegym.task.task14.task1411;

public interface Person {

    class User implements Person {
        void live() {
            System.out.println("我如同行尸走肉。");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("我什么都不做。");
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("我会写代码。");
        }
    }

    class Programmer implements Person {
        void enjoy() {
            System.out.println("这是美好的生活！");
        }
    }
}
