package s23319Bank.margos;


import org.springframework.stereotype.Component;

import java.util.IdentityHashMap;
import java.util.List;

@Component
public class BankService {
    private final OrderStorage orderStorage;
    private final UserStorage userStorage;

    public BankService(OrderStorage orderStorage, UserStorage userStorage) {
        this.orderStorage = orderStorage;
        this.userStorage = userStorage;
    }
    public List<Order> getAllOrders() {return orderStorage.getOrderList();}

    public Order createAnOrder(User user, String userId, String cash, String status) {
        if(userStorage.checkUserExist(userId)){
            Order order = new Order(user, cash, status);
            orderStorage.getOrderList().add(order);
            return order;
        }else {
            System.out.println("nie ma takiego uzytkownika");
            return null;
        }
    }
    // public void viewOrderInfo(int orderId) {
    //    if (orderStorage.findByID(orderId) != null) {
     //       System.out.println(orderStorage.findByID(orderId).toString());
     //   } else {
     //       System.out.println("Takie zlecenie nie istnieje");
    //    }
}
