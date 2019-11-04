import org.junit.Assert;
import org.junit.Test;

public class HolaMundoTester {

    @Test
    public void ProbarHolaMundo()
    {
        String objValue = new HolaMundo("hola mudo").getSaludo();
        Assert.assertEquals("hola mudo",objValue);
    }

}
