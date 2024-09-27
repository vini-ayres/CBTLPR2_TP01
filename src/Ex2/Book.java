package Ex2;
import Ex1.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        StringBuilder authorsStr = new StringBuilder();
        for (Author author : authors) {
            authorsStr.append(author.toString());
            if (authorsStr.length() > 0) {
                authorsStr.append(",");
            }
        }
        return "Book[name=" + name + ",authors={" + authorsStr + "},price=" + price + ",qty=" + qty + "]";
    }

    public String getAuthorNames() {
        StringBuilder authorsName = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorsName.append(authors[i].getName());
            if (i < authors.length - 1) {
                authorsName.append(",");
            }
        }
        return authorsName.toString();
    }
}
