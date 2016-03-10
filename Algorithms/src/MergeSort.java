import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// 合并（归并）排序
		//思想：递归和分治
		//比较left[l]和right[r]的大小，若left[l]≤right[r]，则将第一个有序表中的元素left[l]复制到result[i]中，
		//并令l和i分别加上1；否则将第二个有序表中的元素right[r]复制到result[i]中，并令j和k分别加上1，
		//如此循环下去，直到其中一个有序表取完，然后再将另一个有序表中剩余的元素复制到result中.
		//归并排序的算法我们通常用递归实现，先把待排序区间以中点二分，
		//接着把左边子区间排序，再把右边子区间排序，最后把左区间和右区间用一次归并操作合并成有序的区间.
		
		int [] a = new int [] {4,3,6,1,2,5};
		mergeSort(a);
		for(int i = 0;i < a.length;i++)
			System.out.println(a[i]);
	}

	public static void mergeSort(int[] array) {

		int length = array.length;
		int middle = length / 2;

		if (length > 1) {

			int[] left = Arrays.copyOfRange(array, 0, middle);// 拷贝数组array的左半部分
			int[] right = Arrays.copyOfRange(array, middle, length);// 拷贝数组array的右半部分
			mergeSort(left);// 递归array的左半部分
			mergeSort(right);// 递归array的右半部分
			merge(array, left, right);// 数组左半部分、右半部分合并到Array

		}
	}

	// 合并数组，升序
	private static void merge(int[] result, int[] left, int[] right) {

		int i = 0, l = 0, r = 0;

		while (l < left.length && r < right.length) {//当l=left.length || r = right.length时退出循环，有可能有一部分会剩下

			if (left[l] < right[r]) {
				result[i] = left[l];
				i++;
				l++;
			} else {
				result[i] = right[r];
				i++;
				r++;
			}
		}

		while (r < right.length) {// 如果右边剩下合并右边的
			result[i] = right[r];
			r++;
			i++;
		}

		while (l < left.length) {// 如果左边剩下合并左边的
			result[i] = left[l];
			l++;
			i++;
		}
	}
}
