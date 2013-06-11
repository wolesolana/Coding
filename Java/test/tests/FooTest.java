import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FooTest {
    @Test
    public void shouldDoSomething(){
        Foo foo = new Foo();

        Integer result = Foo.addTwoNumbers(1,5);

        assertThat(result, is(6));
    }
}
