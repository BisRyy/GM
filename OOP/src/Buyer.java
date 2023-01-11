import java.util.ArrayList;
import java.util.List;

class Buyer {
    private String id;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private List<Transaction> transactions;

    public Buyer(String id, String name, String address, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.transactions = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public List<Transaction> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
}