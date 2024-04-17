package _list;

import java.util.ArrayList;
import java.util.List;

public class Mylist {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        myList1.add("a");
        myList1.add("b");
        myList1.add("c");
        System.out.println(myList1.size());
        List<String> myList2 = new ArrayList<>();
        myList2.add("e");
        myList2.add("f");
        myList1.addAll(myList2);
        System.out.println(myList1.get(0));
        myList1.set(0,"new element");
        System.out.println(myList1.indexOf("b"));
        myList1.add("b");
        System.out.println(myList1.lastIndexOf("b"));
        myList1.remove(2);
       // myList1.clear();
        System.out.println(myList1.contains("f"));
        List<String> newList = myList1.subList(1,3);
        System.out.println("___________");
        for(String element : myList1 ){
            System.out.println(element+"\t");
        }
        System.out.println("___________");
        for(String element : newList ){
            System.out.println(element+"\t");
        }
    }
}
