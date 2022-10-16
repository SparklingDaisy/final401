package joa.helpdesk.model;

import java.util.*;

public interface JoaNoticeDAO {
	
	public int addNotice(JoaNoticeDTO dto);
	
	public int deleteNotice(int idx);
	
	public int rewriteNotice(JoaNoticeDTO dto);
	
	public List<JoaNoticeDTO> NoticeList(Map map);
	
	public List<JoaNoticeDTO> noticeType(String type, Map map);
	
	public List<JoaNoticeDTO> serchNoticeList(String keyword, Map map);
	
	public JoaNoticeDTO noticeBorder(int idx);
}
