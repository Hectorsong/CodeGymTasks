package zh.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
巩固单例模式
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = bufferedReader.readLine();
            if (str.equals(Planet.EARTH)){
                thePlanet = Earth.getInstance();
            }else if(str.equals(Planet.MOON)){
                thePlanet = Moon.getInstance();
            }else if(str.equals(Planet.SUN)){
                thePlanet = Sun.getInstance();
            }else thePlanet = null;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
