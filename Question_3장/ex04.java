package Question_3��;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// �ҹ��� ���ĺ��� �ϳ� �Է¹ް� ������ ���� ����ϴ� ���α׷��� �ۼ��϶�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ");
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
