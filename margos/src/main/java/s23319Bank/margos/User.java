package s23319Bank.margos;

public class User {
    private String userId;
    private String balance;

    User(String userId, String balance) {
        this.userId = userId;
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public String getBalance() {
        return balance;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
