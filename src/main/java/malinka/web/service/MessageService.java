package malinka.web.service;

import org.springframework.stereotype.Service;

import malinka.web.model.MessageModel;

@Service
public class MessageService {

	/**
	 * 
	 * @return message model
	 */
	public MessageModel getMessageModel() {
		
		MessageModel model = new MessageModel("Hello World!");
		
		return model;
	}
	
	/**
	 * 
	 * @param name
	 * @return message model
	 * @throws IllegalArgumentException
	 */
	public MessageModel getMesageModel(String name) throws IllegalArgumentException {
		
		if(name == null || name.isEmpty()) throw new IllegalArgumentException("input name is invalid");
		
		MessageModel model = new MessageModel(String.format("Hello %s", name));
		
		return model;
	}
}
