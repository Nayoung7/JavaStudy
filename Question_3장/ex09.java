package Question_3장;

public class ex09 {

	public static void main(String[] args) {
		// 4X4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를
		// 랜덤하게 생성하여 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라
		
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
