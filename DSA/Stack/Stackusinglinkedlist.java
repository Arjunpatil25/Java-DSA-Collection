package DSA.Stack;

public class Stackusinglinkedlist {
    static Node head;
    int size;

    Stackusinglinkedlist() {
        this.size = 0;
    }

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

        }
    }

    static class Stack {
        // pop
        public void pop() {
            if (head == null) {
                System.out.println(" list is empty");
                return ;
            }
            String top = head.data;
            head = head.next;
            System.out.println(top);;
        }

        // peek
        public void peek() {
            if (head == null) {
                System.out.println(" list is empty");
                return ;
            }
            
            System.out.println(head.data);
        }

        // is empty

        public boolean isEmpty() {
            if (head == null) {
                System.out.println(" list is empty");
                return true;
            }
            System.out.println(" list is not empty ");
            return false;
        }

        // push
        public void push(String data) {

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                System.out.println(" inserted has head ");
                return;
            }
            newNode.next = head;
            head = newNode;
            System.out.println(" inserted ");

        }
        // display

        public void display() {
            Node currentnode = head;
            if (currentnode == null) {
                System.out.println(" list is empty");
                return;
            }
            while (currentnode != null) {
                System.out.print(currentnode.data + "->");
                currentnode = currentnode.next;
            }
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("arjun");
        st.push("love");
        st.push("shiva");
        st.display();
        System.out.println(" ");
        st.peek();
        st.pop();


    }
}
