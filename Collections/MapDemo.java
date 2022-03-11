package Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapDemo {
    public static void hasMap() {
        // using Genrics

        Map<Integer, String> mData = new HashMap<Integer, String>();
        mData.put(new Integer(1), "naresh");
        mData.put(new Integer(2), "ramesh");
        mData.put(new Integer(3), "mahesh");
        mData.put(new Integer(4), "raghu");
        mData.put(new Integer(5), "kalyan");
        // Iterating over the hashset
        System.out.println("Here the elments are stored and sorted according to hash code");
        printElements(mData);
        mData.remove(4);
        System.out.println("After removing key 4");
        printElements(mData);
        mData.put(6, "hemanth");
        System.out.println("After adding key 6");
        printElements(mData);
        mData.put(4, "lohth");
        System.out.println("After adding key 4");
        printElements(mData);

        Map<String, Integer> mData_1 = new HashMap<String, Integer>();
        mData_1.put("naresh", 1011);
        mData_1.put("rams", 1012);
        mData_1.put("viswa", 1013);
        mData_1.put("imran", 1014);
        mData_1.put("priya", 1015);
        mData_1.put("chiru", 1016);
        System.out.println("Here the elments(String , Integer) are stored and sorted according to hash code");
        printElementsOfTypeString(mData_1);
        mData_1.remove("imran");
        System.out.println("After removing key 4");
        printElementsOfTypeString(mData_1);
        mData_1.put("nayan", 1017);
        System.out.println("After adding key 6");
        printElementsOfTypeString(mData_1);
        mData_1.put("imran", 4);
        System.out.println("After adding key 4");
        printElementsOfTypeString(mData_1);
    }

    // Common Method for Iterating to Integer type Elements
    public static void printElements(Map<Integer, String> m) {
        for (Map.Entry<Integer, String> ele : m.entrySet()) {
            System.out.println(ele.getKey() + " : " + ele.getValue());
        }
    }

    // Common Method for Iterating to String type Elements
    public static void printElementsOfTypeString(Map<String, Integer> m) {
        for (Map.Entry<String, Integer> ele : m.entrySet()) {
            System.out.println(ele.getKey() + " : " + ele.getValue());
        }
    }

    public static void linkedHashMap() {
        Map<Integer, String> m = new LinkedHashMap<>();
        m.put(1, "ajay");
        m.put(2, "jai");
        m.put(3, "chandra");
        m.put(4, "lakshmi");
        m.put(5, "Ravi");
        // Iterating over an elements
        System.out.println("Here the elments are stored and sorted according to nodes(Linked list principle");
        printElements(m);
        m.remove(4);
        System.out.println("After removing key 4");
        printElements(m);
        m.put(6, "hemanth");
        System.out.println("After adding key 6");
        printElements(m);
        m.put(4, "lohth");
        System.out.println("After adding key 4");
        printElements(m);
        Map<Integer, String> mData = new HashMap<Integer, String>();
        mData.putAll(m);
        System.out.println("Printing elemting by using put all method");
        printElements(mData);    
    }

    public static void treeMap() {
        Map<Integer, String> m = new TreeMap<Integer, String>();
        m.put(1, "ajay");
        m.put(2, "jai");
        m.put(3, "chandra");
        m.put(4, "lakshmi");
        m.put(5, "Ravi");
        // Iterating over an elements
        System.out.println("Here the elments are stored and sorted according to Tree Map Principle");
        printElements(m);
        m.remove(4);
        System.out.println("After removing key 4");
        printElements(m);
        m.put(6, "hemanth");
        System.out.println("After adding key 6");
        printElements(m);
        m.put(4, "lohth");
        System.out.println("After adding key 4");
        printElements(m);
    }

    public static void main(String[] args) {
        linkedHashMap();
    }
}
