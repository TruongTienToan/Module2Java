package S6_Inheritance.Point2DAndPoint3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }

    public Point2D(float x, float y) {
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
        float[]arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{"
                + "x="
                + x
                + ", y="
                +y
                +"}";
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(5.6f, 6.5f);
        System.out.println(point2D.toString());
    }
}
