package Question_3��;

public class ex07 {

	public static void main(String[] args) {
		// ���� 10���� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�.
		// �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
		
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10 + 1);
		}
		
		System.out.print("������ ������ : ");
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			sum += array[i];
		}
		System.out.println();
		System.out.println("����� " + sum / 10.0);
		

	}

}
