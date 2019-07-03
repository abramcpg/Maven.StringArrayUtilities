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
        int length = array.length;
        return array[length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int length = array.length;
        return array[length-2];
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
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        return (String[]) list.toArray();
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        Boolean isPalindrome = false;
        Integer length = array.length;
        if (length % 2 != 0) isPalindrome = true;
        return isPalindrome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        ArrayList<String> alphabet = new ArrayList<String>();
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            String[] letterArr = array[i].replaceAll("\\s","").split("");
            for (int j = 0; j < letterArr.length ; j++) {
                String letter = letterArr[j];
                if (!alphabet.contains(letter.toLowerCase())){
                    alphabet.add(letter.toLowerCase());
                }
            }
        }
        if ((alphabet.size()) == 26)return true;
        else return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].contains(value))count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray = new String[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(!array[i].equals(valueToRemove)){
                newArray[count] = array[i];
                count++;
            }
        }

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList<String>();
        for (int i = 0; i < array.length-1; i++) {
            if(!array[i].equals(array[i+1])){
                newArray.add(array[i]);
            }
        }
        newArray.add(array[array.length -1]);
        String[] stringArray = newArray.toArray(new String[newArray.size()]);
        return stringArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String output = "";
        for (int i = 1; i < array.length; i++) {
            if(array[i].equals(array[i-1])) {
                output += array[i - 1];
            }else{
                output += array[i - 1] + " ";
            }
        }
        output += array[array.length-1];
        String[] arr = output.split(" ");
        return arr;
    }


}
