package hust.soict.dsai.aims.media;

public abstract class Disc extends Media implements Playable {
	private String director;
	private int length;
	
	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}

	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public Disc(String title, float cost) {
		super(title, cost);
	}

	public Disc(String title) {
		super(title);
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}
	
	public abstract String toString();

}