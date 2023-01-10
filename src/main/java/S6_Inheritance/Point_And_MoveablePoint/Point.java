package S6_Inheritance.Point_And_MoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point{"
                + "x="
                + x
                + ", y="
                + y
                + "}";
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(9.8f, 8.9f);
        System.out.println(point);
    }
}
