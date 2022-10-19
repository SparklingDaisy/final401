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
	
	@Override
	public List<JoaHelpQuestionDTO> emailList(String state, int cp, int ls) {
		
		int start = (cp-1)*ls+1;
		int end = cp*ls;
		Map<String, Object> map = new HashMap<>();
		map.put("state", state);
		map.put("start", start);
		map.put("end", end);
		List<JoaHelpQuestionDTO> list = JoaHelpQuestionDao.emailList(map);
		return list;
	}
	
	@Override
	public int emailTotalCnt(String state) {
		int count = JoaHelpQuestionDao.emailTotalCnt(state);
		return count;
	}
	
	@Override
	public List<JoaHelpQuestionDTO> emailTypeList(String state, String hqt_type, int cp, int ls) {
		int start = (cp-1)*ls+1;
		int end = cp*ls;
		Map<String, Object> map = new HashMap<>();
		map.put("state", state);
		map.put("hqt_type", hqt_type);
		map.put("start", start);
		map.put("end", end);
		List<JoaHelpQuestionDTO> list = JoaHelpQuestionDao.emailTypeList(map);
		return list;
	}
	
	@Override
	public int emailTypeTotalCnt(String hqt_type, String state) {
		Map<String, Object> map = new HashMap<>();
		map.put("state", state);
		map.put("hqt_type", hqt_type);
		int count = JoaHelpQuestionDao.emailTypeTotalCnt(map);
		return count;
	}
	
	@Override
	public List<JoaHelpQuestionDTO> emailSerchList(String state, String hqt_type, String hqt_region, String hqt_cinema,
			int cp, int ls) {
		int start = (cp-1)*ls+1;
		int end = cp*ls;
		Map<String, Object> map = new HashMap<>();
		map.put("state", state);
		map.put("hqt_type", hqt_type);
		map.put("hqt_region", hqt_region);
		map.put("hqt_cinema", hqt_cinema);
		map.put("start", start);
		map.put("end", end);
		List<JoaHelpQuestionDTO> list = JoaHelpQuestionDao.emailSerchList(map);
		return list;
	}
	
	@Override
	public int emailSerchTotalCnt(String state, String hqt_type, String hqt_region, String hqt_cinema) {
		Map<String, Object> map = new HashMap<>();
		map.put("state", state);
		map.put("hqt_type", hqt_type);
		map.put("hqt_region", hqt_region);
		map.put("hqt_cinema", hqt_cinema);
		int count = JoaHelpQuestionDao.emailSerchTotalCnt(map);
		return count;
	}
}
