package zh.codegym.task.task15.task1511;

import java.io.Serializable;

/* 
最简单的代码：第 1 部分
*/

public class Solution {

    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("你对 com.codegym.task.task15.task1511 有什么看法？"));
        System.out.println(me.askZapp("下一次更新是什么时候？"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("我会考虑 [%s]", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}
