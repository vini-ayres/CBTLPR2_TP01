package Ex2;
import Ex1.Author;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Joao", "joao@email.com", 'm');
        authors[1] = new Author("Maria", "maria@email.com", 'f');

        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(testeBook);
        System.out.println(testeBook.getAuthorNames());

        testeBook.setPrice(29.99);
        testeBook.setQty(5);

        System.out.println(testeBook.getName());
        System.out.println(testeBook.getPrice());
        System.out.println(testeBook.getQty());

        for (Author author : testeBook.getAuthors()) {
            System.out.println(author);
        }
    }
}
