package JavaFestival;

public class Rre_30_1 {

	public static void main(String[] args) {
		// �ΰ��� ������ �Ű������� �޾� ���� ������ ���� ������ �������������� �Ǻ��ϴ�
		// isDivied() �޼ҵ带 �ۼ��ϼ���. ���������� true, ���������������� flase�� ��ȯ
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.println("��� Ȯ�� : " + result);

	}

	public static boolean isDivide(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
