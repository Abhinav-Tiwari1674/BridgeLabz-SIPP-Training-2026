public class StackImplementation {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public StackImplementation(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }
    public void push(int value){
        if (top >= maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " to stack.");
    }public int pop(){
        if (top < 0){
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        }
        int poppedValue = stackArray[top--];
        System.out.println("Popped " + poppedValue + " from stack.");
        return poppedValue;
    }
    public int peek(){
        if (top < 0){
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        }
        return stackArray[top];
    }
    public boolean isEmpty(){
        return top <0;
    }
    public boolean isFull(){
        return top >= maxSize -1;
    }
}