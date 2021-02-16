package zh.codegym.task.task09.task0924;
import java.util.ArrayList;
/* 恐怖故事
1.过去这个故事有五个类：小红帽、祖母、派、樵夫和狼。
2.每个类有 2 个字段：ArrayList killed 和 ArrayList ate。
3.创建所需的对象（红帽、祖母等）。
4.按照旧版“小红帽”故事中谁吃了谁/或杀死了谁的逻辑正确安排人际关系。
另注：没人吃派。它只是装在一个篮子里。狼吃了一点。然后它被杀了。
Requirements:
1. main 方法应更改狼对象的状态（内部变量）。
2. main 方法应更改樵夫对象的状态（内部变量）。
3. 没人吃派。
4. 狼吃了一点。
5. 然后狼被杀了。
*/
public class Solution {
    public static RedRidingHood hood = new RedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Pie pie = new Pie();
    public static Woodcutter woodcutter = new Woodcutter();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);
        woodcutter.killed.add(wolf);
    }

    // 小红帽
    public static class RedRidingHood extends StoryItem {
    }

    // 祖母
    public static class Grandmother extends StoryItem {
    }

    // 派
    public static class Pie extends StoryItem {
    }

    // 樵夫
    public static class Woodcutter extends StoryItem {
    }

    // 狼
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<>();
        public ArrayList<StoryItem> ate = new ArrayList<>();
    }
}
