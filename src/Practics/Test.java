package Practics;

abstract class AbstractShape{
    public abstract double getArea();
    public abstract double getPerimeter();
}

class ARectangle extends AbstractShape{
    private double width, height;

    public ARectangle(double width, double height){
        this. width = width;
        this. height = height;
    }
    @Override
    public double getArea(){return width*height;}
    @Override
    public double getPerimater(){return 2 * (width + height);}
}

class ACircle extends AbstractShape{
    private double radius;

    public ACircle(double radius){this.radius = radius}
}


class Test{
    public static void main(String[] args) {
        ARectrangle r = new ARectangle(20.0, 10.0);
    }
}


public class Test {
}
