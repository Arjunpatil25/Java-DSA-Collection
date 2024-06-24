package DSA.LinkedList.Assignment;

import java.util.LinkedList;

public class Q1
 {
    Node head;
    public int size;

    Q1() {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    // node class
    public class Node 
    {

        public String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
     }

       
    }
 // insert node;
 public void insert(String data) {
    Node insertNode = new Node(data);size++;
    if (head == null) {
        head = insertNode;
        return;
    }
    Node curNode = head;
    while (curNode.next != null) {
        curNode = curNode.next;
    }
    curNode.next=insertNode;
}
//dispaly
public void display(){
    Node Displaynode = head;
    while (Displaynode!=null) {
        System.out.print(Displaynode.data+" ->");
        Displaynode=Displaynode.next;
        
    }


}
    public static void main(String[] args) {
        Q1 list1 = new Q1();
        Q1 list2 = new Q1();
        list1.insert("arjun");
        list1.insert("Shiva");
        list1.display();
        System.out.println("\n size : "+list1.getSize());
    }
}