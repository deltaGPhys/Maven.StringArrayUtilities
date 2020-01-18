package com.zipcodewilmington;


import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

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
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        return Arrays.asList(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> alist = new ArrayList<String>(Arrays.asList(array));
        Collections.reverse(alist);

        return alist.toArray(new String[alist.size()]);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(array, StringArrayUtils.reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        ArrayList<String> letters = new ArrayList<>();

        for (String word : array) {
            for (String letter : word.split("")) {
                if (!letters.contains(letter.toLowerCase()) && !letter.equals(" ")) {
                    letters.add(letter.toLowerCase());
                }
            }
        }
        if (letters.size() == 26) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;

        for (String word : array) {
            if (word.equals(value)) {
                count++;
            }
        }

        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> alist = new ArrayList<String>(Arrays.asList(array));
        alist.remove(valueToRemove);
        return alist.toArray(new String[alist.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> words = new ArrayList<>();
        words.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i-1])) {
                words.add(array[i]);
            }
        }

        return words.toArray(new String[words.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> words = new ArrayList<String>();

        String current = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i-1])) {
                current += array[i];
            } else {
                words.add(current);
                current = array[i];
            }
        }
        words.add(current);

        return words.toArray(new String[words.size()]);
    }


}
