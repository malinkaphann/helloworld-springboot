package malinka.web.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MessageModelTest {

	@Test
	public void test() {
		
		MessageModel model = new MessageModel("Hello World!");
		
		assertEquals("Hello World!", model.getMessage());
	}

}
