package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
       return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        List<String> inputArrayAsList = new ArrayList<>(Arrays.asList(array));
        return inputArrayAsList.contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO

   //The below works, but I actually hate it. I'm sure there's a better way... Core Java had something on this.
    public static String[] reverse(String[] array) {
        List<String> inputArrayAsList = new ArrayList<>(Arrays.asList(array));
        Collections.reverse(inputArrayAsList);
        String[] reversedArray = inputArrayAsList.toArray(new String[inputArrayAsList.size()]);
        return reversedArray;
//        String[] reversedArray = new String[array.length];
//        int inputArrayHighestIndex = array.length - 1;
//        int newArrayIndexWrite = 0;
//        for (int i = inputArrayHighestIndex; i >=0; i--) {
//            reversedArray[newArrayIndexWrite] = array[i];
//            newArrayIndexWrite++;
//        }
//        System.out.println(reversedArray);
//        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean isPalindrome = Arrays.equals(array, StringArrayUtils.reverse(array));
        return isPalindrome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        String inputArray = Arrays.toString(array).toLowerCase();
        for (int i = 0; i < 25; i++) {
            if (!inputArray.contains(alphabet[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrenceCounter = 0;
        for (int i = 0; i <array.length; i++) {
            if (value == array[i]){occurrenceCounter++;}
        }
        return occurrenceCounter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        List<String> builtArray = new ArrayList<>();
        builtArray.add(array[0]);
        String lastString = array[0];

        for (int i = 1; i <array.length; i++) {
            if (array[i] != lastString) {
                builtArray.add(array[i]);
            }
            lastString = array[i];
        }
        String[] arrayConsecutiveDoublesRemoved = builtArray.toArray(new String[builtArray.size()]);
//        String[] arrayConsecutiveDoublesRemoved = new String[builtArray.size()];

        return arrayConsecutiveDoublesRemoved;

//        List<String> inputArrayAsList = new ArrayList<>(Arrays.asList(array));
//        int inputSize = inputArrayAsList.size();
//        for (int i = 0; i < inputArrayAsList.size(); i++) {
//            String currentIndex = inputArrayAsList.get(i);
//            String nextIndex = inputArrayAsList.get(i + 1);
//            if (i == inputArrayAsList.size() - 1) {
//                return null;
//            }
//            if (currentIndex.equals(nextIndex)){
//                inputArrayAsList.remove(nextIndex);
//                i--;
//            }
//        }
//        String[] alteredString = new String[inputArrayAsList.size()];
//        return alteredString;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
