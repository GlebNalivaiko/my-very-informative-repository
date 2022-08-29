package Contract;

public class Register {
    private int position;
    private final Document[] arr;

    public Register(int size) {
        position = 0;
        arr = new Document[size];
    }

    /**
     * add document to our register
     *
     * @param document-any type of document
     */
    public void addDocument(Document document) {
        arr[position] = document;
        position++;
    }

    public void printDocuments() {
        arr[--position].print();
    }
}
