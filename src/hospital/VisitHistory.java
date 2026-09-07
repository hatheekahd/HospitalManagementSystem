package hospital;

public class VisitHistory {
    private Visit head;

    public VisitHistory() {
        head = null;
    }

    // 1. ADD a new visit to the patient's history
    public void addVisit(int visitId, String visitDate, String doctorName, String diagnosis, String treatment) {
        Visit newVisit = new Visit(visitId, visitDate, doctorName, diagnosis, treatment);

        if (head == null) {
            head = newVisit;
        } else {
            Visit current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newVisit;
        }
        System.out.println("Visit added successfully. Visit ID: " + visitId);
    }

    // 2. REMOVE a visit by Visit ID
    public void removeVisit(int visitId) {
        if (head == null) {
            System.out.println("No visit history available.");
            return;
        }

        // If the visit to remove is the head
        if (head.visitId == visitId) {
            head = head.next;
            System.out.println("Visit ID " + visitId + " removed successfully.");
            return;
        }

        Visit current = head;
        while (current.next != null && current.next.visitId != visitId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Visit ID " + visitId + " not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Visit ID " + visitId + " removed successfully.");
        }
    }

    // 3. SEARCH for a visit by Visit ID
    public Visit searchVisit(int visitId) {
        Visit current = head;
        while (current != null) {
            if (current.visitId == visitId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // 4. DISPLAY the patient's visit history
    public void displayHistory() {
        if (head == null) {
            System.out.println("No visit history available.");
            return;
        }

        Visit current = head;
        System.out.println("Patient Visit History:");
        while (current != null) {
            current.displayDetails();
            System.out.println("-----------------------------");
            current = current.next;
        }
    }
}