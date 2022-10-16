package joa.helpdesk.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JoaHQServiceImple implements JoaHQService {
	
	private JoaHelpQuestionDAO JoaHelpQuestionDao;
	
	
	public JoaHQServiceImple(JoaHelpQuestionDAO joaHelpQuestionDao) {
		super();
		JoaHelpQuestionDao = joaHelpQuestionDao;
	}
	
	public JoaHQServiceImple() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addQuestion(JoaHelpQuestionDTO dto) {
		int result = JoaHelpQuestionDao.addQuestion(dto);
		
		return result;
	}


	@Override
	public int addEmailQuestion(JoaHelpQuestionDTO dto) {
		int result = JoaHelpQuestionDao.addEmailQuestion(dto);
		return result;
	}

	@Override
	public List<JoaHelpQuestionDTO> QuestionList(int cp, int ls) {
		int start = (cp-1)*ls+1;
		int end = cp*ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<JoaHelpQuestionDTO> list = JoaHelpQuestionDao.QuestionList(map);
		return list;
	}

	@Override
	public List<JoaHelpQuestionDTO> serchQuestionList(String type, String state, String region, String cinema,int cp, int ls) {
		int start = (cp-1)*ls+1;
		int end = cp*ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<JoaHelpQuestionDTO> list = JoaHelpQuestionDao.serchQuestionList(type, state, region, cinema,map);
		return list;
	}


	@Override
	public int answerQuestion(JoaHelpQuestionDTO dto) {
		int result = JoaHelpQuestionDao.answerQuestion(dto);
		return result;
	}

	@Override
	public int reanswerQuestion(JoaHelpQuestionDTO dto) {
		int result = JoaHelpQuestionDao.reanswerQuestion(dto);
		return result;
	}

	@Override
	public JoaHelpQuestionDTO QuestionBorder(int idx) {
		JoaHelpQuestionDTO dto = JoaHelpQuestionDao.QuestionBorder(idx);
		return dto;
	}
	
	@Override
	public int questionTotalCnt() {
		int count = JoaHelpQuestionDao.questionTotalCnt();
		return count;
	}
	
	@Override
	public int serchQuestionTotalCnt(String type, String state, String region, String cinema) {
		Map map = new HashMap();
		map.put("type", type);
		map.put("state", state);
		map.put("region", region);
		map.put("cinema", cinema);
		int count = JoaHelpQuestionDao.serchQuestionTotalCnt(map);
		return count;
	}


}
