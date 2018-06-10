package malinka.web.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import malinka.web.model.MessageModel;

public class MessageServiceTest {

	MessageService msgService;
	
	@Before
	public void before() {
		
		msgService = new MessageService();
		
	}
	
	@Test
	public void testHelloWorld() {
		
		MessageModel model = msgService.getMessageModel();
		
		assertEquals("Hello World!", model.getMessage());
		
	}
	
	@Test
	public void testThrowIllegalArgumentWhenNameIsNull() {
		
		String name = null;
		
		try {
			
			msgService.getMessageModel(name);
			
			fail("expected illegal argument exception, but it never came through");
			
		} catch(IllegalArgumentException e) {
			
		}
	}
	
	@Test
	public void testThrowIllegalArgumentExceptionWhenNameisEmpty() {
		
		String name = "";
		
		try {
			
			msgService.getMessageModel(name);
			
			fail("expected illegal argument exception, but it never came through");
			
		} catch(IllegalArgumentException e) {
			
		}
		
	}
	
	@Test
	public void testHelloName() {
		
		MessageModel model = msgService.getMessageModel("Malinka");
		
		assertEquals("Hello Malinka", model.getMessage());
		
	}

}
