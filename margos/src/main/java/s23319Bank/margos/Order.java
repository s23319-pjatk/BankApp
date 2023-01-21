package s23319Bank.margos;

import java.util.Date;

public class Order {
    private static int count = 0;
    private User user;
    private int orderId;
    private String cash;
    private String status;

    public User getUser() {
        return user;
    }

    public Order(User user, String cash, String status) {
        this.user = user;
        this.orderId = ++count;
        this.cash = cash;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCash() {
        return cash;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId=`" + user.getUserId() + '\'' +
                "orderId='" + orderId + '\'' +
                "cash='" + cash + '\'' +
                "status='" + status + '\'' +
                "}\n";
    }
}
