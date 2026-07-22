import java.util.*;

class PrintQueue {

    Deque<Integer> queue = new ArrayDeque<>();

    public void submitJob(int jobId) {

        queue.addLast(jobId);
    }

    public void submitUrgentJob(int jobId) {

        queue.addFirst(jobId);
    }

    public int printNextJob() {

        if (queue.isEmpty())
            throw new RuntimeException("Queue Empty");

        return queue.removeFirst();
    }
}