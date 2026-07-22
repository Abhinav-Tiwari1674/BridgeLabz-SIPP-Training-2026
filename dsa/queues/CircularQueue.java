class PacketBuffer {

    private int[] data;
    private int front;
    private int count;

    public PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    public boolean enqueue(int packetId) {

        if (count == data.length)
            return false;

        int rear = (front + count) % data.length;

        data[rear] = packetId;

        count++;

        return true;
    }

    public int dequeue() {

        if (count == 0)
            throw new RuntimeException("Buffer Empty");

        int value = data[front];

        front = (front + 1) % data.length;

        count--;

        return value;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == data.length;
    }
}