public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double cartesianLength() {

        return startPoint.findDistance(endPoint);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        return startPoint.equals(line.startPoint) && endPoint.equals(line.endPoint) ||
                startPoint.equals(line.endPoint) && endPoint.equals(line.startPoint);

    }

    @Override
    public int hashCode() {
        int result = startPoint != null ? startPoint.hashCode() : 0;
        result = 31 * result + (endPoint != null ? endPoint.hashCode() : 0);
        return result;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Line line = (Line) obj;
//        return startPoint.equals(line.startPoint) && endPoint.equals(line.endPoint) ||
//                startPoint.equals(line.endPoint) && endPoint.equals(line.startPoint);
//
//    }


}
