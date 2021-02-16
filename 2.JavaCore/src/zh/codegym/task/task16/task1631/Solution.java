package zh.codegym.task.task16.task1631;

import zh.codegym.task.task16.task1631.common.ImageReader;
import zh.codegym.task.task16.task1631.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
//        System.out.println(reader.getClass());
    }
}
