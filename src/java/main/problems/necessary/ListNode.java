package src.java.main.problems.necessary;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void printList(){
        ListNode current = this;
        while(current != null){
            System.out.println(current.val);
            current=current.next;
        }
    }
}
