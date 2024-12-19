package activities;

public class Activity5 {
	public static void main(String[] args) {
		String titleName = "Harry Potter";
		MyBook newNovel = new MyBook();
		newNovel.setTitle(titleName);
		System.out.println("Book Title: " +newNovel.getTitle());
	}
}
