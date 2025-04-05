package programming.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getBooksInSort() {

		
		List<Book> books = new BookDao().getBooks();
		//Collections.sort(books, new MyComparator());
		Collections.sort(books,(o1,o2)->o1.getName().compareTo(o2.getName()));
		
		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
		});
		return books;
	}
	public static void main(String[] args) {
		BookService bs= new BookService();
	
		System.out.println(bs.getBooksInSort().toString());
	}
}


//class MyComparator implements Comparator<Book> {
//
//	@Override
//	public int compare(Book o1, Book o2) {
//		// TODO Auto-generated method stub
//		return o2.getName().compareTo(o1.getName());
//	}
//}