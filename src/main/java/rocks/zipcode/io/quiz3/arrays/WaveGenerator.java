package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    //GOOGLED
    public static String[] wave(String str) {
        String[] strings = new String[0];
        List<String> list = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < str.length(); currentIndex++) {
            if (Character.isLetter((str.charAt(currentIndex)))) {
                String cappedString = StringUtils.capitalizeNthCharacter(str, currentIndex);
                list.add(cappedString);
            }
            strings = list.stream().toArray(String[]::new);
        } return strings;
    }
}
