import org.junit.Assert;
import org.junit.Test;
import ru.pufr.Vector2D;

public class Vector2DTest {
    @Test
    public  void newVectorShouldHaveZeroLength(){
        Vector2D v1 = new Vector2D();

        // assertion
        Assert.assertEquals(0, v1.length(), 1e-9);
    }
}
