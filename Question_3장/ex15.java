package Question_3��;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// 2���� ������ �Է¹޾� ���� ���ϴ� Multiply Ŭ����
		// �Ǽ� �Է��Ͽ��� ��, ���� �߻� ���� ���������� ó���ǵ��� ���� ó�� �ڵ带 �����Ͽ� Nultiply Ŭ���� ����

		Scanner sc = new Scanner(System.in);
		int n = 0, m= 0;
		while (true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");
				n = sc.nextInt();
				m = sc.nextInt();
				System.out.println(n + "x" + m + "=" + n * m);
				break;
			} catch (InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				sc.nextLine();
			}
		}
		sc.close();
	}

}
