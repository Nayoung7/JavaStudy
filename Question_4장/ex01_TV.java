package Question_4��;

public class ex01_TV {
	String made;
	int year;
	int size;
	
	public ex01_TV(String made, int year, int size) {
		super();
		this.made = made;
		this.year = year;
		this.size = size;
	}

	public void show() {
		System.out.println(made + "���� ���� " + year + "���� " + size + "��ġ TV");
	}
	
	public static void main(String[] args) {
		ex01_TV myTV = new ex01_TV("LG", 2017, 32);
		myTV.show();
	}
}
