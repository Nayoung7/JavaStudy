package JavaFestival;

public class Rree_2_1 {

	public static void main(String[] args) {
		// startValue���� endValue���� ���� �� �������� ����ϴ�
		// getPerfectNumber() �޼ҵ带 �����ϼ���
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int sv, int ev) {
		System.out.print(sv + "~" + ev + "������ ������ : ");
		for (int i = sv; i <= ev; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
	}

}
