package joa.helpdesk.model;

import java.util.List;
import java.util.Map;

public interface JoaHQService {
	
	public int addQuestion(JoaHelpQuestionDTO dto);
	
	public int addEmailQuestion(JoaHelpQuestionDTO dto);
	
	public List<JoaHelpQuestionDTO> QuestionList(int cp, int ls);
	
	public List<JoaHelpQuestionDTO> serchQuestionList(String type,String state, String region, String cinema,int cp, int ls);
	
	public JoaHelpQuestionDTO QuestionBorder(int idx);
	
	public int answerQuestion(JoaHelpQuestionDTO dto);
	
	public int reanswerQuestion(JoaHelpQuestionDTO dto);
	
	public int questionTotalCnt();
	
	public int serchQuestionTotalCnt(String type,String state, String region, String cinema);
	
}
