package Daily;

public class Main {

	public static void main(String[] args) {

		Author author = new Author("Maguerite Abouet", "margueabouet@gmail.com", 'M');
		Book book = new Book("Aya de Yopougon", author, 400, 12);
		book.toString();

	}

}
