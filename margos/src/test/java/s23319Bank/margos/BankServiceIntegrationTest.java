package s23319Bank.margos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
class MargosApplicationTests {
    @MockBean
    private OrderStorage orderStorage;
    @MockBean
    private UserStorage userStorage;
    @Autowired
    private BankService bankService;

    @Test
    void shouldPass() {
       when(UserStorage.getUsers()).thenReturn(List.of(new User)));
List<User> allUsers = userStorage.getAllUsers():
        assertThat|(allUsers).isNotEmpty();
    }
    }

