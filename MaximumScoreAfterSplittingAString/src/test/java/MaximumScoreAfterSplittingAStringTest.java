
import com.axelolea.MaximumScoreAfterSplittingAString;
import org.junit.Assert;
import org.junit.Test;


public class MaximumScoreAfterSplittingAStringTest {

    @Test
    public void testOne() {
        Assert.assertEquals(
                5,
                MaximumScoreAfterSplittingAString.maxScore("00111")
        );
    }
    
    @Test
    public void testTwo() {
        Assert.assertEquals(
                5,
                MaximumScoreAfterSplittingAString.maxScore("011101")
        );
    }
    
    @Test
    public void testThree() {
        Assert.assertEquals(
                3,
                MaximumScoreAfterSplittingAString.maxScore("1111")
        );
    }
    
    @Test
    public void testFour() {
        Assert.assertEquals(
                1,
                MaximumScoreAfterSplittingAString.maxScore("11")
        );
    }
    
        @Test
    public void testFive() {
        Assert.assertEquals(
                1,
                MaximumScoreAfterSplittingAString.maxScore("00")
        );
    }
    
    @Test
    public void testSix() {
        Assert.assertEquals(
                5,
                MaximumScoreAfterSplittingAString.maxScore("00001")
        );
    }
}
