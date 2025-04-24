package net.spikesync.lga;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



	@Controller
	public class FlowController {

	    @GetMapping("/")
	    public String welcome() {
	        return "welcome";
	    }

	    @PostMapping("/next")
	    public String handleChoice(@RequestParam String choice, Model model) {
	        if ("yes".equalsIgnoreCase(choice)) {
	            model.addAttribute("message", "Great! Let's proceed to the question.");
	            return "question";
	        } else {
	            model.addAttribute("message", "Okay! Maybe next time.");
	            return "result";
	        }
	    }

	    @PostMapping("/answer")
	    public String handleAnswer(@RequestParam String answer, Model model) {
	        model.addAttribute("message", "You answered: " + answer);
	        return "result";
	    }
	}

