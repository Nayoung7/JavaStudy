package Question_3��;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		// ����ڰ� ���� ���� �� �� �ϳ��� �Է��ϰ� <Enter> Ű�� ġ��
		// ���α׷��� ���� ���� �� �߿��� �����ϰ� �ϳ��� �����ϰ� ��ǻ�Ͱ� �������� �Ѵ�.
		// ����ڰ� �Է��� ���� �����ϰ� ������ ���� ���Ͽ� ���� �̰���� �Ǵ��Ѵ�.
		// ���ڰ� ���� ���� �� ��� "�׸�"�� �Է��ϸ� ������ ������.

		Scanner sc = new Scanner(System.in);
		String[] com = { "����", "����", "��" };

		while (true) {
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			System.out.print("���� ���� ��! >> ");
			String input = sc.next();

			if (input.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			} else {
				int n = (int) (Math.random() * 3);
				if (com[n].equals("����")) {
					if (input.equals("����")) {
						System.out.println("����� = " + input + " , " + "��ǻ�� = " + com[n] + ", �����ϴ�.");
					} else if (input.equals("����")) {
						System.out.println("����� = " + input + " , " + "��ǻ�� = " + com[n] + ", ����ڰ� �̰���ϴ�.");
					} else if (input.equals("��")) {
						System.out.println("����� = " + input + " , " + "��ǻ�� = " + com[n] + ", ����ڰ� �����ϴ�.");
					}
				} else if (com[n].equals("����")) {
					if (input.equals("����")) {
						System.out.println("����� = " + input + " , " + "��ǻ�� = " + com[n] + ", ����ڰ� �����ϴ�.");
					} else if (input.equals("����")) {
						System.out.println("����� = " + input + " , " + "��ǻ�� = " + com[n] + ", �����ϴ�.");
					} else if (input.equals("��")) {
						System.out.println("����� = " + input + " , " + "��ǻ�� = " + com[n] + ", ����ڰ� �̰���ϴ�.");
					}
				} else if (com[n].equals("��")) {
					if (input.equals("����")) {
						System.out.println("����� = " + input + " , " + "��ǻ�� = " + com[n] + ", ����ڰ� �̰���ϴ�.");
					} else if (input.equals("����")) {
						System.out.println("����� = " + input + " , " + "��ǻ�� = " + com[n] + ", ����ڰ� �����ϴ�.");
					} else if (input.equals("��")) {
						System.out.println("����� = " + input + " , " + "��ǻ�� = " + com[n] + ", �����ϴ�.");
					}
				}
			}

		}
		sc.close();

	}

}
