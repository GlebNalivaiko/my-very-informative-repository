package Contract;


public class FinanceDocument extends Document {
    private final int sumOfMonth;
    private final int departmentCode;

    public FinanceDocument(int documentNumber, String documentDate, int sumOfMonth, int departmentCode) {
        super(documentNumber, documentDate);
        this.sumOfMonth = sumOfMonth;
        this.departmentCode = departmentCode;
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

    public int getSumOfMonth() {
        return sumOfMonth;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }


    @Override
    public void print() {
        System.out.println("Date of creating:" + getDocumentDate() + ", " + "Document number:" + getDocumentNumber() + ", " + "Department code:" + getDepartmentCode() + ", " + "Month sum:" + getSumOfMonth());
    }
}
