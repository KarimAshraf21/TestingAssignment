import junit.framework.TestCase;
import org.junit.Test;

public class question1Test extends TestCase {
    @Test
    public void testwatermelon(){
        var tester=new question1();
        assertEquals("yes",tester.watermelon(50));
        assertEquals("no",tester.watermelon(49));

    }
    @Test(expected = IllegalArgumentException.class)

    public void testwatermelon2(){
        var tester=new question1();
        tester.watermelon(200);
    }


}