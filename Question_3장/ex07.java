package Question_3장;

public class ex07 {

	public static void main(String[] args) {
		// 정수 10개를 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
		// 그리고 배열에 든 숫자들과 평균을 출력하라.
		
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10 + 1);
		}
		
		System.out.print("랜덤한 정수들 : ");
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			sum += array[i];
		}
		System.out.println();
		System.out.println("평균은 " + sum / 10.0);
		

	}

}
