import java.util.*;
import java.io.*;

public class SayDigits {

	public static void sayWord(int n, String arr[]) {

		if (n == 0) {
			return;
		}

		int digit = n % 10;
		n /= 10;
		sayWord(n, arr);
		System.out.print(arr[digit] + " ");
	}

	public static void main(String[] args) {


		int n = 5690;

		String arr[] = {"zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

		sayWord(n, arr);

	}
}