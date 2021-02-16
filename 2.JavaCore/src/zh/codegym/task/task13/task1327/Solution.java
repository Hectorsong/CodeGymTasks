package zh.codegym.task.task13.task1327;

import java.util.ArrayList;
import java.util.List;

/* 
萝卜
*/

public class Solution {

    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("萝卜"));
        plot.add(new Person("爷爷"));
        plot.add(new Person("奶奶"));
        plot.add(new Person("孙女"));
        TurnipStory.tell(plot);
    }
}
