package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String str = word;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') ||
                    (str.charAt(i) == 'i') || (str.charAt(i) == 'o') ||
                    (str.charAt(i) == 'u'))
                return true;
        }
         return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return word.matches("(^[AEIOUaeiou].*$)");
    }

    public static Boolean isVowel(Character character) {
        return hasVowels(character.toString());

    }
}
