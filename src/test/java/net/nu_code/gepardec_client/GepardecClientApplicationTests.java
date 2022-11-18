package net.nu_code.gepardec_client;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class GepardecClientApplicationTests {

	@MockBean
	AppRunner app_intoVoid;

	@Test
	void contextLoads() {
	}

}
