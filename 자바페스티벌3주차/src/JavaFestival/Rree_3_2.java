package JavaFestival;

import java.util.Arrays;

public class Rree_3_2 {

	public static void main(String[] args) {
		// �ΰ��� �迭 a�� b�� �պ� �� ������������ �����Ͽ� ��ȯ�ϴ� mergeArray �޼ҵ� �ϼ�
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
