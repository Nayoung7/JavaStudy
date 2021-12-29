package Question_3장;

public class ex13 {

	public static void main(String[] args) {
		// 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 화면에 출력해보자. 
		// 1부터 시작하며 99까지만 한다.
		
		for(int i = 1; i <= 99; i++) {
			int cnt = 0;
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				cnt++;
			}
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				cnt++;
			}
			
			if(cnt == 1) {
				System.out.println(i + " 박수 짝");
			}else if(cnt == 2) {
				System.out.println(i + " 박수 짝짝");
			}
		}

	}

}
