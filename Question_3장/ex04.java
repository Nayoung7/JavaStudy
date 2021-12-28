package Question_3장;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을 작성하라
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		char word = sc.next().charAt(0);
		
		for(char i = word; i >= 97; i--) {
			for(char j = 97; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
