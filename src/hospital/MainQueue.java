package hospital;

public class MainQueue {
    public static void main(String[] args) {

        System.out.println("===== Emergency Patient Queue Demo =====");

        EmergencyQueue queue = new EmergencyQueue(10);

        // Enqueue patients
        queue.enqueue(new Patient(201, "Fathima", 28, "0761112233", "Chest Pain"));
        queue.enqueue(new Patient(202, "Zayan", 45, "0762223344", "Fracture"));
        queue.enqueue(new Patient(203, "Nusrath", 19, "0763334455", "High Fever"));

        System.out.println("\n----- Current Waiting Queue -----");
        queue.displayQueue();

        System.out.println("\n----- Dequeue (Next Patient for Treatment) -----");
        Patient nextPatient = queue.dequeue();
        if (nextPatient != null) {
            System.out.println("Now treating: " + nextPatient.name);
        }

        System.out.println("\n----- Queue After Dequeue -----");
        queue.displayQueue();

        System.out.println("\n----- Emptying the Queue -----");
        Patient p1 = queue.dequeue();
        if (p1 != null) System.out.println("Treated: " + p1.name);

        Patient p2 = queue.dequeue();
        if (p2 != null) System.out.println("Treated: " + p2.name);

        Patient p3 = queue.dequeue(); // this should show "Queue is empty" message
        if (p3 != null) System.out.println("Treated: " + p3.name);
    }
}