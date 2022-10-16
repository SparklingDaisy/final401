package joa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import joa.mypage.model.JoaMypageMemberDTO;
import joa.mypage.model.JoaMypageService;

@Controller
public class JoaMypageController {
	
	@Autowired
	private JoaMypageService JoaMypageService; 
	
	@RequestMapping("/myPage.do")
	public ModelAndView myPage(String sid,HttpSession session) {
		
		ModelAndView mav = new ModelAndView();
		JoaMypageMemberDTO dto = JoaMypageService.memberInpo(sid);
		
		String m_grade = "일반";
		
		if(dto.getMpMember_grade()>=10000 && dto.getMpMember_grade()<25000) {
			m_grade = "VIP";
		}
		if(dto.getMpMember_grade()>=25000 && dto.getMpMember_grade()<40000) {
			m_grade = "SVIP";
		}
		if(dto.getMpMember_grade()>=40000) {
			m_grade = "VVIP";
		}
		
		mav.addObject("m_grade", m_grade);
		mav.addObject("dto", dto);
		mav.setViewName("joaMyPage/joaMyPage_myPage");
		return mav;
	}

}
