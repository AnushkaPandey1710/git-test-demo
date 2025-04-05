package programming.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

	public List<Book> getBooks(){
		List<Book> books= new ArrayList<>();
		books.add(new Book(1,"Core Java", 300));
		books.add(new Book(2,"Core Python", 3120));
		books.add(new Book(3,"Microservices", 120));
		books.add(new Book(4,"AWS", 234));
		return books;
	}
}
