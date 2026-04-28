public class ReverseLinkedList {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void reverse(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            System.out.println(head.data);
            return;
        }
        Node curr = tail = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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

    public static void main(String[] args) {
        ReverseLinkedList l1 = new ReverseLinkedList();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);

     l1.display();
  l1.reverse();
  l1.display();

    }
}
