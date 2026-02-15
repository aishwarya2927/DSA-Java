import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void basic(){
        //       ArrayList is a part of Java Collection Framework
//        Declaration
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

//        Operations :
//        Add Element  ->O(1)
//        Get Element  ->O(1)
//        Remove ELement ->O(n)
//        Set Elment at Index -> O(n)
//        COntains Element -> O(n)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(4);
        System.out.println(list);

        list.set(3,30);
        System.out.println(list);

        System.out.println(list.contains(9));


//        add
        list.add(2,20);
        System.out.println(list);


//        size of an ArrayList
        System.out.println(list.size());

//        print arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

//        question
//        Reverse of an arraylist
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=1; i<6; i++){
            num.add(i);
        }
        System.out.println(num);

        for(int i=num.size(); i>=1; i--){
            System.out.print(i + " ");
        }

//         Find Maximum in an ArrayList
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(2);
        mylist.add(5);
        mylist.add(9);
        mylist.add(6);
        mylist.add(8);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<mylist.size(); i++){
//           if(max < mylist.get(i)){
//               max = mylist.get(i);
//           }
            max = Math.max(max, mylist.get(i));
        }
        System.out.println();
        System.out.println("Maximum element :");
        System.out.println(max);


    }

    //        Swap two elements
    public static void swap(ArrayList<Integer> mylist1, int i, int j) {

        System.out.println(mylist1);
        int temp = mylist1.get(i);
        mylist1.set(i,mylist1.get(j));
        mylist1.set(j,temp);

        System.out.println(mylist1);
    }

//    Collections Class
//    sorting an ArrayList
    public static void collectionList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(50);
        list.add(9);
        list.add(60);
        list.add(8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


//        descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    public static void main(String[] args) {
//        basic();

        ArrayList<Integer> mylist1 = new ArrayList<>();
        mylist1.add(2);
        mylist1.add(5);
        mylist1.add(9);
        mylist1.add(6);
        mylist1.add(8);

//        swap(mylist1,1,3);

        collectionList();
    }




}
