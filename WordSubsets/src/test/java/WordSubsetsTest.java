import com.axelolea.WordSubsets;
import org.junit.Assert;
import org.junit.Test;

public class WordSubsetsTest {
    
    @Test
    public void testOne () {
        String[] words1 = new String[]{
            "amazon",
            "apple",
            "facebook",
            "google",
            "leetcode"
        };
        
        String[] words2 = new String[]{"e","o"};
        
        Assert.assertArrayEquals(
                new String[]{"facebook","google","leetcode"},
                WordSubsets.wordSubsets(words1, words2).toArray(new String[0])
        );
    }
    
    @Test
    public void testTwo () {
        String[] words1 = new String[]{
            "amazon",
            "apple",
            "facebook",
            "google",
            "leetcode"
        };
        
        String[] words2 = new String[]{"l","e"};
        
        Assert.assertArrayEquals(
                new String[]{"apple","google","leetcode"},
                WordSubsets.wordSubsets(words1, words2).toArray(new String[0])
        );
    }
    
        @Test
    public void testThree () {
        String[] words1 = new String[]{
            "amazon",
            "apple",
            "facebook",
            "google",
            "leetcode"
        };
        
        String[] words2 = new String[]{"e","oo"};
        
        Assert.assertArrayEquals(
                new String[]{"facebook","google"},
                WordSubsets.wordSubsets(words1, words2).toArray(new String[0])
        );
    }
}
