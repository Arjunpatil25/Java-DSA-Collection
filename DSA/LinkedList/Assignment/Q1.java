package DSA.LinkedList.Assignment;

import java.util.LinkedList;

public class Q1
 {
    Node head;
    public int size=0;

    Q1() {
        this.size = size;
        this.head=null;
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
// merge list
public static void merge(Q1 list1,Q1 list2){
    Q1 list3 = new Q1();
    // Node currnNode = list3.head;
    Node l1 = list1.head;
    Node l2 = list2.head;
   
   while (l1!=null || l2!=null) 
   {
          if(l1!=null)
          {
             list3.insert(l1.data);
          }
          l1 = l1.next;

          if (l2!=null) 
          {
            list3.insert(l2.data);       
          }
          l2 = l2.next;
   }
   Node currNode = list3.head;
   while(currNode != null)
   {
    System.out.print(currNode.data+"->");
    currNode = currNode.next;
   }
   System.out.print("->null");

}
    public static void main(String[] args) {
        Q1 list1 = new Q1();
        Q1 list2 = new Q1();
        list1.insert("arjun");
        list1.insert("Shiva");
        list2.insert("love");
        list2.insert("very much");
        list1.display();
        list2.display();
        // System.out.println("\n size : "+list1.getSize());
       System.out.println("--------------------");
        Q1.merge(list1, list2);
    
    }
}