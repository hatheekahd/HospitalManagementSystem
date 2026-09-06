package hospital;

public class Main {
    public static void main(String[] args) {

        PatientBST bst = new PatientBST();

        // Insert some patients
        bst.insert(101, "Nipuna", 25, "0771234567", "Fever");
        bst.insert(105, "Aravinda", 40, "0772345678", "Fracture");
        bst.insert(103, "Prashani", 30, "0773456789", "Asthma");
        bst.insert(108, "Kavindu", 22, "0774567890", "Headache");
        bst.insert(102, "Ishara", 35, "0775678901", "Allergy");

        System.out.println("===== All Patients (In-Order Traversal) =====");
        bst.inOrderTraversal();

        System.out.println("===== Searching for Patient ID 103 =====");
        Patient found = bst.search(103);
        if (found != null) {
            found.displayDetails();
        } else {
            System.out.println("Patient not found.");
        }

        System.out.println("===== Deleting Patient ID 105 =====");
        bst.delete(105);

        System.out.println("===== All Patients After Deletion =====");
        bst.inOrderTraversal();

        System.out.println("===== Searching for Deleted Patient ID 105 =====");
        Patient deletedSearch = bst.search(105);
        if (deletedSearch != null) {
            deletedSearch.displayDetails();
        } else {
            System.out.println("Patient not found.");
        }
    }
}