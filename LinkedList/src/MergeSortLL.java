import java.util.LinkedList;

public class MergeSortLL {
    public static class Node {
        int data;
        MergeSortLL.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static MergeSortLL.Node head;
    public static MergeSortLL.Node tail;
    public void addLast(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node lh, Node rh){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (lh != null && rh !=null){
            if(lh.data <= rh.data){
                temp.next = lh;
                lh = lh.next;
                temp = temp.next;
            }else{
                temp.next = rh;
                rh = rh.next;
                temp = temp.next;
            }
        }
        while(lh != null){
            temp.next = lh;
            lh = lh.next;
            temp = temp.next;

        }

        while(rh != null){
            temp.next = rh;
            rh = rh.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
//            1. find mid
        Node mid = getMid(head);

//        2. left and right head
        Node righthalf = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthalf);

//        3. merge
        return merge(newLeft, newRight);
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
       MergeSortLL l1 = new MergeSortLL();
       l1.addLast(1);
       l1.addLast(11);
       l1.addLast(4);
       l1.addLast(6);
       l1.addLast(3);
       l1.addLast(1);

       l1.printList();
   l1.head =  l1.mergeSort(l1.head);

   l1.printList();

    }
}
