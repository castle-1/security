package edu.bit.ex;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */

@RequestMapping("/security/*")
@Log4j
@Controller
public class CurityController {
	
	@GetMapping("/all")
	public void doAall() {
		log.info("do all can access everybody");
	}
	
	@GetMapping("/member")
	public void domember() {
		log.info("do all can access member");
	}
	
	@GetMapping("/admin")
	public void doadmin() {
		log.info("do all can access member");
	}
	
    @GetMapping("/accessError")
    public void accessError(Authentication auth,Model model) {
       log.info("accessd denied" + auth);
       model.addAttribute("msg","Access Denied");
    }  
	
	
}
