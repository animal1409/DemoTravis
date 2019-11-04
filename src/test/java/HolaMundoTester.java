import org.junit.Assert;
import org.junit.Test;

public class HolaMundoTester {

    @Test
    public void ProbarHolaMundo()
    {
        String objValue = new HolaMundo("hola mudo").getSaludo();
        Assert.assertEquals("hola mudo",objValue);
    }

    @Test
    public void ProbarMetodoDos()
    {
        HolaMundo hola2 = new HolaMundo("hola mudo");
        Assert.assertEquals("este es el metodo dos ", hola2.metododos());
    }



}
