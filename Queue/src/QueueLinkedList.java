public class QueueLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    static class Queue{
        static Node head;
        static Node tail;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }


        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next  = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            int front = head.data;

            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }

            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
             Queue  q = new Queue();
             q.add(10);
             q.add(20);
             q.add(30);

        System.out.println("Peek "+ q.peek());
        System.out.println("Remove "+q.remove());
        System.out.println("Peek "+q.peek());

    }
}
