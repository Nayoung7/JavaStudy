package Question_2��;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// 2���� ��鿡�� ���簢���� ���� ��� �𼭸��� ������ �ϴ� �𼭸��� �� ������ ǥ���Ѵ�.
		// (100,100)�� (200,200)�� �������� �̷���� �簢���� ������
		// ���� x, y ���� �Է� �ް� �� (x,y)�� �� ���簢�� �ȿ� �ִ����� �Ǻ�

		Scanner sc = new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �ֽ��ϴ�.", x, y);
		} else {
			System.out.printf("(%d,%d)�� �簢�� �ȿ� ���� �ʽ��ϴ�.", x, y);
		}
		sc.close();

	}

}
