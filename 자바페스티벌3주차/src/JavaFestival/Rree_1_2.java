package JavaFestival;

public class Rree_1_2 {

	public static void main(String[] args) {
		// String�� �迭 names�� �Ű������� �޾� names �� "Kim"�� ��ġx�� ã��,
		// "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� findKim �޼ҵ� �ۼ��ϱ�
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
		temp = "�輭���� " + result + "�� �ִ�.";
		return temp;
	}

}
