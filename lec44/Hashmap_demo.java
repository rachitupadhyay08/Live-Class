package lec44;
import java.util.*;

public class Hashmap_demo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("RAj",77);
        map.put("Kunal",67);
        map.put("Ankit",97);
        map.put("Puneet",55);
        map.put("Pcr",39);
        map.put("Amisha",39);
        map.put("null",44);
        System.out.println(map); 
        
        //get
        System.out.println(map.get("Kaju"));
        System.out.println(map.get("Amisha"));

        // contains key
        System.out.println(map.containsKey("Kaju"));
        System.out.println(map.containsKey("Amisha"));

        // remove
        System.out.println(map.remove("Amisha"));
        System.out.println(map.remove("Kaju"));

        TreeMap<String,Integer> map1 = new TreeMap<>();
        map1.put("RAj",77);
        map1.put("Kunal",67);
        map1.put("Ankit",97);
        map1.put("Puneet",55);
        map1.put("Pcr",39);
        map1.put("Amisha",39);
        // map1.put(null,39);
        System.out.println(map1);

        LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
        map2.put("RAj",77);
        map2.put("Kunal",67);
        map2.put("Ankit",97);
        map2.put("Puneet",55);
        map2.put("Pcr",39);
        map2.put("Amisha",39);
        map2.put(null,39);
        System.out.println(map2);
        // Set<String> key = map.keySet();
        // for(String k:key){
        //     System.out.println(k+" "+map.get(k));
        // }
        for(String k:map.keySet()){
            System.out.println(k+" "+map.get(k));
        }
    }
}
// All work done in constant time. 
// Key-value pair.
// Order is not preserved.
// null as a key can be put in hasmap
// LinkedList is used to implement the Hashmap

// TreeMap me lon(n) TC rehti h kyki Red Black tree Implementation use hoi hai
// TreeMap me null as a key and daali jaa skti hai.

// LinkedHashMap ke liye doubly LinkedList data structure use kiya gya hai
// TC--> log(a) 
// null can be a key .


