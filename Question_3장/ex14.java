package Question_3��;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// ����� ������ ¦�� �̷絵�� 2���� �迭�� �ۼ��ϰ�
		// ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ��϶�.
		// "�׸�"�� �Է¹����� �����Ѵ�.

		Scanner sc = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };
		

		while(true) {
			System.out.print("���� �̸� >> ");
			String input = sc.next();
			boolean a = false;
			if(input.equals("�׸�")) {
				break;
			}
			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(input)) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					a = true;
				} 
			}
			if(a == false) {
				System.out.println("���� �����Դϴ�.");
			}
			
		}
		sc.close();
	}

}
