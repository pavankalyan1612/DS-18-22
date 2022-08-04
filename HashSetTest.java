import java.util.HashSet;
import java.util.Objects;

public class HashSetTest {
	public static void main(String[] args) {

		Book book1 = new Book("Java",5,"james",500);
		
		Book book2 = new Book("English",20,"Godse",1000);
		Book book3 = new Book("Maths",20,"hahk",1000);
		
		
		System.out.println("book1 : "+book1);
		System.out.println("book2 : "+book2);
		System.out.println("book3 : "+book3);

		System.out.println("----");
		
		System.out.println("book1 : "+book1.hashCode());
		System.out.println("book2 : "+book2.hashCode());
		System.out.println("book3 : "+book3.hashCode());

		
		HashSet<Book> bookShelf = new HashSet<Book>();
		
		System.out.println("Adding book1 ");
		bookShelf.add(book1);
		
		System.out.println("Adding book2 ");
		bookShelf.add(book2);

		System.out.println("Adding book3 ");
		bookShelf.add(book3);
			
		
		for (Book book : bookShelf) {
			System.out.println("The Book : "+book);
		}
	}
}

class Book
{
	String title;
	int bookNumber;
	String author;
	int price;
	public Book(String title, int bookNumber, String author, int price) {
		super();
		this.title = title;
		this.bookNumber = bookNumber;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookNumber=" + bookNumber + ", author=" + author + ", price=" + price
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bookNumber, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookNumber == other.bookNumber && price == other.price
				&& Objects.equals(title, other.title);
	}
	
	

	
}
//comparator