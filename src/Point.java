public class Point {

    private double xCoOrdinate;
    private double yCoOrdinate;

    public Point(double xCoOrdinate, double yCoOrdinate) {

        this.xCoOrdinate = xCoOrdinate;
        this.yCoOrdinate = yCoOrdinate;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (Double.compare(point.xCoOrdinate, xCoOrdinate) != 0) return false;
        return Double.compare(point.yCoOrdinate, yCoOrdinate) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(xCoOrdinate);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(yCoOrdinate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double findDistance(Point that) {
        return Math.sqrt(Math.pow(this.xCoOrdinate - that.xCoOrdinate, 2) +
                Math.pow(this.yCoOrdinate - that.yCoOrdinate, 2));
    }
}
