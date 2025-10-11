package homeworks.bracechecker;

public class Stack {
    private char array[];
    private int top;

    public Stack(int size) {
        array =new char[size];
        top = -1;
    }

    public void push(char value) {
        if (top == array.length-1) {
            System.out.println("stack overflow");
            return;
        }
        array[++top] = value;

    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return 0;
        }
        return array[top--];
    }
    public char peek() {
            if (isEmpty()) {
                return 0;
            }
        return array[top];

        }
    public boolean isEmpty() {
            return top == -1;
        }
}