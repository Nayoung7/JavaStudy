package JavaFestival;

import java.util.ArrayList;
import java.util.Scanner;

public class Rre_25_1 {

	public static void main(String[] args) {
		// 10���� ������ �Է¹޾� 2������ ��ȯ�ؼ� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num = sc.nextInt();

		ArrayList<Integer> array = new ArrayList<Integer>();
		while (num > 0) {
			array.add(num % 2);
			num /= 2;
		}
		for (int i = array.size() - 1; i >= 0; i--) {
			System.out.print(array.get(i) + " ");
		}
		sc.close();
	}

}
