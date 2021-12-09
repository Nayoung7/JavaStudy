package JavaFestival;

public class Rre_30_1 {

	public static void main(String[] args) {
		// 두개의 정수를 매개변수로 받아 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는
		// isDivied() 메소드를 작성하세요. 나누어지면 true, 나누어지지않으면 flase를 반환
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);

	}

	public static boolean isDivide(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
