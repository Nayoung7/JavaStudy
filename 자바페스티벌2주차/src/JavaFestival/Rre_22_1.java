package JavaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class Rre_22_1 {

	public static void main(String[] args) {
		// 정수 n을 입력받아	1, 2, 4, 7, 11 과 같은 수열의 n번째 항까지 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
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
