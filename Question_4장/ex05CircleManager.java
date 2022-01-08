package Question_4¿Â;

import java.util.Scanner;

public class ex05CircleManager {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ex05Circle c [] = new ex05Circle[3];
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new ex05Circle(x, y, radius);
		}
		
		for(int i = 0; i < c.length; i++) {
			c[i].show();
		}
		sc.close();
	}
}
