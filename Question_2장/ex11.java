package Question_2��;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// ���ڸ� �Է¹޾� 3~5�� "��", 6~8�� "����", 9~11�� "����", 11,1,2�� ��� "�ܿ�"��,
		// �� �� ���ڸ� �Է��� ��� "�߸��Է�"�� ����ϴ� ���α׷��� �ۼ��϶�

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� (1~12) >> ");
		int month = sc.nextInt();

		switch (month) {
		case 3, 4, 5:
			System.out.println("��");
			break;

		case 6, 7, 8:
			System.out.println("����");
			break;

		case 9, 10, 11:
			System.out.println("����");
			break;

		case 12, 1, 2:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("�߸��Է�");

		}
		sc.close();
	}

}
