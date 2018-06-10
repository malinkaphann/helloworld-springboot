package malinka.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import malinka.web.service.MessageService;

@Controller
public class HelloController {
	
	@Autowired
	MessageService msgService;
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/hello")
	public String sayHelloWorld(Model model) {
		
		model.addAttribute("message", msgService.getMessageModel().getMessage());
		
		return "hello";
	}
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/hello/{name}")
	public String sayHelloName(@PathVariable String name, Model model) {
		
		model.addAttribute("message", msgService.getMessageModel(name).getMessage());
		
		return "hello";
	}
}