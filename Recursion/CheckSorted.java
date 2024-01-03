import java.util.*;
import java.io.*;

public class CheckSorted {


	public static boolean isSorted(int[] arr, int size) {

		if (size == 0 || size == 1) {
			return true;
		}

		if (arr[size] < arr[size - 1]) {
			return false;
		} else {
			return isSorted(arr, size - 1);
		}
	}

	public static void main(String[] args) {

		int[] arr = {1, 2, 100, 4, 5};

		int size = arr.length;

		boolean ans = isSorted(arr, size - 1);

		if (ans) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array is not sorted");
		}

	}
}