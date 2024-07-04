package DSA.Stack;

public class Stack<T> {
    T[] array;
    int size;
    int top;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.array = (T[]) new Object[size];

    }

    // cheak if empty
    public boolean isEmpty() {
        if (top == -1) {
            System.out.println(" Stack is empty ");
            return true;
        }
        System.out.println(" is not empty and size:" + ++top);
        return false;
    }

    // check if full
    public boolean isfull() {
        if (top == size - 1) {
            System.out.println(" stack is full ");
            return true;
        }
        System.out.println("Stack is not full  and Size is " + ++top);
        return false;
    }

    // push
    public boolean push(T data) {
        if (top == size - 1) {
            System.out.println(" stack is full ");
            return false;
        }
        array[++top] = data;
        System.out.println(" Data inserted");
        return true;
    }

    // pop
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return array[top--];
    }

    // display all
    public void displayall() {
        if (isEmpty()) {
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(array[i]);
        }

    }

    // peak
    public void peak() {
        // if(isEmpty()){
        // return;
        // }
        System.out.println(array[top]);
    }

    public static void main(String[] arry) {
        Stack<String> stack = new Stack<>(10);

        // stack.isEmpty();
        stack.push("i");
        stack.push("love");
        stack.push("you");
        stack.push("shiva");
        // stack.isEmpty();
        stack.peak();
        // stack.isfull();
        // stack.pop();
        // stack.displayall();

    }
}
