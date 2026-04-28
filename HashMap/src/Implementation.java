import java.util.HashMap;
import java.util.Set;

public class Implementation {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("CHina", 150);
        map.put("India", 100);
        map.put("Japan", 320);
        map.put("Russia", 210);
        map.put("Nepal", 222);



        System.out.println(map);

        int popu = map.get("CHina");
        System.out.println(popu);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("CHina"));
        System.out.println(map.get("Indoo"));
        System.out.println(map.containsKey("Indo"));
        map.remove("CHina");
        map.put("India", 455);
        System.out.println(map);


//        Terate on a HashMap
        Set<String> keys = map.keySet();
        System.out.println(keys);

//        for each loop
        for(String string : keys){
            System.out.println("Key="+ string + " value="+ map.get(string));
        }

    }
}
