public class LinkedList_Operations {
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
    public static int size;

    //    Methods to add, print, search etc in a linked list
    public void addFirst(int data) {
        //        1. create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

//        2. newNode->next = head
        newNode.next = head;

//        update head to newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        newNode.next = null;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void addAtIndex(int data, int idx){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            size--;
            int val = head.data;
            head = tail = null;
            return val;
        }
        size--;
        int val = head.data;
        head = head.next;
       return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty ");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;

        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int searchIndex(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int recursiveSearch(int key){
        return helper(head,key);
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
            if(idx == -1){
                return -1;
            }
            return idx+1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedList_Operations l1 = new LinkedList_Operations();
//        l1.head = new Node(1);
//        l1.head.next = new Node(2);
        l1.printList();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.printList();
        l1.addLast(3);
        l1.addLast(4);
        l1.printList();
        l1.addAtIndex(6,2);
        l1.removeFirst();
        l1.printList();
        l1.removeLast();
        l1.printList();

        System.out.println(l1.size);

        System.out.println("Key found at index :"+l1.searchIndex(6));

        System.out.println(l1.recursiveSearch(6));
        System.out.println(l1.recursiveSearch(0));
    }
}
