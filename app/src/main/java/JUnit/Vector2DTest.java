package JUnit;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class Vector2DTest {

    private final double EPS = 1e-9;
    private static Vector2D v;

    @BeforeClass
    public static void newVector(){
        v = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZerroLenght(){
        assertEquals(0,v.lenght(),EPS);
    }

    @Test (expected = ArithmeticException.class)
   public void zeroDenaminatirShoudThrowException(){
        v.devadet(5,0);

    }

    @Test (timeout = 1000)
    public void getConnectionShudReternFasterThen1Second(){
        v.getConection();
    }
}
