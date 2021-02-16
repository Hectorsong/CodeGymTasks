package zh.codegym.task.task06.task0605;


import java.io.*;

/* 控制体重
程序应读取用户输入的体重（公斤）和身高（米）。然后显示有关用户体重指数的消息。
在 Body 类中实现一个 static 方法。该方法应计算体重指数并显示以下消息：
“体重不足：BMI < 18.5”- 如果体重指数低于 18.5，
“体重正常：18.5 <= BMI < 25”- 如果体重指数介于 18.5 和 25（不含）之间，
“超重：25 <= BMI < 30”- 如果体重指数介于 25 和 30（不含）之间，
“肥胖：BMI >= 30”- 如果体重指数大于或等于 30。
提示：
体重指数 (BMI) = 体重（公斤）/（身高米数 * 身高米数）
68.4 和 1.77 的示例输出：
体重正常：18.5 <= BMI < 25
Requirements:
1. calculateBMI 方法应在屏幕上显示文本。
2. 如果体重指数低于 18.5（不含），calculateBMI 方法应显示“体重不足：BMI < 18.5”。
3. 如果体重指数介于 18.5 和 25（不含）之间，calculateBMI 方法应显示：“体重正常：18.5 <= BMI < 25”。
4. 如果体重指数介于 25 和 30（不含）之间，calculateBMI 方法应显示“超重：25 <= BMI < 30”。
5. 如果体重指数大于或等于 30，calculateBMI 方法应显示“肥胖：BMI >= 30”。*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateBMI(weight, height);
    }

    public static class Body {
        public static void calculateBMI(double weight, double height) {
            // 在此编写你的代码
            double BMI = weight / height / height;
            if (BMI < 18.5){
                System.out.println("体重不足：BMI < 18.5");
            }else if (BMI >= 18.5 && BMI < 25){
                System.out.println("体重正常：18.5 <= BMI < 25");
            }else if (BMI >= 25 && BMI < 30){
                System.out.println("超重：25 <= BMI < 30");
            }else if (BMI >= 30){
                System.out.println("肥胖：BMI >= 30");
            }
        }
    }
}
