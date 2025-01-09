
import com.axelolea.TwoSum;
import org.junit.Assert;
import org.junit.Test;


public class TwoSumTest {
    @Test
    public void testOne(){
        int[] arr = {2,7,11,15};
        int target = 9;
        
        Assert.assertArrayEquals(
                new int[]{0,1},
                TwoSum.twoSum(arr, target)
        );
    }
    
    @Test
    public void testTwo(){
        int[] arr = {3,2,4};
        int target = 6;
        
        Assert.assertArrayEquals(
                new int[]{1, 2},
                TwoSum.twoSum(arr, target)
        );
    }
    
    @Test
    public void testThree(){
        int[] arr = {3,3};
        int target = 6;
        
        Assert.assertArrayEquals(
                new int[]{0,1},
                TwoSum.twoSum(arr, target)
        );
    }
}
