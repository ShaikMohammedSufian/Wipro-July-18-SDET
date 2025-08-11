package lab25_07;
/* 
Library Book Tracker
Fields: title, author, isbn, isAvailable
Use encapsulation to:
Issue a book (setAvailable(false))
Return a book (setAvailable(true))
Get book info
Write a small test class to simulate issuing and returning books.*/
public class LibraryBook {
	//privatefileds
	private String title;
	private String author;
	private String isbn;
	private boolean isAvailable;
	
	
	//setter
	
	public void settitle(String title) {
		this.title=title;
	}
	
	public void setauthor(String author) {
		this.author=author;
	}
	
	public void setisbn(String isbn) {
		this.isbn=isbn;
	}
	
	public void setavailable(boolean isAvailable) {
		this.isAvailable=isAvailable;
	}
	
	//issue book
	
	public void issuebook() {
		if(isAvailable== true) {
			System.out.println("book issued "+title);
			
		}else {
			System.out.println("book already issued "+title);
		}
	}
	
	//return
	
	public void returnBook() {
		if(isAvailable==false) {
			System.out.println("book returned "+title);
		}else {
			System.out.println("not issued "+title);
		}
	}
	
	//bookinfo
	
	public void info() {
		System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " +isAvailable);
       
	}
	public static void main(String[] args) {
		LibraryBook b1 = new LibraryBook();
		b1.settitle("abc");
		b1.setauthor("def");
		b1.setisbn("6584sdd");
		b1.setavailable(false);
		b1.issuebook();
//		b1.returnBook();
		b1.info();
		
//		LibraryBook b2 = new LibraryBook();
//		b2.settitle("pqr");
//		b2.setauthor("xyz");
//		b2.setisbn("sf568s");
//		b2.setavailable(true);
//		b2.issuebook();
//		b2.returnBook();
//		b2.info();
		
	}

}
