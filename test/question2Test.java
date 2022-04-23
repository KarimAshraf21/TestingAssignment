import junit.framework.TestCase;
import org.junit.Test;

public class question2Test extends TestCase {
    @Test

    public void testEquilibrium() {
        var tester=new question2();
        int arr[][] = {{3,-1,7}, {-5,2,-4}, {2,-1,-3}};
        assertEquals("yes", tester.Equilibrium(arr));
        int arr1[][] = {{4, 1, 7}, {-2, 4, -1}, {1, -5, -3}};
        assertEquals("no", tester.Equilibrium(arr1));

    }
}