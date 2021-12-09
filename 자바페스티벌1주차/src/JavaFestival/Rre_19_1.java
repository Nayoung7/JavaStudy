package JavaFestival;

public class Rre_19_1 {

	public static void main(String[] args) {
		// 1-2+3-4+5-6+...+99-100 계산하여 답 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum -= i;
				System.out.print(-i + " ");
			} else {
				sum += i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("결과 : " + sum);

	}

}
