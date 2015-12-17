import com.sun.tools.javac.util.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LineTest {

    @Test
    public void lengthOfLineWithStartPointZeroZeroEndPointZeroZero() {

        Pair<Double, Double> startPoint = new Pair<>(0d, 0d);
        Pair<Double, Double> endPoint = new Pair<>(0d, 0d);

        Line line = new Line(startPoint, endPoint);

        assertEquals(0d, line.cartesianLength(), 0d);
    }

    @Test
    public void lengthOfLineWithStartPointZeroZeroEndPointOneOne() {

        Pair<Double, Double> startPoint = new Pair<>(0d, 0d);
        Pair<Double, Double> endPoint = new Pair<>(1d, 1d);

        Line line = new Line(startPoint, endPoint);

        assertEquals(Math.sqrt(2), line.cartesianLength(), 0d);
    }

    @Test
    public void lengthOfLineWithStartPointZeroZeroEndPointTwoTwo() {

        Pair<Double, Double> startPoint = new Pair<>(0d, 0d);
        Pair<Double, Double> endPoint = new Pair<>(2d, 2d);

        Line line = new Line(startPoint, endPoint);

        assertEquals(Math.sqrt(8), line.cartesianLength(), 0d);
    }

    @Test
    public void lengthOfLineWithStartPointOneOneEndPointTwoTwo() {

        Pair<Double, Double> startPoint = new Pair<>(1d, 1d);
        Pair<Double, Double> endPoint = new Pair<>(2d, 2d);

        Line line = new Line(startPoint, endPoint);

        assertEquals(Math.sqrt(2), line.cartesianLength(), 0d);
    }

    @Test
    public void lengthOfLineWithStartPointMinusOneMinusOneEndPointTwoTwo() {

        Pair<Double, Double> startPoint = new Pair<>(-1d, -1d);
        Pair<Double, Double> endPoint = new Pair<>(2d, 2d);

        Line line = new Line(startPoint, endPoint);

        assertEquals(Math.sqrt(18d), line.cartesianLength(), 0d);
    }

    @Test
    public void shouldBeTrueForSamePairOfCoordinatesOriginAndOneOne() {
        Line firstLine = new Line(new Pair<>(0d, 0d), new Pair<>(1, 1));
        Line secondLine = new Line(new Pair<>(0d, 0d), new Pair<>(1, 1));

        assertEquals(firstLine,secondLine);
    }

    @Test
    public void shouldBeFalseForDifferentPairOfCoordinatesOriginAndOneOneOriginAndTwoTwo() {
        Line firstLine = new Line(new Pair<>(0d, 0d), new Pair<>(1, 1));
        Line secondLine = new Line(new Pair<>(0d, 0d), new Pair<>(2, 2));

        assertNotEquals(firstLine,secondLine);
    }

    @Test
    public void shouldBeTrueForCoordinatesOriginAndOneOneAndOneOneOrigin() {
        Line firstLine = new Line(new Pair<>(0d, 0d), new Pair<>(1, 1));
        Line secondLine = new Line(new Pair<>(1, 1), new Pair<>(0d, 0d));

        assertEquals(firstLine,secondLine);
    }
}
