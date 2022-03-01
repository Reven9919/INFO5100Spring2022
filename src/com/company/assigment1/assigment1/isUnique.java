package assigment1;

import java.util.HashMap;
import java.util.Map;

//Write a program to check if a string has all unique characters.
public class isUnique {
  public boolean isUnique(String str) {
    if (str == null) {
      return false;
    }
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      if (map.containsKey(str.charAt(i))) {
        return false;
      }
      map.put(str.charAt(i), i);
    }
    return true;
  }
}