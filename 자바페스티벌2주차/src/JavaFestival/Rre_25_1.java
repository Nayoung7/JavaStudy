package JavaFestival;

import java.util.ArrayList;
import java.util.Scanner;

public class Rre_25_1 {

	public static void main(String[] args) {
		// 10진수 정수를 입력받아 2진수로 변환해서 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();

		ArrayList<Integer> array = new ArrayList<Integer>();
		while (num > 0) {
			array.add(num % 2);
			num /= 2;
		}
		for (int i = array.size() - 1; i >= 0; i--) {
			System.out.print(array.get(i) + " ");
		}
		sc.close();
	}

}
