package ch04;


public class Q1_SongClass{
	static class Song{
		private String title;
		
		public Song(String title) {
			this.title = title;
		}
		
		private String getTitle() {
			return title;
		}
	}
	public static void main(String[] args) {
		Song mySong = new Song("Nessun Dorma");
		Song yourSong = new Song("���ִ� �� �� �̷��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� " + yourSong.getTitle());
	}
}