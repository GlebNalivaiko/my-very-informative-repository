package by.teachmeskills.classwork.lesson9;

public class Client {
    private MedicalPlan medicalPlan;
    private final String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public MedicalPlan getMedicalPlan() {
        return medicalPlan;
    }

    public void setMedicalPlan(MedicalPlan medicalPlan) {
        this.medicalPlan = medicalPlan;
    }
}
