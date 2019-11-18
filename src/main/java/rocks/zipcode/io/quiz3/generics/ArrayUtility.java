package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        //Go through the array with SomeType of type
        for (SomeType type : array) {
            //if the number that occurs of SomeType is NOT divisible by 2
            if (getNumberOfOccurrences(type) % 2 != 0) {
                return type;
            }
        }return null;
    }

    public SomeType findEvenOccurringValue() {
        //Go through the array with SomeType of type
        for (SomeType type : array) {
            //if the number that occurs of SomeType is divisible by 2
            if (getNumberOfOccurrences(type) % 2 == 0) {
                return type;
            }
        }return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int counter = 0;
        //Go through the array with SomeType of type
        for (SomeType type : array) {
            //if the value = type in the array
            if (valueToEvaluate.equals(type)) {
                //iterate
                counter++;
            }
        }return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
