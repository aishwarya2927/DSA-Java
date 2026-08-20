import java.time.temporal.Temporal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashset {


    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();

        city.add("Delhi");
        city.add("Mumbai");
        city.add("Noida");

        Iterator it = city.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

//        -------------------OR--------------------
//        for(String s : city){
//            System.out.println(s);
//        }


        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("lhs-Pune");
        lhs.add("lhs-Ujjain");
        lhs.add("lhs-Jammu");

        System.out.println(lhs);


//        TreeSet --- Sorted in asc order
//                ----Null values are not allowed
        TreeSet<String> ts = new TreeSet<>();
        ts.add("ts-Kolkata");
        ts.add("ts-Banglore");
        ts.add("ts-Hydrabad");

        System.out.println(ts);
    }
}
