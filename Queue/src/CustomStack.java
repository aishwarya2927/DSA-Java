import java.util.Objects;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    private boolean isEmpty(){
        return  ptr == -1;
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack!!");
        }
//        int removedItem = data[ptr];
//        ptr--;
//        return removedItem;

        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }
    public static void main(String[] args) throws Exception {
      CustomStack cs = new CustomStack(5);
      cs.push(10);
      cs.push(20);
      cs.push(30);
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.peek());
    }
}
