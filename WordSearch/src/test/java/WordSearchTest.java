
import com.axelolea.WordSearch;
import junit.framework.Assert;
import org.junit.Test;


public class WordSearchTest {
    
    @Test
    public void testOne () {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        
        String word = "ABCCED";
        
        Assert.assertTrue(
                WordSearch.exist(board, word)
        );
    }
    
    
    @Test
    public void testTwo () {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        
        String word = "SEE";
        
        Assert.assertTrue(
                WordSearch.exist(board, word)
        );
    }
    
    @Test
    public void testThree () {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        
        String word = "ABCB";

        Assert.assertFalse(
                WordSearch.exist(board, word)
        );
    }
}
