package Question_2장;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// 2자리의 정수(10~99사이)를 입력받고, 십의 자리와 1의 자리가 같은지 판별하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99) >> ");
		int num = sc.nextInt();
		
		int ten = num / 10;
		int one = num % 10;
		
		if(ten == one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("no! 10의 자리와 1의 자리가 같지 않습니다.");
		}
		sc.close();

	}

}
