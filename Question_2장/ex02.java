package Question_2��;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// 2�ڸ��� ����(10~99����)�� �Է¹ް�, ���� �ڸ��� 1�� �ڸ��� ������ �Ǻ��Ͽ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99) >> ");
		int num = sc.nextInt();
		
		int ten = num / 10;
		int one = num % 10;
		
		if(ten == one) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}else {
			System.out.println("no! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
		sc.close();

	}

}
