package fr.devoxx.spring.stone;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.devoxx.spring.stone.rest.StoneController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=StoneApplication.class)
public abstract class StoneContractTest {

	@Autowired StoneController stoneController;
	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(stoneController);
		
	}
}
