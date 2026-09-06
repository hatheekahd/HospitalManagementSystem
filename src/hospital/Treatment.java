package hospital;

public class Treatment {
    public int treatmentId;
    public int patientId;
    public String patientName;
    public String treatmentDetails;
    public String doctorName;

    public Treatment(int treatmentId, int patientId, String patientName, String treatmentDetails, String doctorName) {
        this.treatmentId = treatmentId;
        this.patientId = patientId;
        this.patientName = patientName;
        this.treatmentDetails = treatmentDetails;
        this.doctorName = doctorName;
    }

    public void displayDetails() {
        System.out.println("Treatment ID: " + treatmentId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Treatment Details: " + treatmentDetails);
        System.out.println("Doctor Name: " + doctorName);
    }
}