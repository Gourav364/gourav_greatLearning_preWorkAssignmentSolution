package com.greatlearning;

public class Palindrome {

    public static boolean isPalindrome(int num) {

        int revNum = 0;
        int currNum = num;

        while(currNum > 0) {
            revNum = revNum * 10 + currNum % 10;
            currNum = currNum / 10;
        }

        if(revNum == num) return true;
        return false;
    }
}
