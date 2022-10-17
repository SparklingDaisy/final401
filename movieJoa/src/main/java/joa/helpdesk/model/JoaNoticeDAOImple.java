package joa.helpdesk.model;

import java.util.*;

import org.mybatis.spring.SqlSessionTemplate;

import java.sql.*;

public class JoaNoticeDAOImple implements JoaNoticeDAO {
	
	private SqlSessionTemplate sqlMap;
	
	public JoaNoticeDAOImple(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	public JoaNoticeDAOImple() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int addNotice(JoaNoticeDTO dto) {
		int result = sqlMap.insert("NoticeInsert",dto);
		return result;
	}

	@Override
	public int deleteNotice(int idx) {
		int result = sqlMap.insert("NoticeDelete",idx);
		return result;
	}

	@Override
	public int rewriteNotice(JoaNoticeDTO dto) {
		int result = sqlMap.insert("NoticeUpdate",dto);
		return result;
	}

	@Override
	public List<JoaNoticeDTO> NoticeList(Map map) {
		List<JoaNoticeDTO> list = sqlMap.selectList("NoticeList");
		return list;
	}

	@Override
	public List<JoaNoticeDTO> noticeType(Map map) {
		List<JoaNoticeDTO> list = sqlMap.selectList("NoticeType");
		return list;
	}
	
	@Override
	public List<JoaNoticeDTO> serchNoticeList(Map map) {
		List<JoaNoticeDTO> list = sqlMap.selectList("SerchNoticeList");
		return list;
	}

	@Override
	public JoaNoticeDTO noticeBorder(int idx) {
		JoaNoticeDTO dto = sqlMap.selectOne("NoticeBorder",idx);
		return dto;
	}
	
	@Override
	public int noticeTotalCnt() {
		int count = sqlMap.selectOne("NoticeListTotalCnt");
		return count;
	}
	
	@Override
	public int noticeTypeTotalCnt(Map map) {
		int count = sqlMap.selectOne("NoticeTypeTotalCnt");
		return count;
	}
	
	@Override
	public int serchNoticeTotalCnt(Map map) {
		int count = sqlMap.selectOne("SerchNoticeListTotalCnt");
		return count;
	}

}
