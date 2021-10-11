package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        char[] chars = checkString.toCharArray();
        String longestString = "";
        String tempString = "";
        for(int i = 0; i < chars.length; i++) {
            if (longestString.contains(String.valueOf(chars[i])))
            {
                if(longestString.length() > tempString.length()){
                    tempString = longestString;
                }
                if (longestString.split(String.valueOf(chars[i])).length > 1)
                    longestString = longestString.split(String.valueOf(chars[i]))[1] + (chars[i]);
                else{
                    longestString =String.valueOf(chars[i]);
                }
            }
            else{
                longestString = longestString + chars[i];
            }
        }
        if (tempString.length() < longestString.length()) {
            return longestString.length();
        }
        else {
            return tempString.length();
        }
    }
}
