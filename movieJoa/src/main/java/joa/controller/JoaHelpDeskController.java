package joa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoaHelpDeskController {
	
	@RequestMapping("helpDesk.do")
	public String helpDesk() {
		return "joaHelpDesk/joaHelpDesk_helpDesk";
	}

}
