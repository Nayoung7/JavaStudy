package JavaFestival;

public class Rree_3_3 {

	public static void main(String[] args) {
		// �ܾ �Է¹޾� ��� ���ڸ� ��ȯ�ϵ��� �ϴ� getMiddle �޼ҵ� �����
		// �ܾ��� ���̰� ¦���� ��� ��� �α��ڸ� ��ȯ�ϸ� ��
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
