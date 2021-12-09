package JavaFestival;

import java.util.Arrays;
import java.util.Random;

public class Rre_23_1 {

	public static void main(String[] args) {
		// 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후 가장 큰수와 작은 수를 각각 출력
		Random rd = new Random();
		int[] array = new int[8];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(99) + 1;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
				}
			}
		}
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("배열에 있는 모든 값 : " + Arrays.toString(array));
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}
