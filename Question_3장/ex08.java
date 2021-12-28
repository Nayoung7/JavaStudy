package Question_3장;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// 정수를 몇개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수)
		// 정수 배열을 생성하고, 이곳에 1에서 100까지의 범위의 정수를 랜덤하게 삽입하라.
		// 배열에는 같은 수가 없도록 하고 배열을 출력하라.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int num = sc.nextInt();
		int[] array = new int[num];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100 + 1);
			for(int j = 0; j < i; j++) {
				if(array[i] == array[j]) {
					i--;
				}
			}
		}
		for(int i = 1; i <= array.length; i++) {
			System.out.print(array[i-1] + " ");
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		sc.close();
	}

}
