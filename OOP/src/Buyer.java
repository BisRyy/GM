import java.util.ArrayList;
import java.util.List;

class Buyer extends Person{
    private List<Transaction> transactions;

    public Buyer(String id, String name, String address, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.transactions = new ArrayList<>();
    }


    public List<Transaction> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
}