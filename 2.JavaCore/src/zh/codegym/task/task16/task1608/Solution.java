package zh.codegym.task.task16.task1608;

/* 
政治辩论中的学问
*/

public class Solution {

    public static int totalSpeechCount = 200;
    public static int utterancesPerSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician chump = new Politician("笨蛋");
        chump.join();
        Politician dustbin = new Politician("垃圾箱");
        Politician schooner = new Politician("大篷车");
//        chump.join();

        while (chump.getSpeechCount() + dustbin.getSpeechCount()
                + schooner.getSpeechCount() < totalSpeechCount) {
/*            chump.start();

            dustbin.start();
            dustbin.join();
            schooner.start();*/
        }

        System.out.println(chump);
        System.out.println(dustbin);
        System.out.println(schooner);
    }

    public static class Politician extends Thread {

        private volatile int utteranceCount;

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s 说了 %d 次", getName(), getSpeechCount());
        }
    }
}

