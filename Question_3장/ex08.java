package Question_3��;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// ������ � �������� Ű����κ��� ������ �Է¹޾�(100���� ���� ����)
		// ���� �迭�� �����ϰ�, �̰��� 1���� 100������ ������ ������ �����ϰ� �����϶�.
		// �迭���� ���� ���� ������ �ϰ� �迭�� ����϶�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �?");
		int num = sc.nextInt();
		int[] array = new int[num];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100 + 1);
			for(int j = 0; j < i; j++) {
				if(array[i] == array[j]) {
					i--;
				}
			}
		}
		for(int i = 1; i <= array.length; i++) {
			System.out.print(array[i-1] + " ");
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		sc.close();
	}

}
