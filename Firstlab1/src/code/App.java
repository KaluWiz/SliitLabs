/**
 * 
 */
package code;

/**
 * @author uobsep22
 *
 */
public class App {
	static 	Book book;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 book = new Book("Secret",1, 1998, "Rhoda Byrne");
		
		String details = book.getBook_name()+ "" +book.getYear()+""+book.getAuthor();
		System.out.print(details);

	}

}
