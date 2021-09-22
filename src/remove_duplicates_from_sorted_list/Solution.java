package remove_duplicates_from_sorted_list;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString(){
        StringBuilder ans = new StringBuilder("[");
        ListNode node = this;
        while(node != null){
            ans.append(node.val);
            if(node.next != null)
                ans.append(", ");
            node = node.next;
        }

        return ans.append("]").toString();
    }
}

public class Solution {

    public static void main(String[] args){
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(3, new ListNode(3))));
        String initialHead = head.toString();
        System.out.println("Remove duplicates from " + initialHead + " = " + deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode lastNode = head;

        while(lastNode.next != null) {
            if(lastNode.val == lastNode.next.val)
                lastNode.next = lastNode.next.next;
            else
                lastNode = lastNode.next;
        }
        return head;
    }
}
