import java.util.*;


public class Basket extends ArrayList<Book>{

    private static final Map<Integer, Double> DISCOUNTS =
            Collections.unmodifiableMap(new HashMap<Integer, Double>() {{
                put(1, 8.0);
                put(2, 15.2);
                put(3, 21.6);
                put(4, 25.6);
                put(5, 30.0);
            }});



    public Basket(Book... books) {
        Collections.addAll(this, books);
    }

    public double calculatePrice() {
        double price = 0.0d;

        while (!this.isEmpty()) {

            Set<Book> uniqueBooks = new HashSet<Book>();

            for (Book book : Book.values()) {
                boolean remove = this.remove(book);

                if (remove) {
                    uniqueBooks.add(book);
                }

            }

            price += DISCOUNTS.get(uniqueBooks.size());
        }

        return price;
    }
}
