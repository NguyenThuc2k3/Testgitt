package _Map;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"one");
        myMap.put(2,"two");
        myMap.put(3,"three");
   //     System.out.println(myMap.get(2));
        Map<Integer,String> myMap2 = new HashMap<>();
        myMap2.put(4,"four");
        myMap2.put(5,"five");
        myMap.putAll(myMap2);
        for(Integer key: myMap.keySet()){
            System.out.println(myMap.get(key));
        }
        System.out.println(myMap.containsKey(5));
        System.out.println(myMap.containsValue("five"));

    }
}
