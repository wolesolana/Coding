import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BasketTest {

    private static final double BOOK_PRICE = 8.0;

    @Test
    public void shouldAddBookToBasket(){

        Basket basket = new Basket(Book.FIRST_BOOK);
        assertThat(basket.calculatePrice(), is(BOOK_PRICE));

    }

    @Test
    public void emptyBasketShouldCostZero(){

        Basket basket = new Basket();
        assertThat(basket.calculatePrice(), is(0.0));
    }

    @Test
    public void basketOfTheSameBooksGetNoDiscount(){

        Basket basket = new Basket(Book.FIRST_BOOK, Book.FIRST_BOOK);
        assertThat(basket.calculatePrice(), is(BOOK_PRICE * 2));

    }

    @Test
    public void twoDifferentBooksGetFivePercentDiscount(){

        Basket basket = new Basket(Book.FIRST_BOOK, Book.SECOND_BOOK);
        assertThat(basket.calculatePrice(), is(BOOK_PRICE * 2 * 0.95));
    }

    @Test
    public void threeDifferentBooksGetTenPercentDiscount(){

        Basket basket = new Basket(Book.FIRST_BOOK, Book.SECOND_BOOK, Book.THIRD_BOOK );
        assertThat(basket.calculatePrice(), is(BOOK_PRICE * 3 * 0.90));
    }

    @Test
    public void fourDifferentBooksGetTwentyPercentDiscount(){

        Basket basket = new Basket(Book.FIRST_BOOK, Book.SECOND_BOOK, Book.THIRD_BOOK, Book.FOURTH_BOOK);
        assertThat(basket.calculatePrice(), is(BOOK_PRICE * 4 * 0.80));

    }

    @Test
    public void fiveDifferentBooksGetTwentyFivePercentDiscount(){

        Basket basket = new Basket(Book.FIRST_BOOK, Book.SECOND_BOOK, Book.THIRD_BOOK, Book.FOURTH_BOOK,
                Book.FIFTH_BOOK);
        assertThat(basket.calculatePrice(), is(BOOK_PRICE * 5 * 0.75));

    }

    @Test
    public void shouldGetDiscountForDifferentBookPermutations(){

        Basket basket = new Basket(Book.FIRST_BOOK, Book.FIRST_BOOK, Book.SECOND_BOOK, Book.SECOND_BOOK,
                Book.THIRD_BOOK, Book.THIRD_BOOK, Book.FOURTH_BOOK, Book.FIFTH_BOOK );
        assertThat(basket.calculatePrice(), is(51.20));

    }

}


