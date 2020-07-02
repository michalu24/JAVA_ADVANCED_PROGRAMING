package _1_Cwiczenie_OOP;

public class Point {
    private int x =0;
    private int y =0;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "_1_Cwiczenie.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int[] getXY() {
        int[] coordinates = {this.x, this.y};
        return coordinates;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(getY(), 2) + Math.pow(getX(), 2));
    }
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(getY()-y, 2) + Math.pow(getX()-x, 2));
    }
    public double distance(Point point) {
        return Math.sqrt(Math.pow(getY()-point.getY(), 2) + Math.pow(getX()-point.getX(), 2));
    }

}
