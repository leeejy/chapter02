package chapter02;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	Song(){
		this("", "", "", "", 0, 0);
		
	}
	

	Song(String album, String artist, String composer, String title, int track, int year ){
		this.artist=artist;
		this.title=title;
		this.album=album;
		this.year=year;
		this.track=track;
		this.composer=composer;
	}
	
	
	Song(String artist, String title){
		this("", artist, "", title, 0, 0);
//		this.artist=artist;
//		this.title=title;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show(){
		System.out.println(
				this.artist+" "+this.title+
				" ("+this.album+", "+this.year+", "+
				this.track+"번 track, "+ this.composer+" 작곡 )");
	}
}
