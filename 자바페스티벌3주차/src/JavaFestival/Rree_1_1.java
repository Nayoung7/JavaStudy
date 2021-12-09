package JavaFestival;

public class Rree_1_1 {

	public static void main(String[] args) {
		// 문자열을 입력받아 알파벳순서대로 정렬하여 반환하는 메소드를 구현하세요
		System.out.println(reverseStr("ZAbcdVefEg"));

	}

	public static String reverseStr(String st) {
		char[] array = st.toCharArray();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					char temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		String a = "";
		for (int i = 0; i < array.length; i++) {
			a += array[i];
		}
		return a;
	}

}
