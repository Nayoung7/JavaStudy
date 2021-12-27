package Question_3장;

import java.util.Random;
import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {
		// 숨겨진 카드의 수를 맞추는 게임을 만들어보자. 0에서 99까지의 임의의 수를 가진 카드를 한 장 숨기고
		// 이 카드의 수를 맞추는 게임이다. 카드 속의 수가 77인 경우 수를 맞추는 사람이 55라고 입력하면 "더 높게",
		// 다시 70을 입력하면 "더 높게"라는 식으로 범위를 좁혀가면서 수를 맞춘다.
		// 게임을 반복하기 위해 y/n을 묻고, n인 경우 종료된다.

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		boolean exit1 = false;
		boolean exit2 = false;
		while (true) {
			if (exit1 == true) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			int k = rd.nextInt(100);
			exit1 = false;
			exit2 = false;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			System.out.println("0-99");
			int cnt = 1;
			int min = 0;
			int max = 99;
			while (true) {
				if (exit1 == true || exit2 == true) {
					break;
				}
				System.out.print(cnt + " >> ");
				int input = sc.nextInt();

				if (input == k) {
					System.out.println("맞았습니다.");
					while (true) {
						System.out.print("다시 하시겠습니까?(y/n) >> ");
						String answer = sc.next();
						if (answer.equals("y")) {
							System.out.println();
							exit2 = true;
							break;
						} else if (answer.equals("n")) {
							exit1 = true;
							break;
						} else {
							System.out.println("잘못입력하였습니다. 다시 입력해주세요");
						}
					}
				} else {
					if (input < k) {
						System.out.println("더 높게");
						min = input;
					} else if (input > k) {
						System.out.println("더 낮게");
						max = input;
					}
					System.out.println(min + "-" + max);
					System.out.println();
					cnt++;
				}
			}
		}
		sc.close();
	}

}
