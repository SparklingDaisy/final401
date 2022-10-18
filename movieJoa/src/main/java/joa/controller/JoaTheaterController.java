package joa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoaTheaterController {

	
	@RequestMapping("/joaTheater.do")
	public String base() {
		return "joaTheater/joaTheater_theater";
	}
}
