
import com.axelolea.CountingWordsWithaGivenPrefix;
import junit.framework.Assert;
import org.junit.Test;

public class CountingWordsWithaGivenPrefixTest {
    
    @Test
    public void testOne() {
        String[] words = new String[]{"pay","attention","practice","attend"};
        String pref = "at";
        
        Assert.assertEquals(
                2,
                CountingWordsWithaGivenPrefix.prefixCount(words, pref)
        );
    }
    
    @Test
    public void testTwo() {
        String[] words = new String[]{"leetcode","win","loops","success"};
        String pref = "code";
        
        Assert.assertEquals(
                0,
                CountingWordsWithaGivenPrefix.prefixCount(words, pref)
        );
    }
    
}
