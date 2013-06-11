public class Room {
    public static Integer area(int length, int width){
        return length * width;
    }

    public Double cost(int length, int width, int price) {
        return Double.valueOf(length * width * price);
    }
}
