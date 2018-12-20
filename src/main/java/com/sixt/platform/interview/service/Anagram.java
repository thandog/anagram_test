package com.sixt.platform.interview.service;

import java.util.Arrays;

/**
 * Compares the two words passed to see if the
 * word is an anagram
 */
public class Anagram {

    static boolean isAnagram = false;

    public static boolean isAnagram(String lhs, String rhs){

        //first check the length. If it is not the same the test fails immediately
        if(lhs.length() != rhs.length()){
            isAnagram = false;
            return isAnagram;
        }

        else{
            isAnagram = true;
        }

        //convert both strings to char array so that you can sort them. Convert to lowerCase as well.
        char firstWord[] = lhs.toLowerCase().toCharArray();
        char secondWord[] = rhs.toLowerCase().toCharArray();

        //do the sorting on the char arrays
        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        //compare the string values after they have been sorted
        if(String.valueOf(firstWord).equals(String.valueOf(secondWord))){
            isAnagram = true;
        }
        else{
            isAnagram = false;
            return isAnagram;
        }

        //option 2. Using this method, expect the int value to be 0 if they are anagram
        if(String.valueOf(firstWord).compareToIgnoreCase(String.valueOf(secondWord)) == 0){
            isAnagram = true;
            return isAnagram;
        }else{
            isAnagram = false;
        }

        return isAnagram;

    }

}