import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHash_Map {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        System.out.println("LinkedHashMap:");  //doubly linked list is used
        lhm.put("India", 200);
        lhm.put("japan", 330);
        lhm.put("US",210);
        System.out.println(lhm);
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println("HashMap");  //singly linked list used  and the elements are printed randomly
        hm.put("India", 200);
        hm.put("japan", 330);
        hm.put("US",210);
        System.out.println(hm);


//        TreeMap
        /*O(log N)
        * Sorted order
        *Red-black  trees   ----> Self balancing binary search tree
         */
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 200);
        tm.put("Japan", 330);
        tm.put("US",210);
        System.out.println("Tree Map");
        System.out.println(tm);


        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(3);
//        hs.remove(2);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());

        if(hs.contains(2))
        {
            System.out.println("Hs contains 2");
        }

    }
}
