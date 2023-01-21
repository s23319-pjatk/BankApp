package s23319Bank.margos;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderStorage {
    private final List<Order> orderList = new ArrayList<>();

    OrderStorage(){}
    public List<Order> getOrderList() {return orderList;}

    public Order findById(int Id){
        for (Order order : orderList){
            if (order.getOrderId() == Id){
                return  order;
            }
        }
        return null;
    }
}
