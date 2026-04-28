public class Circular_Queue {

   static class CircularQueue{
        static int size;
        static int arr[];
        static int rear;
        static int front;

        CircularQueue(int n){
            size = n;
            arr = new int[n];
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){
             if(isFull()){
                 System.out.println("Queue is full");
             }

             //first element
             if(front == -1){
                 front = 0;
             }


             rear = (rear+1)%size;
             arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];

//            when last element is being deleted
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1) % size;
            }
             return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
             return -1;
            }
            return arr[front];

        }
    }


    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.add(10);
        q.add(20);
        q.add(30);


        System.out.println(q.remove());
        q.add(40);
        System.out.println(q.remove());
        q.add(50);
        q.add(60);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
