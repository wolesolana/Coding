import java.util.*;

public class Basket {

    private static final double BOOK_PRICE = 8.0;
    private final List<Book> bookList = new ArrayList<Book>();
    private static final Map<Integer, Double> DISCOUNTS =
            Collections.unmodifiableMap(new HashMap<Integer, Double>() {{
                put(1, 8d);
                put(2, 15.2);
                put(3, 21.6);
                put(4, 25.6);
                put(5, 30d);
            }});

    public double calculatePrice() {
        double price = 0.0d;

        while (!bookList.isEmpty()) {

            List<Book> uniqueBooks = new ArrayList<Book>();

            for (Book book : Book.values()) {
                boolean remove = bookList.remove(book);
                if (remove) {
                    uniqueBooks.add(book);
                }

            }
            price += DISCOUNTS.get(uniqueBooks.size());



        }

        return price;

    }

    public void addBook(Book book) {
        bookList.add(book);
    }
}
