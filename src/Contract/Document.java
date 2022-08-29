package Contract;

public abstract class Document implements Printable {
    private int documentNumber;
    private String documentDate;

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public Document(int documentNumber, String documentDate) {
        this.documentDate = documentDate;
        this.documentNumber = documentNumber;
    }
}
