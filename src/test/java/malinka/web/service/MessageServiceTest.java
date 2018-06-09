package malinka.web.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import malinka.web.model.MessageModel;

public class MessageServiceTest {

	@Test
	public void test() {
		
		MessageService msgService = new MessageService();
		
		MessageModel model = msgService.getMessageModel();
		
		assertEquals("Hello World!", model.getMessage());
		
	}

}
