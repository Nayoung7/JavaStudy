package JavaFestival;

public class Rree_4_1 {

	public static void main(String[] args) {
		// �ϻ��� �� : ���� ���� x�� �ڸ����� ������ x�� ������ �������� ��
		System.out.println(isHarshad(154));

	}

	public static boolean isHarshad(int x) {
		int temp = x;
		int sum = 0;
		while (temp > 0) {
			sum = sum + temp % 10;
			temp /= 10;
		}
		return x % sum == 0 ? true : false;
	}

}
