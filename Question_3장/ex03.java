package Question_3��;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// ������ �Է¹ް� ������ ���� *�� ����ϴ� ���α׷��� �ۼ��϶�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� >> ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
