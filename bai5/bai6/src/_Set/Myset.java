package _Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Myset {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("element 1");
        mySet.add("element 2");
        mySet.add("element 3");
//        for(String element:mySet){
//            System.out.println(element);
//        }
//        System.out.println("---------");
//        Iterator<String> iterator = mySet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        Set<String> mySet2 = new HashSet<>();
        mySet2.add("element 4");
        mySet2.add("element 4");
        mySet.addAll(mySet2);
        System.out.println(mySet.size());
        System.out.println(mySet.isEmpty());
        System.out.println(mySet.contains("element 4"));
        System.out.println("---------");
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
