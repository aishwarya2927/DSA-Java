public class RemoveCycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Floyd's Cycle detection and removal
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Step 1: Detect cycle

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return; // No cycle
        }

        // Step 2: Find start of cycle
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove cycle
        prev.next = null;
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveCycle list = new RemoveCycle();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // Creates cycle

        System.out.println("Before removing cycle:");
//        list.display(); // This will loop infinitely if cycle isn't removed

        list.removeCycle();

        System.out.println("After removing cycle:");
        list.display();
    }
}