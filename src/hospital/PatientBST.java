package hospital;

public class PatientBST {
    private Patient root;

    public PatientBST() {
        root = null;
    }

    // 1. INSERT a new patient
    public void insert(int patientId, String name, int age, String contactNumber, String medicalCondition) {
        Patient newPatient = new Patient(patientId, name, age, contactNumber, medicalCondition);
        if (root == null) {
            root = newPatient;
        } else {
            insertHelper(root, newPatient);
        }
    }

    private void insertHelper(Patient current, Patient newPatient) {
        if (newPatient.patientId < current.patientId) {
            if (current.left == null) {
                current.left = newPatient;
            } else {
                insertHelper(current.left, newPatient);
            }
        } else if (newPatient.patientId > current.patientId) {
            if (current.right == null) {
                current.right = newPatient;
            } else {
                insertHelper(current.right, newPatient);
            }
        } else {
            System.out.println("Patient ID " + newPatient.patientId + " already exists.");
        }
    }

    // 2. SEARCH for a patient by ID
    public Patient search(int patientId) {
        return searchHelper(root, patientId);
    }

    private Patient searchHelper(Patient current, int patientId) {
        if (current == null) {
            return null;
        }
        if (patientId == current.patientId) {
            return current;
        } else if (patientId < current.patientId) {
            return searchHelper(current.left, patientId);
        } else {
            return searchHelper(current.right, patientId);
        }
    }

    // 3. DELETE a patient by ID
    public void delete(int patientId) {
        root = deleteHelper(root, patientId);
    }

    private Patient deleteHelper(Patient current, int patientId) {
        if (current == null) {
            System.out.println("Patient ID " + patientId + " not found.");
            return null;
        }

        if (patientId < current.patientId) {
            current.left = deleteHelper(current.left, patientId);
        } else if (patientId > current.patientId) {
            current.right = deleteHelper(current.right, patientId);
        } else {
            // Found the patient to delete

            // Case 1: No children
            if (current.left == null && current.right == null) {
                return null;
            }
            // Case 2: One child
            else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }
            // Case 3: Two children
            else {
                Patient successor = findMin(current.right);
                current.patientId = successor.patientId;
                current.name = successor.name;
                current.age = successor.age;
                current.contactNumber = successor.contactNumber;
                current.medicalCondition = successor.medicalCondition;
                current.right = deleteHelper(current.right, successor.patientId);
            }
        }
        return current;
    }

    private Patient findMin(Patient node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // 4. IN-ORDER TRAVERSAL (ascending order of Patient ID)
    public void inOrderTraversal() {
        if (root == null) {
            System.out.println("No patients in the system.");
        } else {
            inOrderHelper(root);
        }
    }

    private void inOrderHelper(Patient current) {
        if (current != null) {
            inOrderHelper(current.left);
            current.displayDetails();
            System.out.println("-----------------------------");
            inOrderHelper(current.right);
        }
    }
}