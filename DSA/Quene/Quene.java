package DSA.Quene;

public class Quene {
    static class Queney<T> {
        T[] arry;
        static int size;
        static int rear;
        T front;

        Queney(int size) {
            this.size = size;
            this.rear = -1;

            this.arry = (T[]) new Object[size];// int[]arjun=new int[10];
        }

        // display
        public void display() {
            for (int i = 0; i <= rear; i++) {
                System.out.println(arry[i] + " ");
            }
        }

        // peak
        public void peak() {
            if (rear == -1) {
                System.out.println(" q is empty");
                return;
            }
            System.out.println(arry[0]);

        }

        public void delete() {
            if (rear == -1) {
                System.out.println(" queney is empty ");
                return;
            }
            T front =arry[0];
            for (int i = 0; i < rear; i++) {
                arry[i] = arry[i+1];
                System.out.println("data delete");
            }
            rear--;
            System.out.println("deleted value "+front);
            System.out.println("rear value "+rear);
        }

        // is empty
        public boolean isEmpty() {
            if (rear == -1) {
                System.out.println(" queney is empty ");
                return true;
            }
            System.out.println(" Queney is not empty size " );
            return false;
        }

        // add
        public void add(T data) {
            if (rear == size - 1) {

                System.out.println(" queney is full");
                return;
            }
            arry[++rear] = data;
            System.out.println(" data insreted");
            System.out.println("rear value "+rear);
        }

    }

    public static void main(String[] args) {
        Queney q = new Queney<>(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();

        q.delete();


        q.display();
        // q.delete();
        q.isEmpty();


    }

}
