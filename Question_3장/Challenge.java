package Question_3��;

import java.util.Random;
import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {
		// ������ ī���� ���� ���ߴ� ������ ������. 0���� 99������ ������ ���� ���� ī�带 �� �� �����
		// �� ī���� ���� ���ߴ� �����̴�. ī�� ���� ���� 77�� ��� ���� ���ߴ� ����� 55��� �Է��ϸ� "�� ����",
		// �ٽ� 70�� �Է��ϸ� "�� ����"��� ������ ������ �������鼭 ���� �����.
		// ������ �ݺ��ϱ� ���� y/n�� ����, n�� ��� ����ȴ�.

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		boolean exit1 = false;
		boolean exit2 = false;
		while (true) {
			if (exit1 == true) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			int k = rd.nextInt(100);
			exit1 = false;
			exit2 = false;
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			System.out.println("0-99");
			int cnt = 1;
			int min = 0;
			int max = 99;
			while (true) {
				if (exit1 == true || exit2 == true) {
					break;
				}
				System.out.print(cnt + " >> ");
				int input = sc.nextInt();

				if (input == k) {
					System.out.println("�¾ҽ��ϴ�.");
					while (true) {
						System.out.print("�ٽ� �Ͻðڽ��ϱ�?(y/n) >> ");
						String answer = sc.next();
						if (answer.equals("y")) {
							System.out.println();
							exit2 = true;
							break;
						} else if (answer.equals("n")) {
							exit1 = true;
							break;
						} else {
							System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
						}
					}
				} else {
					if (input < k) {
						System.out.println("�� ����");
						min = input;
					} else if (input > k) {
						System.out.println("�� ����");
						max = input;
					}
					System.out.println(min + "-" + max);
					System.out.println();
					cnt++;
				}
			}
		}
		sc.close();
	}

}
