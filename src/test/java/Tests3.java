 /**
 * Created by adrachuk on 22.11.2016.
 */

 import org.junit.Test;

 import static org.junit.Assert.assertEquals;

 public class Tests3 {
     @Test
     public void testPassed(){
         System.out.println("testPassed");
         assertEquals(true,true);
     }


     @Test
     public void testPassed2(){
         System.out.println("testPassed2");
         assertEquals(true,false);
     }

     @Test
     public void testPassed33(){
         System.out.println("testPassed33");
         assertEquals(true,false);
     }
 }
