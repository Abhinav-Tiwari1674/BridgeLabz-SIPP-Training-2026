import java.util.*;

class Patient {

    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

class Hospital {

    PriorityQueue<Patient> pq =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);

    public void admitPatient(Patient p) {

        pq.offer(p);
    }

    public Patient callNextPatient() {

        return pq.poll();
    }

    public Patient peekPatient() {

        return pq.peek();
    }
}