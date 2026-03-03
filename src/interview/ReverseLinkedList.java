package interview;

/**
 * 反转单链表的经典题目。
 */
public class ReverseLinkedList {

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;

        ListNode newHead = reverse(a);
        ListNode p = newHead;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
    }
}

