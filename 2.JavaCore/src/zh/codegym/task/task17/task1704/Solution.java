package zh.codegym.task.task17.task1704;

import java.util.ArrayList;
import java.util.List;

/*
 •	addNote() 方法应将注释添加到 notes 列表。
•	removeNote() 方法必须从 notes 列表中删除注释。
•	addNote() 方法必须为 synchronized。
•	removeNote() 方法必须为 synchronized。
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<>();

        public synchronized void addNote(int index, String note) {
            System.out.println("注释 [" + note + "] 现在添加到位置 " + index);
            notes.add(index, note);
            System.out.println("注释 [" + note + "] 已添加");
        }

        public synchronized void removeNote(int index) {
            System.out.println("现在注释将从此位置删除：" + index);
            String note = notes.remove(index);
            System.out.println("注释 [" + note + "] 已从此位置删除：" + index);
        }
    }
}