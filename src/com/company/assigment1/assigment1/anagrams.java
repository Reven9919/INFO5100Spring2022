package assigment1;

import java.util.Arrays;

//Write a program to check if two strings are anagrams. Anagrams are strings which can be made by rearranging characters in string.
public class anagrams {
  boolean firstIsAnagram(String sFirst, String sSecond) {
    char[] cFirstArray = sFirst.toCharArray();
    char[] cSecondArray = sSecond.toCharArray();
    Arrays.sort(cFirstArray);
    Arrays.sort(cSecondArray);
    return Arrays.equals(cFirstArray, cSecondArray);
  }
}