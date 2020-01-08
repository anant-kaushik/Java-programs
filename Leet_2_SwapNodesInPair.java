public class Leet_2_SwapNodesInPair {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode firstNode = head;
        ListNode secondNode = head.next;

        ListNode swappedSecond = firstNode;
        swappedSecond.next = swapPairs(secondNode.next);

        ListNode swappedFirst = secondNode;
        swappedFirst.next = swappedSecond;

        return swappedFirst;
    }

    public static void main(String[] args) {
        // prepare
        int[] testArray = { 1, 2, 3, 4, 5 };
        ListNode head = new ListNode(testArray[0]);
        ListNode currNode = head;

        for (int i = 1; i < testArray.length; i++) {
            ListNode newNode = new ListNode(testArray[i]);
            newNode.next = null;

            currNode.next = newNode;
            currNode = newNode;
        }

        System.out.println("Main array is ");
        ListNode newNode = head;
        while (newNode.next != null) {
            System.out.print(newNode.val + ", ");
            newNode = newNode.next;
        }
        System.out.print(newNode.val);

        // run
        Leet_2_SwapNodesInPair sol = new Leet_2_SwapNodesInPair();
        newNode = sol.swapPairs(head);

        // print
        System.out.println("\nSwapped array is ");
        while (newNode.next != null) {
            System.out.print(newNode.val + ", ");
            newNode = newNode.next;
        }
        System.out.print(newNode.val);
    }
}