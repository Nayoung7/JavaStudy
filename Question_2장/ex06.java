package Question_2��;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// 369����
		// 1~99������ ������ �Է¹ް� ������ 3, 6, 9 �� �ϳ��� �ִ� ���� "�ڼ�¦"�� ����ϰ�
		// �� �� �ִ� ���� "�ڼ�¦¦"�� ����ϴ� ���α׷�

		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ� >> ");
		int num = sc.nextInt();
		int cnt = 0;
		if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
			cnt++;
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				cnt++;
			}
		}

		if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
			cnt++;
			if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
				cnt++;
			}
		}
		if (cnt == 2 || cnt == 4) {
			System.out.println("�ڼ�¦¦");
		} else if (cnt == 1) {
			System.out.println("�ڼ�¦");
		}

	}

}
