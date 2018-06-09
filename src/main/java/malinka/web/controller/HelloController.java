package malinka.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import malinka.web.service.MessageService;

@Controller
public class HelloController {
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/hello")
	public String sayHelloWorld(Model model, MessageService msgService) {
		
		model.addAttribute("message", msgService.getMessageModel().getMessage());
		
		return "hello";
	}	
}