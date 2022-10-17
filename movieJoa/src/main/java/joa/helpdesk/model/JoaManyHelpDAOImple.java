package joa.helpdesk.model;

import java.util.*;

import org.mybatis.spring.SqlSessionTemplate;

import java.sql.*;

public class JoaManyHelpDAOImple implements JoaManyHelpDAO {
	
	private SqlSessionTemplate sqlMap;
	
	public JoaManyHelpDAOImple(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}
	
	@Override
	public int addManyHelp(JoaManyHelpDTO dto) {
		int result = sqlMap.insert("ManyHelpInsert", dto);
		return result;
	}

	@Override
	public int deleteManyHelp(int idx) {
		int result = sqlMap.insert("ManyHelpDelete",idx);
		return 0;
	}

	@Override
	public int rewriteManyHelp(JoaManyHelpDTO dto) {
		int result = sqlMap.insert("ManyHelpUpdate",dto);
		return 0;
	}

	@Override
	public List<JoaManyHelpDTO> ManyHelpList(Map map) {
		List<JoaManyHelpDTO> list = sqlMap.selectList("ManyHelpList");
		return list;
	}
	
	@Override
	public List<JoaManyHelpDTO> manyHelpType(Map map) {
		List<JoaManyHelpDTO> list= sqlMap.selectList("ManyHelpType");
		return list;
	}

	@Override
	public JoaManyHelpDTO ManyHelpBorder(int idx) {
		JoaManyHelpDTO dto = sqlMap.selectOne("ManyHelpBorder",idx);
		return dto;
	}

	@Override
	public List<JoaManyHelpDTO> serchManyHelpList(Map map) {
		List<JoaManyHelpDTO> list = sqlMap.selectList("SerchManyHelpList");
		return list;
	}
	
	@Override
	public int manyHelpListTotalCnt() {
		int count = sqlMap.selectOne("ManyHelpListTotalCnt");
		return count;
	}
	
	@Override
	public int manyHelpTypeTotalCnt(Map map) {
		int count = sqlMap.selectOne("ManyHelpTypeTotalCnt", map);
		return count;
	}
	
	@Override
	public int serchManyHelpListTotalCnt(Map map) {
		int count = sqlMap.selectOne("SerchManyHelpListTotalCnt", map);
		return count;
	}

}
