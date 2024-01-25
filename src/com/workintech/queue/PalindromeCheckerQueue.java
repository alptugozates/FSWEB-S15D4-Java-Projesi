package com.workintech.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerQueue {
    private static String str1 = "I did, did I?";
    private static String str2 = "Racecar";
    private static String str3 = "hello";
    private static String str4 = "Was it a car or a cat I saw ?";
    public static void  main(String[] args) {

        PalindromeCheckerQueue palindromeChecker = new PalindromeCheckerQueue();
        palindromeChecker.checkPalindromes();
    }
    public void checkPalindromes() {
        String str1 = "I did, did I?";
        String str2 = "Racecar";
        String str3 = "hello";
        String str4 = "Was it a car or a cat I saw?";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));
    }
    public static boolean isPalindrome(String inputStr){

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        String cleanedStr = inputStr.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (char c : cleanedStr.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(((LinkedList<Character>) queue).removeFirst())) {
                return false;
            }
        }

        return true; // Palindrom
    }


}
