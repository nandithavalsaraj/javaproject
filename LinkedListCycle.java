public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){return false;}
        ListNode slowRunner = head;
        ListNode fastRunner = head.next;
        while(fastRunner!=null && slowRunner!=fastRunner ){
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next!=null? fastRunner.next.next:fastRunner.next;
        }
        return fastRunner!=null;
    }
}