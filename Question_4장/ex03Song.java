package Question_4장;

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
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
	
	public static void main(String[] args) {
		ex03Song song = new ex03Song("Dancing Queen", "ABBA", 1987, "스웨덴");
		song.show();
	}
}
