package Question_4��;

import java.util.Scanner;


public class ex02Grade {
	private int math;
	private int science;
	private int english;
	
	public ex02Grade(int math, int science, int english) {
		super();
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int average() {
		int sum = math + science + english;
		return sum / 3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		ex02Grade me = new ex02Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		sc.close();
	}
}
