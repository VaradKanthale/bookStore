package LibraryProjact;

public class Books {
	int id;
	String bookname;
	String author;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Books(int id, String bookname, String author) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", bookname=" + bookname + ", author=" + author + "]";
	}
	
	
	

}
