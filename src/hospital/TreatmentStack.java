package hospital;

public class TreatmentStack {

    private Treatment[] stackArray;
    private int top;
    private int capacity;

    public TreatmentStack(int capacity) {
        this.capacity = capacity;
        stackArray = new Treatment[capacity];
        top = -1;
    }

    // 1. PUSH - add a completed treatment record
    public void push(Treatment treatment) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot add treatment record for: " + treatment.patientName);
            return;
        }
        top++;
        stackArray[top] = treatment;
        System.out.println("Treatment record added for: " + treatment.patientName);
    }

    // 2. POP - remove the most recently completed treatment record
    public Treatment pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No treatment records to remove.");
            return null;
        }
        Treatment removedTreatment = stackArray[top];
        top--;
        return removedTreatment;
    }

    // 3. DISPLAY treatment records
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("No treatment records available.");
            return;
        }
        System.out.println("Treatment History (Most Recent First):");
        for (int i = top; i >= 0; i--) {
            stackArray[i].displayDetails();
            System.out.println("-----------------------------");
        }
    }

    // 4. Empty and Full checks
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}