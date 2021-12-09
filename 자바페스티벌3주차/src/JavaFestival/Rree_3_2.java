package JavaFestival;

import java.util.Arrays;

public class Rree_3_2 {

	public static void main(String[] args) {
		// 두개의 배열 a와 b를 합병 후 오름차순으로 정렬하여 반환하는 mergeArray 메소드 완성
		int a[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int b[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int merge[] = mergeArray(a, b);
		System.out.println("merge : " + Arrays.toString(merge));
	}

	public static int[] mergeArray(int[] a, int[] b) {
		int[] sum = new int[a.length + b.length];
		for (int i = 0; i < sum.length; i++) {
			if (i < a.length) {
				sum[i] = a[i];
			} else {
				sum[i] = b[i - b.length];
			}
		}
		Arrays.sort(sum);
		return sum;
	}

}
