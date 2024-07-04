package DSA.LinkedList.Assignment;

public class RemoveDuplicate {
    Node head;
    int size ;

    RemoveDuplicate(){
        this.size=0;
    }
    public int getsize(){
        return size;
    }

    // node class 
    public class Node{

        public String data;
        public Node next;

        Node(String data){
            this.data=data;
            this.next=null;
         }
    }
    public void RemoveDuplicateno(){
        Node currNode=head;
        if(currNode==null||currNode.next==null){
            System.out.println(" empty list ");
            return;
        }
        while (currNode.next!=null) {
            
            if(currNode.data.equalsIgnoreCase(currNode.next.data)){
                currNode.next=currNode.next.next;
                size--;
            }
            else{currNode=currNode.next;
           }
            
        }

    }
    public void add (String data){
        Node insertNode = new Node(data);
        Node currentNode = head;
        if(currentNode==null){
            head=insertNode;
            return;
        }
        while (currentNode.next!=null) {
            currentNode=currentNode.next;
            
        }
        currentNode.next=insertNode;
        System.out.println(" node inserted");
    }
    //display list 
    public void display(){
        Node currentNode=head;
        if(currentNode==null){
            System.out.println(" list is empty");
            return;
        }
        while (currentNode!=null) {
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
            
        }
    }
    public static void main(String[] args) {
        RemoveDuplicate list = new RemoveDuplicate();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("5");
        list.display();
        list.RemoveDuplicateno();
        list.display();        
    }

}
