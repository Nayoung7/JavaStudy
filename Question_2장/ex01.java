package Question_2��;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// scanner Ŭ������ �̿��Ͽ� ��ȭ�� �Է¹޾� �޷��� �ٲپ� ���. $1 = 1100������ ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��) >> ");
		int won = sc.nextInt();
		double dal = won / 1100.0;
		System.out.printf("%d���� $%.1f�Դϴ�.", won, dal);
		
		sc.close();
	}

}
