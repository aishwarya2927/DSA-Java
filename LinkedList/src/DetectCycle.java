public class DetectCycle {
    public class Node{
        int data;
        DetectCycle.Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static DetectCycle.Node head;
    public static DetectCycle.Node tail;

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

//    Floyd's Cycle finding algorithm
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }

        }
        return false;
    }



    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void main(String[] args) {
//        DetectCycle l1 = new DetectCycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(isCycle());



    }
}
