import java.util.*;
import java.io.*;

public class GetSum {


	public static int sum(int[]arr, int size) {
		if (size == 0) {
			return 0;
		}

		if (size == 1) {
			return arr[0];
		}


		return arr[size - 1] + sum(arr, size - 1);
	}

	public static void main(String[] args) {
		int arr[] = {1, 3, 2, 4, 5};

		int size = arr.length;

		int ans = sum(arr, size);

		System.out.println("Sum is " + ans);
	}
}