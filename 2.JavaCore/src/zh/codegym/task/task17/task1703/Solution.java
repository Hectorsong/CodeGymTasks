package zh.codegym.task.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
同步的注释
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<>();

        public void addNote(int index, String note) {
            System.out.println("注释 [" + note + "] 现在添加到位置 " + index);
            synchronized (notes){
                notes.add(index, note);
            }
            System.out.println("注释 [" + note + "] 已添加");
        }

        public void removeNote(int index) {
            System.out.println("现在注释将从此位置删除：" + index);
            String note;
            synchronized(notes){
                note = notes.remove(index);
            }
            System.out.println("注释 [" + note + "] 已从此位置删除：" + index);
        }
    }
}
