package zh.codegym.task.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
注意
*/

public class Solution {

    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class NoteThread extends Thread{
        public void run(){
            try {
                for (int i = 0; i < 1000; i++) {
                    Note.addNote(this.getName() + "-注释" + i);
                    Thread.sleep(1);
                    Note.removeNote(this.getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Note {

        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("另一个线程已删除我们的注释");
            } else if (!note.startsWith(threadName)) {
                System.out.println("线程 [" + threadName + "] 已删除其他人的注释 [" + note + "]");
            } else {
                System.out.println("线程 [" + threadName + "] 已删除自己的注释 [" + note + "]");
            }
        }
    }
}
