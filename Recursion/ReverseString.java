import java.util.*;
import java.io.*;

public class ReverseString {

	public static void reverse(String str, int len) {
		if (len < 0) {
			return;
		}
		System.out.print(str.charAt(len));
		reverse(str, len - 1);
	}

	public static void main(String[] args) {

		String str = "abcde";

		int len = str.length();

		reverse(str, len - 1);
	}
}