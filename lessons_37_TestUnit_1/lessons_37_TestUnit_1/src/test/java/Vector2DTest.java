import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.pufr.Vector2D;

public class Vector2DTest {
    private  final double EPS = 1e-9;
    private Vector2D v1;

    @Before
    public void createNewVector() {
        v1 = new Vector2D();
    }

    @Test
    public  void newVectorShouldHaveZeroLength(){
        //Vector2D v1 = new Vector2D();     // для каждого выполняется в методе с @Before, создает экземпляр там а не тут
        // assertion
        Assert.assertEquals(0, v1.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        //Vector2D v1 = new Vector2D();    // для каждого выполняется в методе с @Before, создает экземпляр там а не тут
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        //Vector2D v1 = new Vector2D();    // для каждого выполняется в методе с @Before, создает экземпляр там а не тут
        Assert.assertEquals(0, v1.getY(), EPS);
    }
}
