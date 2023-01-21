package s23319Bank.margos;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class UserStorage {
    private final List<User> users = new ArrayList<>();

    UserStorage() {
        this.users.add(new User("5", "5000"));
        this.users.add(new User("6", "50"));
        this.users.add(new User("7", "1519"));

        for (User user : users) {
            System.out.println(user);
        }
    }
    public List<User> getUsers() {return users;}

    public boolean checkUserExist(String Id){
        for (User user : users){
            if (user.getUserId().equals(Id)){
                return true;
            }
        }
        return false;
    }

}
