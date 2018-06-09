package malinka.web.service;

import org.springframework.stereotype.Service;

import malinka.web.model.MessageModel;

@Service
public class MessageService {

	MessageModel getMessageModel() {
		
		MessageModel model = new MessageModel("Hello World!");
		
		return model;
	}
}
