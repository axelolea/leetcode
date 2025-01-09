
import com.axelolea.AddTwoNumbers;
import com.axelolea.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {
    
    private ListNode createNode (int[] arr) {
        
        ListNode node = null;
        
        for(int i = arr.length - 1; i >= 0; i--){
            ListNode n = new ListNode(arr[i]);
            if(node == null)
                node = n;
            else {
                n.next = node;
                node = n;
            }
        }
        
        return node;
    }
    
    private boolean validateListNode(ListNode n1, ListNode n2){
        while(n1 != null && n2 != null){
            if(n1.val != n2.val)
                return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        if(n1 != null || n2 != null)
            return false;
        return true;
    }
    
    @Test
    public void testOne () {
        ListNode node1 = createNode(new int[]{2,4,3});
        ListNode node2 = createNode(new int[]{5,6,4});
        ListNode output = createNode(new int[]{7,0,8});
        
        Assert.assertTrue(
                validateListNode(
                        AddTwoNumbers.addTwoNumbers(node1, node2),
                        output
                )
        );
    }
    
    @Test
    public void testTwo () {
        ListNode node1 = createNode(new int[]{0});
        ListNode node2 = createNode(new int[]{0});
        ListNode output = createNode(new int[]{0});
        
        Assert.assertTrue(
                validateListNode(
                        AddTwoNumbers.addTwoNumbers(node1, node2),
                        output
                )
        );
    }
    
    @Test
    public void testThree () {
        ListNode node1 = createNode(new int[]{9,9,9,9,9,9,9});
        ListNode node2 = createNode(new int[]{9,9,9,9});
        ListNode output = createNode(new int[]{8,9,9,9,0,0,0,1});
        
        ListNode n = AddTwoNumbers.addTwoNumbers(node1, node2);
        Assert.assertTrue(
                validateListNode(
                        n,
                        output
                )
        );
    }
    
}
