package JavaFestival;

public class Rree_1_1 {

	public static void main(String[] args) {
		// ���ڿ��� �Է¹޾� ���ĺ�������� �����Ͽ� ��ȯ�ϴ� �޼ҵ带 �����ϼ���
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
