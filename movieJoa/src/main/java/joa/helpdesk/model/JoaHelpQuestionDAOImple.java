package joa.helpdesk.model;



import java.util.*;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;

import java.sql.*;

public class JoaHelpQuestionDAOImple implements JoaHelpQuestionDAO {
	
	private SqlSessionTemplate sqlMap;
	
	public JoaHelpQuestionDAOImple(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	public JoaHelpQuestionDAOImple() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int addQuestion(JoaHelpQuestionDTO dto) {
		// TODO Auto-generated method stub
		int result = sqlMap.insert("QuestionInsert", dto);
		
		return result;
	}
	
	@Override
	public int addEmailQuestion(JoaHelpQuestionDTO dto) {
		int result = sqlMap.insert("QuestionInsert", dto);
		
		return result;
	}


	@Override
	public List<JoaHelpQuestionDTO> QuestionList(Map map) {
		// TODO Auto-generated method stub
		List<JoaHelpQuestionDTO> list = sqlMap.selectList("QuestionList");
		return list;
	}

	@Override
	public List<JoaHelpQuestionDTO> serchQuestionList(String type, String state, String region, String cinema,Map map) {
		List<JoaHelpQuestionDTO> list = sqlMap.selectList("SerchQuestionList");
		return list;
	}

	@Override
	public JoaHelpQuestionDTO QuestionBorder(int idx) {
		JoaHelpQuestionDTO dto = sqlMap.selectOne("QuestionBorder");
		return dto;
	}
	
	@Override
	public int answerQuestion(JoaHelpQuestionDTO dto) {
		int result = sqlMap.insert("QuestionAnswer", dto);
		
		return result;
	
	}
	
	@Override
	public int reanswerQuestion(JoaHelpQuestionDTO dto) {
		int result = sqlMap.insert("QuestionReAnswer", dto);
		
		return result;
	}
	
	@Override
	public int questionTotalCnt() {
		int count = sqlMap.selectOne("QuestionTotalCnt");
		return count;
	}
	@Override
	public int serchQuestionTotalCnt(Map map) {
		int count = sqlMap.selectOne("SerchQuestionTotalCnt");
		return count;
	}
	
	@Override
	public List<JoaHelpQuestionDTO> emailList(Map map) {
		List<JoaHelpQuestionDTO> list = sqlMap.selectList("emailList",map);
		return list;
	}
	
	@Override
	public int emailTotalCnt(String state) {
		int count = sqlMap.selectOne("emailTotalCnt", state);
		return count;
	}
	
	@Override
	public List<JoaHelpQuestionDTO> emailTypeList(Map map) {
		List<JoaHelpQuestionDTO> list = sqlMap.selectList("emailTypeList",map);
		return list;
	}
	
	@Override
	public int emailTypeTotalCnt(Map map) {
		int count = sqlMap.selectOne("emailTypeTotalCnt", map);
		return count;
	}
	
	@Override
	public List<JoaHelpQuestionDTO> emailSerchList(Map map) {
		List<JoaHelpQuestionDTO> list = sqlMap.selectList("emailSerchList",map);
		return list;
	}
	
	@Override
	public int emailSerchTotalCnt(Map map) {
		int count = sqlMap.selectOne("emailSerchTotalCnt", map);
		return count;
	}
}
