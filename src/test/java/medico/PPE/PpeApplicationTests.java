package medico.PPE;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class PpeApplicationTests {

	@Test
	void contextLoads() {
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
