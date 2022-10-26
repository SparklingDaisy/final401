package joa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;
import joa.book.model.*;

@Controller
public class JoaBookController {

	@Autowired
	public JoaBookService joaBookService;
	
	@RequestMapping("/book.do")
	public ModelAndView bk() {
		ModelAndView mav = new ModelAndView();
		List<JoaBookDTO> subjectList = joaBookService.moviesSubjectList(); // 제목 리스트
		System.out.println("sl : " +subjectList.size());
		mav.addObject("subjectList", subjectList);
		mav.setViewName("joaBook/joaBook_book");
		return mav;
	}
	
	@RequestMapping("/bookSubmit.do")
	public ModelAndView bs(JoaBookDTO dto) {
		ModelAndView mav = new ModelAndView();
//		System.out.println(dto.getSch_mov_title());
//		System.out.println(dto.getSch_branch());
		List<JoaBookDTO> list = joaBookService.seatList(dto);
		System.out.println("listSize : " +list.size());
		String seats_s = list.get(0).getSch_seat();
		System.out.println("seat_s : " +seats_s);
		System.out.println("seat_s.length : " + seats_s.length());
		int start=0;
	      int le=0;
	      int ri=0;
	      
	      String[][] seats=new String[list.get(0).getSch_height()][list.get(0).getSch_width()];
	      for(int i=0;i<seats_s.length();i++) {
	         if(seats_s.charAt(i)==',') {
	            if(ri==0 && le==0) {
	               seats[le][ri]=seats_s.substring(0,i);
	               start=i+1;
	            }else {
	               seats[le][ri]=seats_s.substring(start,i);
	               start=i+1;
	            }
	            ri++;
	            if(ri==list.get(0).getSch_width()) {
	               le++;
	               ri=0;
	            }
	         }
	    }
	    mav.addObject("width",list.get(0).getSch_width());
	    mav.addObject("height",list.get(0).getSch_height());
	    mav.addObject("seats", seats);
	    mav.addObject("idx", list.get(0).getSch_idx());
	    /////////////
	    mav.addObject("sch_mov_title", list.get(0).getSch_mov_title());
	    mav.addObject("sch_branch", list.get(0).getSch_branch());
	    mav.addObject("sch_day", list.get(0).getSch_day());
	    mav.addObject("sch_theater", list.get(0).getSch_theater());
	    mav.addObject("sch_start_hour", list.get(0).getSch_start_hour());
	    mav.addObject("sch_start_min", list.get(0).getSch_start_min());
	    /////////////
		mav.setViewName("joaBook/joaBook_seat");
		return mav;
	}
	
	@RequestMapping(value = "/reload.do", method = RequestMethod.POST)
	@ResponseBody
	public HashMap reloadList(@RequestBody JoaBookDTO dto) {
		HashMap map = new HashMap();
		
		System.out.println("성공 : " +dto.getSch_mov_title());
		List<JoaBookDTO> list = joaBookService.moviesBranchList(dto.getSch_mov_title());
		String msg = "";
		msg += "<tr><th>극장</th></tr>";
		for (int i=0; i<list.size(); i++) {
			msg += "<td id="+list.get(i).getSch_branch()+"><a href=javascript:next2('"+list.get(i).getSch_branch()+"')>"+list.get(i).getSch_branch()+"</a></td>";
		}
		map.put("reloadBranch", msg);
		return map;
	}
	
	@RequestMapping(value = "/reload2.do", method = RequestMethod.POST)
	@ResponseBody
	public HashMap reloadList2(@RequestBody JoaBookDTO dto) {
		HashMap map = new HashMap();
		List<JoaBookDTO> list = joaBookService.moveisDateList(dto.getSch_mov_title(), dto.getSch_branch());
		String msg = "";
		msg += "<tr><th>날짜</th></tr>";
		for (int i=0; i<list.size(); i++) {
			msg += "<tr><td id="+list.get(i).getSch_day()+"><a href=javascript:next3('"+list.get(i).getSch_day()+"')>"+list.get(i).getSch_day()+"</a></td></tr>";
		}
		map.put("reloadDate", msg);
		return map;
	}
	
	@RequestMapping(value = "/reload3.do", method = RequestMethod.POST)
	@ResponseBody
	public HashMap reloadList3(@RequestBody JoaBookDTO dto) {
		HashMap map = new HashMap();
		List<JoaBookDTO> list = joaBookService.moveisTimeList(dto.getSch_mov_title(), dto.getSch_branch(), dto.getSch_day());
		String msg = "";
		msg += "<tr><th>관/시간</th></tr>";
		for (int i=0; i<list.size(); i++) {
			msg += "<tr><td id="+list.get(i).getSch_theater()+"/"+list.get(i).getSch_start_hour()+list.get(i).getSch_start_min()+"><a href=javascript:next4('"+list.get(i).getSch_theater()+"/"+list.get(i).getSch_start_hour()+list.get(i).getSch_start_min()+"')>"+
					list.get(i).getSch_theater()+"관/ 시작 : " +
					list.get(i).getSch_start_hour()+":"+list.get(i).getSch_start_min()+"/ 끝 : "+
					list.get(i).getSch_end_hour()+":"+list.get(i).getSch_end_min()+
					"</a></td></tr>";
		}
		map.put("reloadTime", msg);
		return map;
	}
	
}
