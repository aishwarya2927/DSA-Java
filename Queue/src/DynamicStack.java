public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super();  //it will call CustomStack()
    }

    public DynamicStack(int size){
        super();  //it will call CustomStack(int size)
    }

   @Override
    public boolean push(int item){
        if(this.isFull()){
            int[] temp = new int[data.length * 2];

//            copy all previous items in new data
            for(int i = 0; i< data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }

//        inset item
       return super.push(item);

    }



    public static void main(String[] args) {

        DynamicStack ds = new DynamicStack();
        ds.push(10);
        ds.push(50);
        ds.push(100);


    }
}
