package code;


/**
 * The class is written to request a detail of a book 
 * @author nomal
 *@version 1.0
 */
public class Book {
	/**
	 * This Store Book Name
	 */
	private String book_name;
	/**
	 * This Store Book ID
	 */
	private int book_id;
	/**
	 * This Store Year
	 */
	private int year;
	/**
	 * This Store Author Name
	 */
	private String author;
	/**
	 * @param book_name
	 * @param book_id
	 * @param year
	 * @param author
	 */
	public Book(String book_name, int book_id, int year, String author) {
		super();
		this.book_name = book_name;
		this.book_id = book_id;
		this.year = year;
		this.author = author;
	}
	
	public Book() {
		super();
	}
	public String getBook_name() {
		return book_name;
	}
	public int getBook_id() {
		return book_id;
	}
	public int getYear() {
		return year;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}

