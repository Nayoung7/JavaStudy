package JavaFestival;

public class Rre_27_2 {

	public static void main(String[] args) {
		// 2���� �迭�� �������� 90�� ȸ���Ͽ� ���
		int[][] array = new int[5][5];

		System.out.println("����");
		int value = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = value++;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("90�� ȸ��");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[j][array.length - 1 - i] + "\t");
			}
			System.out.println();
		}

	}

}
