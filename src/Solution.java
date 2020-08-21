public class Solution {

    // https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem?h_r=internal-search

    static boolean hasCycle(SinglyLinkedListNode head) {
        //my code starts here
        if(head == null){
            return false;
        }
        SinglyLinkedListNode slowN = head;
        SinglyLinkedListNode fastN = head.next;
        while (fastN != null  // to make sure the list is more than 1 node
                &&
                fastN.next != null){ // to make sure the a node connect to another node
            if (fastN == slowN){ // fast node will eventually meet slow node if list has cycle
                return true;
            }
            slowN = slowN.next;
            fastN = fastN.next.next;
        }
        return false;
        //my code ends here

    }


}

