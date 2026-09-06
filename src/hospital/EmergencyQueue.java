package hospital;

public class EmergencyQueue {

    private Patient[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public EmergencyQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new Patient[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // 1. ENQUEUE - add a patient to the waiting queue
    public void enqueue(Patient patient) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add patient: " + patient.name);
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = patient;
        size++;
        System.out.println("Patient added to queue: " + patient.name);
    }

    // 2. DEQUEUE - remove the next patient for treatment
    public Patient dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No patients waiting.");
            return null;
        }
        Patient removedPatient = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return removedPatient;
    }

    // 3. DISPLAY all patients currently waiting
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("No patients currently waiting in the queue.");
            return;
        }
        System.out.println("Patients currently waiting:");
        int index = front;
        for (int i = 0; i < size; i++) {
            queueArray[index].displayDetails();
            System.out.println("-----------------------------");
            index = (index + 1) % capacity;
        }
    }

    // 4. Empty and Full checks
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getSize() {
        return size;
    }
}