package JavaFestival;

public class Rree_3_3 {

	public static void main(String[] args) {
		// 단어를 입력받아 가운데 글자를 반환하도록 하는 getMiddle 메소드 만들기
		// 단어의 길이가 짝수일 경우 가운데 두글자를 반환하면 됨
		System.out.println(getMiddle("test"));

	}

	public static String getMiddle(String word) {

		String[] temp = word.split("");
		String a = null;
		String b = null;
		if (temp.length % 2 == 0) {
			a = temp[temp.length / 2 - 1] + temp[temp.length / 2];
			return a;
		} else {
			b = temp[temp.length / 2];
			return b;
		}
	}

}
