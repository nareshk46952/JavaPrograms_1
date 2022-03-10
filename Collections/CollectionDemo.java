import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.*;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class CollectionDemo {

    public static void printElements(Collection e) {
        System.out.println("--------------------------------------");
        e.stream().forEach(p -> System.out.print(p + " "));
        System.out.println("\n--------------------------------------");
    }
    public static void iteratoringOverElements(Collection e){
        Iterator i = e.iterator();
        System.out.println("---------------------------------------");
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println("\n---------------------------------------");
    }
    public static void addingNumbers(Collection e) {
        for (int i = 1; i <= 5; i++) {
            e.add(i);
        }
    }

    public static void addString(Collection e) {
        String[] s = { "one", "two", "three", "four", "five" };
        for (String string : s) {
            e.add(string);
        }
    }

    public static void arrayList() {
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<String> str = new ArrayList<String>();
        str.add("naresh");
        str.add("ramu");
        str.add("rajesh");
        str.add("imran");
        str.add("naga");
        addingNumbers(num);
        printElements(num);
        System.out.println(str);
        printElements(str);
        System.out.println("Before adding the ELements");
        printElements(num);
        System.out.println("After adding the new eLements");
        // For adding a new elements
        num.add(10);
        // For updating elements in Exciting collection
        num.set(1, 888);
        System.out.println();
        System.out.println("The size of collection is " + num.size());
        System.out.println("The condition of collection is " + num.isEmpty());
        System.out.println("Printing all elements after Collections.addAll() method ");
        Collections.addAll(num, 8, 9, 1, 2, 5, 4, 7, 8, 9, 4, 5, 8);
        printElements(num);
        System.out.println();
        System.out.println("The size of collections after adding " + num.size());
        num.remove(1);
        System.out.println("After Deleting of an element ");
        printElements(num);
        System.out.println("\nThe size of collections after removing " + num.size());
        Collections.sort(num);
        System.out.println("After sorting");
        printElements(num);
        boolean res = num.containsAll(num);
        if (res)
            num.clear();
        System.out.println("\nThe size of collections after clearing of collections " + num.size());
        System.out.println("\nAfter sorting");
        Collections.sort(str);
        printElements(str);
        String key = "naresh";
        int bSea = Collections.binarySearch(str, key);
        System.out.println("The " + key + " is available at index number " + bSea);
    }

    public static void vectorList() {
        Vector v = new Vector(100);
        v.add(10);
        v.add(20);
        v.add("Kuruva");
        v.add("Naresh");
        v.add(30);
        System.out.println(v);
        v.add(40);
        v.add("Added");
        System.out.println(v);
        v.remove("Added");
        System.out.println(v);
        System.out.println("Iterarting over an vector elements");
        printElements(v);
        v.set(0, "New one");
        System.out.println();
        printElements(v);
    }

    public static void stack() {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        s.add(5);
        s.remove(1);
        s.add(1, 10);
        s.set(1, 5);
        s.set(2, "new");
        s.set(3, 450.5);
        s.add("one");
        // s.stream().forEach(e -> System.out.print(" "+e));
        System.out.println("The element at top " + s.peek());
        System.out.println(s);
    }

    public static void linkedList() {
        LinkedList l = new LinkedList();
        addingNumbers(l);
        LinkedList l2 = new LinkedList();
        addingNumbers(l2);
        String[] names = { "naresh", "Ramu", "Tanesh", "Shaswat", "Pandu", "ajay" };
        System.out.println(l);
        // adding names to linkedList.
        for (String string : names) {
            l.add(string);
        }
        printElements(l);
        System.out.println("Before Removing of an element " + l.getLast() + "\t" + l.getFirst());
        // Removing an element through an index
        l.remove(0);
        System.out.println("After Removing of an element @ index 0 " + l.getLast() + "\t" + l.getFirst());
        // Removing an element through object
        l.remove(names[1]);
        System.out.println("After Removing of an name " + l.getLast() + "\t" + l.getFirst());
        l.set(2, names[2]);
        System.out.println("After Updating @ index 2 " + l.getLast() + "\t" + l.getFirst());
        l.add(1, "index");
        System.out.println("After Adding @ index 1 " + l.getLast() + "\t" + l.getFirst());
        printElements(l);
        l.addAll(6, l2);
        printElements(l);
        System.out.println("After Adding all elements  @ index 6 " + l.getLast() + "\t" + l.getFirst());
        System.out.println("-------------------Printing elements by using peek() methods-----------------------------");
        System.out.println("Printing elements by using peek elements " + l.peek());
        /*
         * System.out.println("After Using peek() method "+l.getLast()+"\t"+l.getFirst()
         * );
         * System.out.println("Printing elements by using peekFirst elements " +
         * l.peekFirst());
         */
        System.out.println("After Using peekFirst() method " + l.getLast() + "\t" + l.getFirst());
        System.out.println("Printing elements by using peekLast elements " + l.peekLast());
        System.out.println("After Using peeklast() method " + l.getLast() + "\t" + l.getFirst());
        printElements(l);
        System.out.println("-------------------Printing elements by using pool() methods-----------------------------");
        /*
         * System.out.println("Printing elements by using pool elements " + l.poll());
         * System.out.println("After Using pool() method "+l.getLast()+"\t"+l.getFirst()
         * );
         */
        System.out.println("Printing elements by using poolFirst elements " + l.pollFirst());
        System.out.println("After Using pooFirst() method " + l.getLast() + "\t" + l.getFirst());
        System.out.println("Printing elements by using poolLast elements " + l.pollLast());
        System.out.println("After Using poolLast() method " + l.getLast() + "\t" + l.getFirst());
        printElements(l);
        System.out.println(l.getLast());
        Collections.sort(l2);
        System.out.println("-------------------After Sorting-----------------------------");
        printElements(l2);
        l.offerFirst("Offered@First");
        printElements(l);
        l2.offer("Offered");
        printElements(l2);
        l2.offerLast("Offered@Last");
        printElements(l2);
        l2.offer("Offered@NewOne");
        printElements(l2);
    }

    public static void queue() {
        System.out.println("                      PriorityQueue                   ");
        Queue<Integer> qNum = new PriorityQueue<Integer>();
        addingNumbers(qNum);
        printElements(qNum);
        int reNum = qNum.remove();
        System.out.println("Removed " + reNum);
        printElements(qNum);
        int head = qNum.peek();
        System.out.println("The head of queue " + head);
        System.out.println("The added number to queue " + qNum.add(15));
        printElements(qNum);
        System.out.println("                      LinkedList                   ");
        Queue<Integer> lL = new LinkedList<Integer>();
        addingNumbers(lL);
        printElements(lL);
        System.out.println("The head of the Queue " + lL.peek());
        System.out.println("The head of the Queue is removed " + lL.poll());
        printElements(lL);
        System.out.println("                      PriorityBlockingQueue                   ");
        Queue<Integer> qP = new PriorityBlockingQueue<Integer>();
        addingNumbers(qP);
        System.out.println("The head of the Queue " + qP.peek());
        System.out.println("The head of the Queue is removed " + qP.poll());
        System.out.println("The head of the Queue " + qP.peek());
        printElements(qP);
        System.out.println("The first one(FIFO) is removed " + qP.remove());
        System.out.println("The head of the Queue " + qP.peek());
        printElements(qP);
        System.out.println("The Element is added at last index " + qP.add(10));
        printElements(qP);
        System.out.println("Adding all elements to the Queue " + qP.addAll(lL));
        printElements(qP);
    }

    public static void deQueue() {
        Deque<Integer> dNum = new ArrayDeque<Integer>();
        addingNumbers(dNum);
        printElements(dNum);
        dNum.addFirst(11);
        dNum.addLast(20);
        printElements(dNum);
        System.out.println("The head(peek()) of the dequeue " + dNum.peek());
        System.out.println("The head(getFirst()) of the dequeue " + dNum.getFirst());
        System.out.println("The Tail(peekLast()) of the dequeue " + dNum.peekLast());
        System.out.println("The Tail(getLast()) of the dequeue " + dNum.getLast());
        System.out.println("The Head(poll()) of the dequeue " + dNum.poll());
        System.out.println("       after poll Method        ");
        System.out.println("The head(peek()) of the dequeue " + dNum.peek());
        System.out.println("The head(getFirst()) of the dequeue " + dNum.getFirst());
        System.out.println("The Tail(peekLast()) of the dequeue " + dNum.peekLast());
        System.out.println("The Tail(getLast()) of the dequeue " + dNum.getLast());
        System.out.println("The Head(poll()) of the dequeue " + dNum.pollLast());
        System.out.println("       after pollLast Method        ");
        System.out.println("The head(peek()) of the dequeue " + dNum.peek());
        System.out.println("The head(getFirst()) of the dequeue " + dNum.getFirst());
        System.out.println("The Tail(peekLast()) of the dequeue " + dNum.peekLast());
        System.out.println("The Tail(getLast()) of the dequeue " + dNum.getLast());
        System.out.println("The Final output is ");
        printElements(dNum);
        Deque<String> s = new ArrayDeque<String>();
        addString(s);
        printElements(s);
        s.addFirst("first");
        s.offerFirst("OfferedFirst");
        s.offerLast("OfferedLast");
        s.offer("offered");
        s.addFirst("firstNew");
        s.add("1");
        s.offer("2");
        printElements(s);
        System.out.println("The head(peek()) of the dequeue " + s.peek());
        System.out.println("The head(getFirst()) of the dequeue " + s.getFirst());
        System.out.println("The Tail(peekLast()) of the dequeue " + s.peekLast());
        System.out.println("The Tail(getLast()) of the dequeue " + s.getLast());
        System.out.println("The Head(poll()) of the dequeue " + s.poll());
        System.out.println("       after poll Method        ");
        System.out.println("The head(peek()) of the dequeue " + s.peek());
        System.out.println("The head(getFirst()) of the dequeue " + s.getFirst());
        System.out.println("The Tail(peekLast()) of the dequeue " + s.peekLast());
        System.out.println("The Tail(getLast()) of the dequeue " + s.getLast());
        System.out.println("The Head(poll()) of the dequeue " + s.pollLast());
        System.out.println("       after pollLast Method        ");
        System.out.println("The head(peek()) of the dequeue " + s.peek());
        System.out.println("The head(getFirst()) of the dequeue " + s.getFirst());
        System.out.println("The Tail(peekLast()) of the dequeue " + s.peekLast());
        System.out.println("The Tail(getLast()) of the dequeue " + s.getLast());
        System.out.println("The Final output is ");
        printElements(s);
        s.remove();
        System.out.println("       after remove() Method        ");
        printElements(s);
        s.removeFirst();
        System.out.println("       after removeFirst() Method        ");
        printElements(s);
        s.remove("four");
        System.out.println("       after remove(4) Method        ");
        printElements(s);
        s.removeLast();
        System.out.println("       after removeLast() Method        ");
        printElements(s);
        System.out.println("       Iterating over elements        ");
        iteratoringOverElements(s);
    }
    public static void main(String[] args) {
        deQueue();
    }
}
