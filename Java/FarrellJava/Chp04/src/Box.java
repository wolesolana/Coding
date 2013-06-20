public class Box {

    double length, width, height;

    public Box(double length){

        this.length = length;
        this.width = 0.0;
        this.height = 0.0;

        System.out.println("Line created.");

    }

    public Box(double length, double height){

        this.length = length;
        this.height = height;
        this.width = 0.0;

        System.out.println("Rectangle created.");

    }

    public Box(double length, double height, double width){

        this.length = length;
        this.height = height;
        this.width = width;

        System.out.println("Box created.");

    }
}
