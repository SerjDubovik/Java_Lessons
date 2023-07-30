import org.junit.Test;
import ru.pufr.MyMath;

public class MyMathTest {

    @Test (expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException() {
        MyMath.divide(1,0);
    }
}
