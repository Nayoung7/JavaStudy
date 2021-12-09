package JavaFestival;

import java.util.ArrayList;

public class Rree_4_2 {

	public static void main(String[] args) {
		// 명진이 멀리뛰기
		System.out.println(jumpCase(7));

	}

	public static int jumpCase(int n) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		int temp = 1;
		for (int i = 0; i < n; i++) {
			temp = temp + array.get(i);
			array.add(temp);
			temp = array.get(i);
		}
		return temp;
	}

}
