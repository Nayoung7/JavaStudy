package JavaFestival;

public class Rre_19_2 {

	public static void main(String[] args) {
		// (77*1) + (76*2) + (75*3)+��+(1*77)�� ����Ͽ� ��� ���
		int sum = 0;
		for (int i = 1; i <= 77; i++) {
			sum = sum + i * (78 - i);
		}

		System.out.println(sum);
	}

}
