package zh.codegym.task.task14.task1414;

/* 
电影工厂
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;

        while (true){
            string = bufferedReader.readLine();
            boolean u = string.equals("cartoon") || string.equals("thriller") || string.equals("soapOpera");
            if (!u){
                Movie movie = MovieFactory.getMovie(string);
                break;
            }else {
                Movie movie = MovieFactory.getMovie(string);
                System.out.println(movie.getClass().getSimpleName());
            }
        }
        /*
            8.在 Movie 类中创建变量 movie，并针对每个输入的字符串（键）:
            8.1.使用 MovieFactory.getMovie 获取对象并将其赋给变量 movie。
            8.2.显示调用 movie.getClass().getSimpleName() 的结果。
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // 为键“soapOpera”创建 SoapOpera 对象
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }else if ("thriller".equals(key)){
                movie = new Thriller();
            }else if ("cartoon".equals(key)){
                movie = new Cartoon();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }
    static class Cartoon extends Movie {
    }
    static class Thriller extends Movie {
    }
}
