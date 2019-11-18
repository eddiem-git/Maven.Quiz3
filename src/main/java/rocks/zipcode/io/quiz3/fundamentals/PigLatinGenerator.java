package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {String output = "";
    StringBuilder sb = new StringBuilder();
    List<String> words = Arrays.asList(str.split(" "));
        for (String word : words) {
        sb.append(translateWord(word)).append(" ");
    }

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
}

    private String translateWord(String word) {
        return null;
    }
    }
