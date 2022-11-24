package S6_Inheritance.Point2DAndPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.getX();
        this.getY();
        this.z = z;
    }

    public float[] getXYZ(){
        float[]arr = {getX(), getY(), this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{"
                + "z="
                + z
                + "}"
                + "\n"
                + super.toString();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setX(1);
        point3D.setY(2);
        point3D.setZ(3);
        System.out.println(point3D.toString());
        System.out.println(Arrays.toString(point3D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
