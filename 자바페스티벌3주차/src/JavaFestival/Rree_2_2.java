package JavaFestival;

import java.util.Scanner;

public class Rree_2_2 {

	public static void main(String[] args) {
		// ���('-')�� ������ ������ ���ڸ� �־��� ���ڿ� ���� ����ϰ� ������ ����ϰ� �Ǵ�
		// ����� ������ ����ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		String input = sc.next();

		int[] dash = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		String[] num = input.split("");
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + dash[Integer.parseInt(num[i])];
		}

		System.out.println("���('-')�� ���� >> " + sum);
		sc.close();
	}

}
