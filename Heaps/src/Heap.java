import java.util.ArrayList;

public class Heap {

    static class HeapImpl{
        ArrayList<Integer> arr = new ArrayList<>();

//        Add in heap
        public void add(int data){
            arr.add(data); //add at last
            int x = arr.size()-1;
            int parent = (x-1)/2;

            while(arr.get(x) < arr.get(parent)){
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent,temp);

                x = parent;
                parent = (x-1)/2;
            }
        }

//        GET MIN IN HEAP
        public int peek(){
            return arr.get(0);
        }

//        DELETE IN A HEAP   ----MIN HEAP
        /*1.swap first and last index element
         2.delete last index element ----> arr.remove(arr.size()-1)
         3.fix the heap using ----> heapify()
        */

        //heapify
/*        min = min(i, 2*i+1, 2*i+2)
           swap min with root
*/

        public int remove(){
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);

heapify(0);
return data;

        }
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size()  && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right< arr.size()  && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

    }



    public static void main(String[] args) {
        HeapImpl hp = new HeapImpl();

        hp.add(10);
        hp.add(5);
        hp.add(3);
        hp.add(4);
        hp.add(2);

      while (!hp.isEmpty()){
          System.out.println(hp.peek());
          hp.remove();
      }
    }
}
