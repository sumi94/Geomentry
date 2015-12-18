import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PointTest {

    @Test
    public void twoSamePointsShouldBeEqual(){

        Point firstPoint = new Point(0d, 0d);
        Point secondPoint = new Point(0d, 0d);

        assertEquals(firstPoint, secondPoint);
    }


    @Test
    public void twoDifferentPointsShouldNotBeEqual(){

        Point firstPoint = new Point(1d, 1d);
        Point secondPoint = new Point(0d, 0d);

        assertNotEquals(firstPoint, secondPoint);
    }

    @Test
    public void lengthIsZeroForSamePoints(){

        Point firstPoint = new Point(0d, 0d);
        Point secondPoint = new Point(0d, 0d);

        double length = firstPoint.findDistance(secondPoint);

        assertEquals(0d, length, 0);
    }

    @Test
    public void lengthIsSqrtOfTwoForPointZeroZeroToPointOneOne(){

        Point firstPoint = new Point(0d, 0d);
        Point secondPoint = new Point(1d, 1d);

        double length = firstPoint.findDistance(secondPoint);

        assertEquals(Math.sqrt(2), length, 0);
    }

}
