import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoomTest {
    @Test
    public void calculateRoomArea(){
        Room room = new Room();
        Integer area = Room.area(15, 10);

        assertThat(area, is(150));
    }

    @Test
    public void calculateCost(){
        Room room = new Room();
        Double cost = room.cost(15, 10, 10);

        assertThat(cost, is(1500.0));

    }
}
