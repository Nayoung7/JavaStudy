package Question_3��;

public class ex09 {

	public static void main(String[] args) {
		// 4X4�� 2���� �迭�� ����� �̰��� 1���� 10���� ������ ������
		// �����ϰ� �����Ͽ� ���� 16���� �迭�� �����ϰ�, 2���� �迭�� ȭ�鿡 ����϶�
		
		int[][] array = new int[4][4];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random()*10 + 1);
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
