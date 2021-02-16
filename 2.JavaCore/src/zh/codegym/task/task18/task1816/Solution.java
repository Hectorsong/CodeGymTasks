package zh.codegym.task.task18.task1816;

/* 
ABC
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    private final static Character[] ENGLISH_CHARACTERS_ARRAYS = new Character[] {
            'A','B','C','D','E','F','G','H','I','J','K','L',
            'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
            'a','b','c','d','e','f','g','h','i','j','k','l','m',
            'n','o','p','q','r','s','t','u','v','w','x','y','z'
    };

    private final static Set<Character> ENGLISH_CHARACTERS= new HashSet<>(Arrays.asList(ENGLISH_CHARACTERS_ARRAYS));

    public static void main(String[] args) throws IOException {
        int countOfEnglishCharacters = 0;
        try (FileReader fileReader = new FileReader(args[0])){
            while (fileReader.ready()){
                char temp = (char) fileReader.read();
                if (ENGLISH_CHARACTERS.contains(temp)) countOfEnglishCharacters++;
            }
        }
        System.out.println(countOfEnglishCharacters);

    }
}
