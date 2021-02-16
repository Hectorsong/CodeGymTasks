package zh.codegym.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 10000 次插入所需的时间
测量对每个列表执行 10000 次插入所需的时间。
getInsertTimeInMs 方法必须返回其执行时间，以毫秒表示。
Requirements:
1. 程序应在屏幕上显示数字。
2. main 方法只能调用两次 getInsertTimeInMs 方法。
3. insert10000(List list) 方法必须向列表中插入 10000 个项目。
4. getInsertTimeInMs 方法应只调用一次 insert10000 方法。
5. getInsertTimeInMs 方法应返回对列表执行 10000 次插入所需的时间（以毫秒表示）。
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // 在此编写你的代码
        Date currentTime = new Date();
        insert10000(list);
        // 在此编写你的代码
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
//            list.add(i, new Object()); //此处相当于ArrayList在末尾add，速度与LinkedList一致。
        }
    }
}
