package Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.stream.*;
import java.util.Iterator;

public class CollectionSample {
   /* public static void print(Set e) {
        System.out.println("--------------------------");
        e.stream().forEach(p -> System.out.print(p + " "));
        System.out.println("\n--------------------------");
    }*/
    public static void print(Set e){
        Iterator i = e.iterator();
        System.out.println("---------------------------------------");
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println("\n---------------------------------------");
    }
    public static void addString(Set e) {
        String[] s = {"a","b","c","d","a","b","c","d","a","c","e","f"};
        for (String string : s) {
            e.add(string);
        }
    }
    public static void addNumbers(Set e){
        for(int i = 1; i<6; i++){
            e.add(i);
        }
    }

    public static void hashSet() {
        Set<String> s = new HashSet<String>();
        Set<String> s1 = new HashSet<String>();
        addString(s);
        print(s);
        s.add("six");
        s.add("one");
        print(s);
        s.remove("six");
        print(s);
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");
        s.addAll(s1);
        print(s);
    }
    public static void linkedHshSet(){
        Set<Integer> n = new LinkedHashSet<Integer>();
        addNumbers(n);
        print(n);
        n.add(25);n.add(25);
        n.add(50);n.add(25*2);
        n.add(25*3);n.add(25*4);
        print(n);
        n.removeIf(e->(e%2 == 0));
        print(n);
        if(n.contains(25)){
            System.out.println("The Object is availble");
        }
        n.spliterator();
        print(n);
    }
    public static void treeSet(){
        Set<String> s = new TreeSet<String>();
        addString(s);
        Set<Integer> n = new TreeSet<Integer>();
        addNumbers(n);
        print(s);
        print(n);
        n.removeIf(e->e%2==0);
        print(n);
        n.add(10);
        n.add(20);
        n.add(30);
        n.add(20-10);
        print(n);
        s.clear();
        s.add("naresh");
        s.add("ramu");
        s.add("rajesh");
        s.add("raju");
        s.add("jayanth");
        s.add("puji");
        print(s);
        Object[] a = s.toArray();
        for (Object object : a) {
            System.out.print(object+" ");
        }
        Arrays.sort(a);
        System.out.println();
        for (Object object : a) {
            System.out.print(object+" ");
        }
    }
    public static void main(String[] args) {
        treeSet();
    }


}
