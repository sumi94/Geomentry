import com.sun.tools.javac.util.Pair;

public class Line {
    private Pair<Double, Double> startPoint;
    private Pair<Double, Double> endPoint;

    public Line(Pair startPoint, Pair endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double cartesianLength() {

        double xPointSquareDifference = Math.pow(this.startPoint.fst - this.endPoint.snd, 2);

        double yPointSquareDifference = Math.pow(this.startPoint.fst - this.endPoint.snd, 2);

        return Math.sqrt(xPointSquareDifference + yPointSquareDifference);
    }


    @Override
    public boolean equals(Object obj) {
        Line line = (Line) obj;
        if (startPoint.equals(line.startPoint)) {
            if (endPoint.equals(line.endPoint))
                return true;
        }

        if (startPoint.equals(line.endPoint)) {
            if (endPoint.equals(line.startPoint))
                return true;
        }
        return false;
    }


}
