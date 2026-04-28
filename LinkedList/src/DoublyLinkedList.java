public class DoublyLinkedList {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

//    addfirst
    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

//        1->2->3->4->5
    }
//    addlast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = newNode;
//        newNode.prev = temp;

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

//    removefirst
    public void removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head == tail){
            head = tail = null;
            return;
        }
            head = head.next;
            head.prev = null;

    }

//    removelast
    public void removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head == tail){
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

//    display
    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }

    public static void main(String[] args) {
         DoublyLinkedList d1 = new DoublyLinkedList();
         d1.addfirst(5);
        d1.addfirst(4);
        d1.addfirst(3);
        d1.addfirst(2);
        d1.addfirst(1);

        d1.display();

        d1.removeFirst();
        d1.removeFirst();

        d1.display();

        d1.addLast(10);
        d1.addLast(30);
        d1.display();
        d1.removeLast();

        d1.display();

    }
}
