import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(){
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
    public void setXYZ(float x,float y, float z){
        setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] Arr = new float[3];
        if (Arr.length >= 3) {
            Arr[0] = getX();
            Arr[1] = getY();
            Arr[2] = getZ();
        }
        return Arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ",z =" + getZ() +
                ", xyz= " + Arrays.toString(getXYZ()) +
                '}';
    }
}
class Test3D{
    public static void main(String[] args) {
        Point3D point3D = new Point3D(4,2,5);
        System.out.println(point3D);
    }
}