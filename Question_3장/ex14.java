package Question_3장;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// 과목과 점수가 짝을 이루도록 2개의 배열을 작성하고
		// 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라.
		// "그만"을 입력받으면 종료한다.

		Scanner sc = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		

		while(true) {
			System.out.print("과목 이름 >> ");
			String input = sc.next();
			boolean a = false;
			if(input.equals("그만")) {
				break;
			}
			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(input)) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					a = true;
				} 
			}
			if(a == false) {
				System.out.println("없는 과목입니다.");
			}
			
		}
		sc.close();
	}

}
