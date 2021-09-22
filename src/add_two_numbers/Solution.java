package add_two_numbers;

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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(5, new ListNode(9, new ListNode(5)));

        System.out.println("First list: " + l1 + ", Second list: " + l2 + ", Sum list: " + addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = 0;
        ListNode ans = new ListNode();
        ListNode cur = ans;
        while(l1 != null || l2 != null || i == 1){
            int s = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + i;
            if(s > 9){
                i = 1;
                s -= 10;
            } else i = 0;

            cur.next = new ListNode(s);
            cur = cur.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return ans.next;
    }
}
