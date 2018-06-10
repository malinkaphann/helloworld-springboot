package malinka.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testHelloWorld() throws Exception {
		this.mvc.perform(get("/hello"))
		.andExpect(status().isOk())
		.andExpect(model().attribute("message", "Hello World!"));
	}
	
	@Test
	public void testHelloName() throws Exception {
		this.mvc.perform(get("/hello/malinka"))
		.andExpect(status().isOk())
		.andExpect(model().attribute("message", "Hello malinka"));
	}

}

