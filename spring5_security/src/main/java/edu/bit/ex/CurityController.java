package edu.bit.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jdk.internal.org.jline.utils.Log;
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
		//Log.info("do all can access everybody");
	}
	
	@GetMapping("/member")
	public void domember() {
		//Log.info("do all can access member");
	}
	
	@GetMapping("/admin")
	public void doadmin() {
		//Log.info("do all can access member");
	}
	
    @GetMapping("/accessError")
    public void accessError(Authentication auth,Model model) {
       log.info("accessd denied" + auth);
       model.addAttribute("msg","Access Denied");
    }  
	
	
}
