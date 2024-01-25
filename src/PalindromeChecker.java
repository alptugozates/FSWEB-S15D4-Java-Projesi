import java.util.LinkedList;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str1 = "I did, did I?";
        String str2 = "Racecar";
        String str3 = "hello";
        String str4 = "Was it a car or a cat I saw ?";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));

    }

    public static boolean isPalindrome(String input) {
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();


        for (char c : cleanInput.toCharArray()) {
            stack.push(c);
        }

    for(char c: cleanInput.toCharArray()){
        if(stack.pop() != c){
            return false;
        }
    }
    return true;

    }

}
