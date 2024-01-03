import java.util.*;
import java.io.*;

public class SearchingAlgo {


	public static boolean isPresentLinerSearch(int[] arr, int key, int size) {

		if (size < 0) {
			return false;
		}

		if (arr[size] == key) {
			return true;
		} else {
			return isPresentLinerSearch(arr, key, size - 1);
		}

	}

	public static int isPresentBinarySearch(int[] arr, int start, int size, int key) {
		if (start > size) {
			return -1;
		}

		int mid = start + (size - start) / 2;

		if (arr[mid] == key) {
			return mid;
		}

		if (arr[mid] < key) // search in right part
			return isPresentBinarySearch(arr , mid + 1 , size , key); // recurrence relation
		else // search in left part
			return isPresentBinarySearch(arr , start , mid - 1 , key);// recurrence relation
	}

	public static void main(String[] args) {

		int[] arr = {4, 22, 1, 90, 2, 100};

		int[] arr2 = {1, 2, 3, 4, 5};

		int key = 4;
		int key2 = 6;

		int size = arr.length;
		int size2 = arr2.length;

		//boolean ans = isPresentLinerSearch(arr, key, size - 1);
		int ans2 = isPresentBinarySearch(arr2, 0, size2 - 1, key2);

		if (ans2 == -1) {
			System.out.println(key2 + " Not Present in Array");
		} else {
			System.out.println(key2 + " is Present in Array");
		}

	}
}