package Question_3��;

public class ex13 {

	public static void main(String[] args) {
		// �ݺ����� �̿��Ͽ� 369���ӿ��� �ڼ��� �ľ� �ϴ� ��츦 ������� ȭ�鿡 ����غ���. 
		// 1���� �����ϸ� 99������ �Ѵ�.
		
		for(int i = 1; i <= 99; i++) {
			int cnt = 0;
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				cnt++;
			}
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				cnt++;
			}
			
			if(cnt == 1) {
				System.out.println(i + " �ڼ� ¦");
			}else if(cnt == 2) {
				System.out.println(i + " �ڼ� ¦¦");
			}
		}

	}

}
