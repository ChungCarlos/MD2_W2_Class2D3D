import java.util.Arrays;

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

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] Arr = new float[2];
        if (Arr.length >= 2) {
            Arr[0] = getX();
            Arr[1] = getY();
        }
        return Arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", xy= " + Arrays.toString(getXY()) +
                '}';
    }
}
class Test2D{
    public static void main(String[] args) {
        Point2D point2D = new Point2D(4,2);
        System.out.println(point2D);
    }
}


