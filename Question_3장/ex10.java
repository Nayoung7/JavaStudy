package Question_3��;

public class ex10 {

	public static void main(String[] args) {
		// 4X4�� 2���� �迭�� ����� �̰��� 1���� 10������ ������ ������
		// 10���� �����ϰ� �����Ͽ� ������ ��ġ�� �����϶�. ������ ������ �־ �������.
		// ������ 6���� ���ڴ� ��� 0�̴�. ������� 2���� �迭�� ȭ�鿡 ����϶�.
		
		int[][] array = new int[4][4];
		int x,y,result = 0;
		
		while(result < 10) {
			x = (int)(Math.random()*4);
			y = (int)(Math.random()*4);
			if(array[x][y] == 0) {
				array[x][y] = (int)(Math.random()*10 + 1);
				result++;
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
