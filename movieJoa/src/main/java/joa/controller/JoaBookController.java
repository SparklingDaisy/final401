package joa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoaBookController {

	
	@RequestMapping("/joaBook.do")
	public String base() {
		return "joaBook/joaBook_book";
	}
}
