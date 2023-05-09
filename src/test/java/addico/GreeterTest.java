package addico;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class GreeterTest 
{
    private Greeter greeter = new Greeter();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void greeterSaysHello()
    {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
