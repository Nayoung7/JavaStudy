package JavaFestival;

public class Rree_1_2 {

	public static void main(String[] args) {
		// String형 배열 names를 매개변수로 받아 names 중 "Kim"의 위치x를 찾고,
		// "김서방은 x에 있다"는 String을 반환하는 findKim 메소드 작성하기
		String[] names = { "Queen", "Tod", "Kim" };
		System.out.println(findKim(names));

	}

	public static String findKim(String[] names) {
		int result = 0;
		String temp;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Kim")) {
				result = i + 1;
			}
		}
		temp = "김서방은 " + result + "에 있다.";
		return temp;
	}

}
