/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Point {
    private int x;
    private int y;

    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    @Override
    public String toString() {
        String msg = "(" + x + ", " + y + ")";
        return msg;
    }
}
/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Circle extends Point {
    private double radius;
    public Circle(){}
    public Circle(int x, int y, double r) {
        super(x, y);
        this.radius = r;
    }
    public double getRadius() { return radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }
    public double getArea() { return Math.PI * radius * radius; }
}
class CircleHasAPoint{
    private Point center;
    private  double radius;

    public CircleHasAPoint(){}
    public CircleHasAPoint(Point p, double r){
        center = p;
        this.radius = r;
    }
    public double getRadius(){return radius;}
    public double getCircumference(){ return 2 * Math.PI * radius;}
    public double getArea(){return Math.PI * radius * radius;}
}
class TestCircleHAsAPoint{
    public static void main(String[] args) {
        CircleHasAPoint myCircle = new CircleHasAPoint(10, 10, 5);
        double myArea = myCircle.getArea();
        double myCircumference = myCircle.getCircumference();

        System.out.printf("원 면적: %.2f\n",myArea);
        System.out.printf("원 둘레: %.2f\n",myCircumference);
    }
}
/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10, 10, 5);
        double myArea = myCircle.getArea();
        double myCircumference = myCircle.getCircumference();

        System.out.printf("원 면적: %.2f\n", myArea);
        System.out.printf("원 둘레: %.2f\n", myCircumference);
    }
}