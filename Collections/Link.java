package Collections;
public class Link {
    //Creating Head of Linked List.
    Node head;
    static class Node{
        int data ;
        Node next;
        //Constructor of LL.
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    void printList(){
        Node n = head;
        while(n != null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    public static void link(){
        Link h = new Link();
        h.head = new Node(0);
        Node sec = new Node(1);
        Node third = new Node(2);
        //Linking sec Node to head node
        h.head.next = sec;
        //Linking third Node to sec Node
        sec.next=third;
        /*System.out.println("This is head node value "+h.head.data);
        System.out.println("This is sec node value "+sec.data);
        System.out.println("This is third node value "+third.data);
        System.out.println("This is head.next node value "+h.head.next.data);
        System.out.println("This is head.data node value "+sec.next.data);*/
        h.printList();
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.a[0]+" "+s.a[1]+" "+s.a[2]);
        s.pop();
        System.out.println(s.a[0]+" "+s.a[1]+" "+s.a[2]);
    }
}
class Stack {
    int top = -1;
    int max = 100;
    int[] a = new int[max];
    //puch method to add elements in stack collection.
    void push(int data){
        if(top > max-1){
            System.out.println("Stack is Overflowed");
        }
        else {
            a[++top] = data;
        }
    }//push method end
    void pop(){
        if(top<max-1){
            a[top] = 0;
        }
        else {
            System.out.println("Please add the elements");
        }
    }
}
