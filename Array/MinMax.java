import java.util.*;
import java.io.*;

public class MinMax {

	public static void main(String[] args) {

		int[] arr = {2, 5, 3, 1, 6};

		System.out.println("Max value " + Max(arr));
		System.out.println("Min value " + Min(arr));
	}

	public static int Max(int[] arr) {
		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int cur_max = arr[i];
			if (cur_max > ans) {
				ans = cur_max;
			}
		}
		return ans;
	}

	public static int Min(int[] arr) {
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int cur_min = arr[i];
			if (cur_min < ans) {
				ans = cur_min;
			}
		}
		return ans;
	}
}