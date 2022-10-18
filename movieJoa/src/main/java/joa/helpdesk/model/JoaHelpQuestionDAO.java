package joa.helpdesk.model;

import java.util.*;

public interface JoaHelpQuestionDAO {
	
	public int addQuestion(JoaHelpQuestionDTO dto);
	
	public int addEmailQuestion(JoaHelpQuestionDTO dto);
	
	public List<JoaHelpQuestionDTO> QuestionList(Map map);
	
	public List<JoaHelpQuestionDTO> serchQuestionList(String type,String state, String region, String cinema,Map map);
	
	public JoaHelpQuestionDTO QuestionBorder(int idx);
	
	public int answerQuestion(JoaHelpQuestionDTO dto);
	
	public int reanswerQuestion(JoaHelpQuestionDTO dto);
	
	public int questionTotalCnt();
	
	public int serchQuestionTotalCnt(Map map);
	
	public List<JoaHelpQuestionDTO> emailList(Map map);
	
	public int emailTotalCnt(String state);
}
