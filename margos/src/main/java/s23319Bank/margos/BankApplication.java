package s23319Bank.margos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {
    public BankApplication(BankService bankService) {
        User user1 = new User("1", "2500");
        User user2 = new User("2", "100");
        User user3 = new User("3", "10000");

        bankService.createAnOrder(user1,"1","1000","w realizacji");
        bankService.createAnOrder(user1,"2","10","w realizacji");
        bankService.createAnOrder(user1,"3","3300","w realizacji");
        System.out.println();
    }

    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);
    }

}
