class CallStack {

    static class Node {

        String functionName;
        Node next;

        Node(String functionName) {
            this.functionName = functionName;
        }
    }

    Node top;

    public void push(String functionName) {

        Node newNode = new Node(functionName);

        newNode.next = top;
        top = newNode;
    }

    public String pop() {

        if (top == null)
            throw new RuntimeException("Stack Empty");

        String name = top.functionName;
        top = top.next;

        return name;
    }

    public String peek() {

        if (top == null)
            throw new RuntimeException("Stack Empty");

        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }
}