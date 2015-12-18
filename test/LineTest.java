import com.sun.tools.javac.util.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LineTest {

    @Test
    public void lengthOfLineWithStartPointZeroZeroEndPointZeroZero() {

        Point startPoint = new Point(0d, 0d);
        Point endPoint = new Point(0d, 0d);

        Line line = new Line(startPoint, endPoint);

        assertEquals(0d, line.cartesianLength(), 0d);
    }

    @Test
    public void lengthOfLineWithStartPointZeroZeroEndPointOneOne() {

        Point startPoint = new Point(0d, 0d);
        Point endPoint = new Point(1d, 1d);

        Line line = new Line(startPoint, endPoint);

        assertEquals(Math.sqrt(2), line.cartesianLength(), 0d);
    }

    @Test
    public void lengthOfLineWithStartPointZeroZeroEndPointTwoTwo() {

        Point startPoint = new Point(0d, 0d);
        Point endPoint = new Point(2d, 2d);

        Line line = new Line(startPoint, endPoint);

        assertEquals(Math.sqrt(8), line.cartesianLength(), 0d);
    }

    @Test
    public void lengthOfLineWithStartPointOneOneEndPointTwoTwo() {

        Point startPoint = new Point(1d, 1d);
        Point endPoint = new Point(2d, 2d);

        Line line = new Line(startPoint, endPoint);

        assertEquals(Math.sqrt(2), line.cartesianLength(), 0d);
    }

    @Test
    public void lengthOfLineWithStartPointMinusOneMinusOneEndPointTwoTwo() {

        Point startPoint = new Point(-1d, -1d);
        Point endPoint = new Point(2d, 2d);

        Line line = new Line(startPoint, endPoint);

        assertEquals(Math.sqrt(18d), line.cartesianLength(), 0d);
    }

    @Test
    public void shouldBeTrueForSamePairOfCoordinatesOriginAndOneOneToOriginAndOneOne() {
        Line firstLine = new Line(new Point(0d, 0d), new Point(1, 1));
        Line secondLine = new Line(new Point(0d, 0d), new Point(1, 1));

        assertEquals(firstLine,secondLine);
    }

    @Test
    public void shouldBeFalseForDifferentPairOfCoordinatesOriginAndOneOneToOriginAndTwoTwo() {
        Line firstLine = new Line(new Point(0d, 0d), new Point(1, 1));
        Line secondLine = new Line(new Point(0d, 0d), new Point(2, 2));

        assertNotEquals(firstLine,secondLine);
    }

    @Test
    public void shouldBeTrueForCoordinatesOriginAndOneOneToOneOneOrigin() {
        Line firstLine = new Line(new Point(0d, 0d), new Point(1, 1));
        Line secondLine = new Line(new Point(1, 1), new Point(0d, 0d));

        assertEquals(firstLine,secondLine);
    }
}
