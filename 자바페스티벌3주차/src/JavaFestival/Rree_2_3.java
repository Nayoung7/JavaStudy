package JavaFestival;

public class Rree_2_3 {

	public static void main(String[] args) {
		// �л����� ���������� ���ڿ��� ����Ǿ� ���� �� �� ������ �л� ���� ����Ͻÿ�
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] grade = { "A", "B", "C", "D", "F" };
		int[] student = new int[5];

		String[] temp = score.split("");
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < student.length; j++) {
				if (temp[i].equals(grade[j])) {
					student[j]++;
				}
			}
		}

		for (int i = 0; i < student.length; i++) {
			System.out.println(grade[i] + " : " + student[i] + "��");
		}

	}

}
