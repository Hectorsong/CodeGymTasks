package zh.codegym.task.task14.task1416;

/* 
修复错误
*/

public class Solution {
    public static void main(String[] args) {
        CanSwim creature = new Orca();
        creature.swim();
        creature = new Whale();
        creature.swim();
        creature = new RiverOtter();
        creature.swim();
    }

    public static void test(CanSwim creature) {
        creature.swim();
    }

    interface CanWalk {
        void walk();
    }

    interface CanSwim {
        void swim();
    }

    static abstract class SeaCreature {
        public void swim() {
            SeaCreature currentCreature = (SeaCreature) getCurrentCreature();
            currentCreature.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " 正在游泳");
        }

        abstract CanSwim getCurrentCreature();
    }

    static class Orca extends SeaCreature implements CanSwim{
        @Override
        CanSwim getCurrentCreature() {
            return new Orca();
        }
    }

    static class Whale extends SeaCreature implements CanSwim{
        @Override
        CanSwim getCurrentCreature() {
            return new Whale();
        }

    }

    static class RiverOtter implements CanSwim, CanWalk{
        @Override
        public void walk() {

        }
        @Override
        public void swim() {

        }
    }
}
