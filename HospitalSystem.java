import java.util.List;
import java.util.ArrayList;
import java.util.List;
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}
abstract class Patient implements MedicalRecord {
    protected String patientId, name;
    protected int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public List<String> viewRecords() {
        return medicalHistory;
    }
}
class InPatient extends Patient {
    private int days;
    private double rate;

    public InPatient(String id, String name, int age, String diagnosis, int days, double rate) {
        super(id, name, age, diagnosis);
        this.days = days;
        this.rate = rate;
    }

    public double calculateBill() {
        return days * rate;
    }
}
class OutPatient extends Patient {
    private double fee;

    public OutPatient(String id, String name, int age, String diagnosis, double fee) {
        super(id, name, age, diagnosis);
        this.fee = fee;
    }

    public double calculateBill() {
        return fee;
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P001", "Alice", 30, "Appendicitis", 5, 2000);
        Patient p2 = new OutPatient("P002", "Bob", 25, "Flu", 500);

        p1.addRecord("Admitted on Apr 10");
        p2.addRecord("Visited on Apr 11");

        showDetails(p1);
        showDetails(p2);
    }

    static void showDetails(Patient p) {
        System.out.println(p.getPatientDetails());
        System.out.println("Diagnosis: " + p.getDiagnosis());
        System.out.println("Records: " + p.viewRecords());
        System.out.println("Bill: " + p.calculateBill());
    }
}

