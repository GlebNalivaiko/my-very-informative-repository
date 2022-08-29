package Contract;

public class Main {
    public static void main(String[] args) {
        Register register = new Register(3);
        register.addDocument(new Contract(1,"22.06.2016","Food",10));
        register.printDocuments();
        register.addDocument(new FinanceDocument(2,"01.12.2012",2034,1204));
        register.printDocuments();
        register.addDocument(new EmployeeContract(3,"08.06.2019","Gleb","08.06.2020"));
        register.printDocuments();
    }
}
