package JavaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class Rre_22_1 {

	public static void main(String[] args) {
		// ���� n�� �Է¹޾�	1, 2, 4, 7, 11 �� ���� ������ n��° �ױ��� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("n �Է� : ");
		int n = sc.nextInt();
		int[] array = new int[n];
		array[0] = 1;
		for (int i = 1; i < array.length; i++) {
			array[i] = array[i - 1] + i;
		}

		System.out.println(Arrays.toString(array));
		sc.close();
	}

}
