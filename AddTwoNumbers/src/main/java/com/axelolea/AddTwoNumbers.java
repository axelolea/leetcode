package com.axelolea;

public class AddTwoNumbers {
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode last = null;
        int res = 0;
        
        while(l1 != null || l2 != null){
            int sum = res;
            res = 0;
            
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            if(sum >= 10){
                sum %= 10;
                res = 1;
            }
            
            ListNode node = new ListNode(sum);
            if(last == null){
                result = node;
                last = node;
            } else {
                last.next = node;
                last = node;
            }
        }
        
        if(res > 0 && last != null)
            last.next = new ListNode(res);
        
        return result;
    }
    
}
