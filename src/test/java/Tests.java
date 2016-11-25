 /**
 * Created by adrachuk on 22.11.2016.
 */
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Tests {
    @Test
    public void testPassed(){
        assertEquals(true,true);
    }

    @Test
    public void testPassed2(){
        assertEquals(true,true);
    }

    @Test
    @Ignore
    public void testFailed(){
        assertEquals(true,true);
    }

    @Test
    @Ignore
    public void testWarning(){
        assertEquals(true,false);
    }
}
