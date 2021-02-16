package zh.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;

/* 
请求解析器
*/

public class Solution {
/*    public static void main(String[] args) throws IOException, URISyntaxException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        URL url = new URL(a);
        Map<String, List<String>> query_pairs = new LinkedHashMap<String, List<String>>();
        String[] pairs = url.getQuery().split("&");
        for (String pair : pairs) {
            final int idx = pair.indexOf("=");
            final String key = idx > 0 ? URLDecoder.decode(pair.substring(0, idx), "UTF-8") : pair;
            if (!query_pairs.containsKey(key)) {
                query_pairs.put(key, new LinkedList<String>());
            }
            final String value = idx > 0 && pair.length() > idx + 1 ? URLDecoder.decode(pair.substring(idx + 1), "UTF-8") : null;
            query_pairs.get(key).add(value);
        }
        for (Map.Entry<String, List<String>> entry : query_pairs.entrySet()) {
            System.out.print(entry.getKey()+" ");
        }
        for (Map.Entry<String, List<String>> entry : query_pairs.entrySet()) {
            if (entry.getKey().equals("obj")) {
                try {
                    double dubleNum = Double.parseDouble(entry.getValue().get(0));
                    alert(dubleNum);
                    continue;
                } catch (Exception ee) {
                    alert(entry.getValue().get(0));
                }
            }
        }
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String paramsSubString = url.substring(url.lastIndexOf("?") + 1);
        String[] splitParams = paramsSubString.split("&");
        String objValue = null;

        StringBuilder resultBuilder = new StringBuilder();
        for (String splitParam : splitParams) {
            String[] paramAndValue = splitParam.split("=");
            resultBuilder.append(paramAndValue[0]);
            resultBuilder.append(" ");

            if(paramAndValue[0].equals("obj")) {
                objValue = paramAndValue[1];
            }
        }

        System.out.println(resultBuilder.toString().trim());

        if (objValue != null) {
            try {
                alert(Double.parseDouble(objValue));
            } catch (NumberFormatException nfe) {
                alert(objValue);
            }
        }
    }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
