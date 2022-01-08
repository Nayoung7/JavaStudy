package Question_4��;

public class ex04Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public ex04Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return width * height;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}
	
	public boolean contains(ex04Rectangle r) {
		if((x + width) > (r.x + r.width) && (y + height) > (r.y + r.height) && x < r.x && y < r.y) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		ex04Rectangle r = new ex04Rectangle(2, 2, 8, 7);
		ex04Rectangle s = new ex04Rectangle(5, 5, 6, 6);
		ex04Rectangle t = new ex04Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
}
