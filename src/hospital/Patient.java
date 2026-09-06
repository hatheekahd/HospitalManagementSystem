package hospital;

public class Patient {
    public int patientId;
    public String name;
    public int age;
    public String contactNumber;
    public String medicalCondition;

    public Patient left;
    public Patient right;

    public Patient(int patientId, String name, int age, String contactNumber, String medicalCondition) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalCondition = medicalCondition;
        this.left = null;
        this.right = null;
    }

    public void displayDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Medical Condition: " + medicalCondition);
    }
}