package DSA.LinkedList;



import org.w3c.dom.Node;

public class SingleLinkedList {
    Node head;
    static int size;

    SingleLinkedList() {
        this.size = 0;

    }

    public static int getsize() {
        return size;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // add first
    public void addFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // add last
    public void addlast(String data) {
        Node newnNode = new Node(data);
        if (head == null) {
            newnNode.next = head;
            head = newnNode;
        }
        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newnNode;

    }

    // add between
    public void addbetween(int index, String data) {
        Node insertnode = new Node(data);
        Node prNode = head;
        if (index <= 0 || (head == null && index > 1) || (SingleLinkedList.size < index)) {
            System.out.println(" list empty hence enter index value 1");
            return;
        }
        if (index == 1) {
            head = insertnode;
        }
        for (int i = 1; i < index - 1; i++) {
            prNode = prNode.next;

        }
        insertnode.next = prNode.next;
        prNode.next = insertnode;
        System.out.println(" insert done at : " + index + " position");
    }

    // display
    public void printlist() {
        if (head == null) {
            System.out.println(" list is empty");
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " ->  ");
            currnode = currnode.next;

        }
    }

    // delete fisrt
    public void deleteFirst() {
        if (head == null) {
            System.out.println(" list is empty");
            return;
        }
        size--;
        head = head.next;
        System.out.println(" delete first");
    }

    // delete last
    public void deletelast() {
        Node secondlast = head;// assining first node
        Node lastnode = head.next;// assing second node

        if (head == null) {
            System.out.println(" list is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("only single node ");
        }
        size--;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    // delete by value
    public void deletebyvalue(String value) {
        Node prevnode = head;
        Node currNode = head.next;
        if (head == null) {
            System.out.println(" list is empty");
            return;
        }

        while (currNode != null) {
            if (currNode.data.equalsIgnoreCase(value)) {
                prevnode.next = currNode.next;
                currNode = null;
                return;
            }
            currNode = currNode.next;
            prevnode = prevnode.next;

        }
    }

    // reverse
    public void revsrse() {
        Node prevNode = head;
        Node currNode = head.next;
        Node nextNode = currNode.next;
        while (currNode != null) {
          nextNode = currNode.next;
            System.out.println(" next node updated");
            currNode.next = prevNode;
            System.out.println(" prenode update ");
            prevNode = currNode;
            currNode = nextNode;
        } 
        head.next=null;
        head = prevNode;
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst("arjun");
        list.addlast("love");
        list.addlast("shiva");
        list.addlast("they");
        list.addlast("are");
        list.addlast("couple");

        // list.deleteFirst();
        // list.printlist();

        // list.deletelast();
        // list.printlist();
        list.addlast("don");
        //System.out.println(list.getsize());
        //list.addbetween(1, "babe");
        list.printlist();
        list.revsrse();
        list.printlist();
    }
}
