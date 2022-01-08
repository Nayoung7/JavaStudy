package Question_4장;

import java.util.Scanner;

public class ex06CircleManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ex06Circle c [] = new ex06Circle[3];
		
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			
			c[i] = new ex06Circle(x, y, radius);
		}
		
		int max = c[0].radius;
		int add = 0;
		for(int i = 0; i < c.length; i++) {
			if(max < c[i].radius) {
				max = c[i].radius;
				add = i;
			}
		}
		System.out.print("가장 면적이 큰 원은 ");
		c[add].show();
		sc.close();
	}

}
