package Contract;


public class Contract extends Document {
    private final String typeOfProduct;
    private final int productQuantity;

    public Contract(int documentNumber, String documentDate, String typeOfProduct, int productQuantity) {
        super(documentNumber, documentDate);
        this.productQuantity = productQuantity;
        this.typeOfProduct = typeOfProduct;
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

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public int getProductQuantity() {
        return productQuantity;
    }


    @Override
    public void print() {
        System.out.println("Date of creating:" + getDocumentDate() + ", " + "Document number:" + getDocumentNumber() + ", " + "Type of product:" + getTypeOfProduct() + ", " + "Product quantity:" + getProductQuantity());

    }
}
