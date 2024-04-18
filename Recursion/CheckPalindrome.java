import java.util.*;
import java.io.*;

public class CheckPalindrome {

	public static boolean isPalindrome(String str, int i, int j) {

		if (i > j) {
			return true;
		}

		if (str.charAt(i) != str.charAt(j)) {
			return false;
		}

		return isPalindrome(str, i + 1, j - 1);
	}

	public static void main(String[] args) {

		String str = "ababa";

		int len = str.length();

		boolean ans = isPalindrome(str, 0, len - 1);

		if (ans) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " Not Palindrome");
		}

	}
}