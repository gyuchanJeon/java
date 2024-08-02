package test04;

public class Book {

	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowed;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowed = false;
	}

	public void borrowBook() {

		if (isBorrowed == false) {
			this.isBorrowed = true;
			System.out.println("도서대출 : " + title);
		} else {
			System.out.println(title + " 이미 대출됨");
		}
	}

	public void returnBook() {
		if (isBorrowed == true) {
			this.isBorrowed = false;
			System.out.println("도서반납 : " + title);
		} else {
			System.out.println(title + "이미 반납됨");
		}
	}

	public void getBookInfo() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		if (isBorrowed == false) {
			System.out.println("대출여부 : 가능");
		} else {
			System.out.println("대출여부 : 불가능");
		}
	}

	public String getTitle() {
		return title;
	}

}
