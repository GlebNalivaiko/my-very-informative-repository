package Contract;

public class EmployeeContract extends Document {
    private final String employeeName;
    private final String endOfContract;

    public EmployeeContract(int documentNumber, String documentDate, String employeeName, String endOfContract) {
        super(documentNumber, documentDate);
        this.employeeName = employeeName;
        this.endOfContract = endOfContract;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEndOfContract() {
        return endOfContract;
    }

    @Override
    public int getDocumentNumber() {
        return super.getDocumentNumber();
    }

    @Override
    public void setDocumentNumber(int documentNumber) {
        super.setDocumentNumber(documentNumber);
    }

    @Override
    public String getDocumentDate() {
        return super.getDocumentDate();
    }

    @Override
    public void setDocumentDate(String documentDate) {
        super.setDocumentDate(documentDate);
    }

    @Override
    public void print() {
        System.out.println("Date of creating:" + getDocumentDate() + ", " + "Document number:" + getDocumentNumber() + ", " + "Employee name:" + getEmployeeName() + ", " + "End of contract:" + getEndOfContract());
    }
}
