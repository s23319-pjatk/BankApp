package s23319Bank.margos;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class MargosApplicationTests {
	@MockBean
	private OrderStorage orderStorage;
	@MockBean
	private UserStorage userStorage;
	@Autowired
	private BankService bankService;

	@Test
	void contextLoads() {
	}


}
