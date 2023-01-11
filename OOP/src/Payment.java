import java.util.Date;

public class Payment {
    private String transactionId;
    private String payer;
    private String payee;
    private double amount;
    private Date date;
    private String paymentMethod;
    private boolean isComplete;

    public Payment(String transactionId, String payer, String payee, double amount,
                   Date date, String paymentMethod) {
        this.transactionId = transactionId;
        this.payer = payer;
        this.payee = payee;
        this.amount = amount;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.isComplete = false;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
}
