import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BasketTest {
    @Test
    public void shouldAddBookToBasket(){

        Basket basket = new Basket();
        basket.addBook(Book.FIRST_BOOK);

        double price = basket.calculatePrice();

        assertThat(price, is(8.0));

    }

    @Test
    public void emptyBasketShouldCostZero(){

        Basket basket = new Basket();
        double price = basket.calculatePrice();

        assertThat(price, is(0.0));
    }

    @Test
    public void basketOfTheSameBooksGetNoDiscount(){

        Basket basket = new Basket();
        basket.addBook(Book.FIRST_BOOK);
        basket.addBook(Book.FIRST_BOOK);
        double price = basket.calculatePrice();


        assertThat(price, is(16.0));
    }

    @Test
    public void twoDifferentBooksGetFivePercentDiscount(){

        Basket basket = new Basket();
        basket.addBook(Book.FIRST_BOOK);
        basket.addBook(Book.SECOND_BOOK);
        double price = basket.calculatePrice();

        assertThat(price, is(16 * 0.95));
    }

    @Test
    public void threeDifferentBooksGetTenPercentDiscount(){

        Basket basket = new Basket();
        basket.addBook(Book.FIRST_BOOK);
        basket.addBook(Book.SECOND_BOOK);
        basket.addBook(Book.THIRD_BOOK);

        double price = basket.calculatePrice();

        assertThat(price, is(24 * 0.90));
    }

    @Test
    public void fourDifferentBooksGetTwentyPercentDiscount(){

        Basket basket = new Basket();
        basket.addBook(Book.FIRST_BOOK);
        basket.addBook(Book.SECOND_BOOK);
        basket.addBook(Book.THIRD_BOOK);
        basket.addBook(Book.FOURTH_BOOK);

        double price = basket.calculatePrice();

        assertThat(price, is(32 * 0.80));

    }

    @Test
    public void fiveDifferentBooksGetTwentyFivePercentDiscount(){

        Basket basket = new Basket();
        basket.addBook(Book.FIRST_BOOK);
        basket.addBook(Book.SECOND_BOOK);
        basket.addBook(Book.THIRD_BOOK);
        basket.addBook(Book.FOURTH_BOOK);
        basket.addBook(Book.FIFTH_BOOK);

        double price = basket.calculatePrice();

        assertThat(price, is(40 * 0.75));

    }

    @Test
    public void shouldGetDiscountForDifferentBookPermutations(){

        Basket firstBasket = new Basket();
        firstBasket.addBook(Book.FIRST_BOOK);
        firstBasket.addBook(Book.FIRST_BOOK);
        firstBasket.addBook(Book.SECOND_BOOK);
        firstBasket.addBook(Book.SECOND_BOOK);
        firstBasket.addBook(Book.THIRD_BOOK);
        firstBasket.addBook(Book.THIRD_BOOK);
        firstBasket.addBook(Book.FOURTH_BOOK);
        firstBasket.addBook(Book.FIFTH_BOOK);

        double firstPrice = firstBasket.calculatePrice();

        assertThat(firstPrice, is(51.20));

    }

}


