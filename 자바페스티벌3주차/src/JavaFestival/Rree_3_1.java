package JavaFestival;

import java.util.ArrayList;

public class Rree_3_1 {
	
	public static void main(String[] args) {
		// ������ ���� input�� �����ϰ� �Ǻ���ġ ������ input���� �ױ��� ����Ͻÿ�
		int input = 8;

		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}

	}

	public static int fibo(int i) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		int temp = 0;
		for (int j = 0; j < i; j++) {
			temp = temp + array.get(j);
			array.add(temp);
			temp = array.get(j);
		}
		return temp;
	}

}
