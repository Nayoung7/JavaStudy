package Question_3장;

public class ex10 {

	public static void main(String[] args) {
		// 4X4의 2차원 배열을 만들고 이곳에 1에서 10까지의 범위의 정수를
		// 10개만 랜덤하게 생성하여 임의의 위치에 삽입하라. 동일한 정수가 있어도 상관없다.
		// 나머지 6개의 숫자는 모두 0이다. 만들어진 2차원 배열을 화면에 출력하라.
		
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
