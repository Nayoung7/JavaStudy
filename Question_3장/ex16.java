package Question_3장;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		// 사용자가 가위 바위 보 중 하나를 입력하고 <Enter> 키를 치면
		// 프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고 컴퓨터가 낸것으로 한다.
		// 사용자가 입력한 값과 랜덤하게 선택한 값을 비교하여 누가 이겼는지 판단한다.
		// 독자가 가위 바위 보 대신 "그만"을 입력하면 게임을 끝낸다.

		Scanner sc = new Scanner(System.in);
		String[] com = { "가위", "바위", "보" };

		while (true) {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보! >> ");
			String input = sc.next();

			if (input.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			} else {
				int n = (int) (Math.random() * 3);
				if (com[n].equals("가위")) {
					if (input.equals("가위")) {
						System.out.println("사용자 = " + input + " , " + "컴퓨터 = " + com[n] + ", 비겼습니다.");
					} else if (input.equals("바위")) {
						System.out.println("사용자 = " + input + " , " + "컴퓨터 = " + com[n] + ", 사용자가 이겼습니다.");
					} else if (input.equals("보")) {
						System.out.println("사용자 = " + input + " , " + "컴퓨터 = " + com[n] + ", 사용자가 졌습니다.");
					}
				} else if (com[n].equals("바위")) {
					if (input.equals("가위")) {
						System.out.println("사용자 = " + input + " , " + "컴퓨터 = " + com[n] + ", 사용자가 졌습니다.");
					} else if (input.equals("바위")) {
						System.out.println("사용자 = " + input + " , " + "컴퓨터 = " + com[n] + ", 비겼습니다.");
					} else if (input.equals("보")) {
						System.out.println("사용자 = " + input + " , " + "컴퓨터 = " + com[n] + ", 사용자가 이겼습니다.");
					}
				} else if (com[n].equals("보")) {
					if (input.equals("가위")) {
						System.out.println("사용자 = " + input + " , " + "컴퓨터 = " + com[n] + ", 사용자가 이겼습니다.");
					} else if (input.equals("바위")) {
						System.out.println("사용자 = " + input + " , " + "컴퓨터 = " + com[n] + ", 사용자가 졌습니다.");
					} else if (input.equals("보")) {
						System.out.println("사용자 = " + input + " , " + "컴퓨터 = " + com[n] + ", 비겼습니다.");
					}
				}
			}

		}
		sc.close();

	}

}
