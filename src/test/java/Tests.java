 /**
 * Created by adrachuk on 22.11.2016.
 */
import org.junit.Ignore;
import org.junit.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
public class Tests {
    @Test
    public void testPassed(){
        System.out.println("testPassed");
        assertEquals(true,true);
    }

    @Test
    public void testPassed2(){
        System.out.println("testPassed2");
        assertEquals(true,true);
    }

    @Test
    public void testFailed(){
        assertEquals(true,true);
    }

    @Test
    public void testWarning(){
        assertEquals(true,true);
    }

    @Test
    public void testWarning2(){
        assertEquals(true,true);
    }
}