package hospital;

public class MainStack {
    public static void main(String[] args) {

        System.out.println("===== Treatment History Stack Demo =====");

        TreatmentStack stack = new TreatmentStack(10);

        // Push completed treatment records
        stack.push(new Treatment(301, 101, "Hatheek", "Given fever medication and rest advised", "Dr. Fernando"));
        stack.push(new Treatment(302, 102, "Ahnaf", "Allergy test conducted and antihistamine given", "Dr. Perera"));
        stack.push(new Treatment(303, 103, "Suja", "Nebulizer treatment given for asthma", "Dr. Silva"));

        System.out.println("\n----- Current Treatment History -----");
        stack.displayStack();

        System.out.println("\n----- Pop (Remove Most Recent Treatment) -----");
        Treatment lastTreatment = stack.pop();
        if (lastTreatment != null) {
            System.out.println("Removed treatment record for: " + lastTreatment.patientName);
        }

        System.out.println("\n----- Treatment History After Pop -----");
        stack.displayStack();

        System.out.println("\n----- Emptying the Stack -----");
        Treatment t1 = stack.pop();
        if (t1 != null) System.out.println("Removed: " + t1.patientName);

        Treatment t2 = stack.pop();
        if (t2 != null) System.out.println("Removed: " + t2.patientName);

        Treatment t3 = stack.pop(); // this should show "Stack is empty" message
        if (t3 != null) System.out.println("Removed: " + t3.patientName);
    }
}