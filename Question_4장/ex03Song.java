package Question_4��;

public class ex03Song {
	String title;
	String artist;
	int year;
	String country;
	
	public ex03Song() {
	}
	
	public ex03Song(String title, String artist, int year, String country) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public void show() {
		System.out.println(year + "�� " + country + "������ " + artist + "�� �θ� " + title);
	}
	
	public static void main(String[] args) {
		ex03Song song = new ex03Song("Dancing Queen", "ABBA", 1987, "������");
		song.show();
	}
}
