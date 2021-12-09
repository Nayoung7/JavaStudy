package JavaFestival;

import java.util.Scanner;

public class Rree_2_2 {

	public static void main(String[] args) {
		// 대시('-')로 구성된 형태의 숫자를 주어진 숫자와 같이 출력하고 싶을때 사용하게 되는
		// 대시의 개수를 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String input = sc.next();

		int[] dash = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		String[] num = input.split("");
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + dash[Integer.parseInt(num[i])];
		}

		System.out.println("대시('-')의 총합 >> " + sum);
		sc.close();
	}

}
