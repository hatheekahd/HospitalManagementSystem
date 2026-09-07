package hospital;

public class MainVisit {
    public static void main(String[] args) {

        System.out.println("===== Patient Visit History (Singly Linked List) Demo =====");

        VisitHistory history = new VisitHistory();

        // Add visits
        history.addVisit(401, "2026-01-15", "Dr. Fernando", "Common Cold", "Prescribed antihistamine");
        history.addVisit(402, "2026-03-22", "Dr. Perera", "Migraine", "Prescribed pain relievers");
        history.addVisit(403, "2026-06-10", "Dr. Silva", "Fever", "Prescribed paracetamol");

        System.out.println("\n----- Full Visit History -----");
        history.displayHistory();

        System.out.println("\n----- Searching for Visit ID 402 -----");
        Visit found = history.searchVisit(402);
        if (found != null) {
            System.out.println("Visit Found:");
            found.displayDetails();
        } else {
            System.out.println("Visit not found.");
        }

        System.out.println("\n----- Removing Visit ID 402 -----");
        history.removeVisit(402);

        System.out.println("\n----- Visit History After Removal -----");
        history.displayHistory();

        System.out.println("\n----- Searching for Removed Visit ID 402 -----");
        Visit removedSearch = history.searchVisit(402);
        if (removedSearch != null) {
            removedSearch.displayDetails();
        } else {
            System.out.println("Visit not found.");
        }
    }
}