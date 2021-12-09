package JavaFestival;

import java.util.ArrayList;

public class Rree_3_1 {
	
	public static void main(String[] args) {
		// 정수형 변수 input을 선언하고 피보나치 수열의 input번재 항까지 출력하시오
		int input = 8;

		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}

	}

	public static int fibo(int i) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		int temp = 0;
		for (int j = 0; j < i; j++) {
			temp = temp + array.get(j);
			array.add(temp);
			temp = array.get(j);
		}
		return temp;
	}

}
