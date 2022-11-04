package src.java.main.problems;
//https://leetcode.com/problems/add-two-numbers/description/
// better than 54.3% runtime and 59.91% memory
//optimal solution probably requires do while loop

import src.java.main.problems.necessary.ListNode;

public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        boolean over = false;
        int tmp_sum;
        ListNode currentNode = root;
        while (l1!= null || l2 != null) {
            tmp_sum = 0;
            if (over) {
                tmp_sum = 1;
                over = false;
            }

            if (l2 == null) {
                tmp_sum += l1.val;
            } else if (l1 == null) {
                tmp_sum += l2.val;
            } else {
                tmp_sum += (l2.val + l1.val);
            }
            if (tmp_sum >= 10) {
                over = true;
                tmp_sum -= 10;
            }
            currentNode.val = tmp_sum;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            if(!(l1==null && l2==null)){
                currentNode.next = new ListNode();
                currentNode = currentNode.next;
            }
        }
        if(over){
            currentNode.next = new ListNode(1);
        }
        return root;
    }
}
