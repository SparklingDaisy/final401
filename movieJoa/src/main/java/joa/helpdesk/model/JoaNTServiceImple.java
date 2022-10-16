package joa.helpdesk.model;

import java.util.*;

public class JoaNTServiceImple implements JoaNTService {
	
	private JoaNoticeDAO JoaNoticeDao;
	
	public JoaNTServiceImple(JoaNoticeDAO joaNoticeDao) {
		super();
		JoaNoticeDao = joaNoticeDao;
	}

	@Override
	public int addNotice(JoaNoticeDTO dto) {
		int result = JoaNoticeDao.addNotice(dto);
		return result;
	}

	@Override
	public int deleteNotice(int idx) {
		int result = JoaNoticeDao.deleteNotice(idx);
		return result;
	}

	@Override
	public int rewriteNotice(JoaNoticeDTO dto) {
		int result = JoaNoticeDao.rewriteNotice(dto);
		return result;
	}

	@Override
	public List<JoaNoticeDTO> NoticeList(int cp, int ls) {
		int start = (cp-1)*ls+1;
		int end = cp*ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<JoaNoticeDTO> list = JoaNoticeDao.NoticeList(map);
		return list;
	}

	@Override
	public List<JoaNoticeDTO> serchNoticeList(String keyword, int cp, int ls) {
		int start = (cp-1)*ls+1;
		int end = cp*ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<JoaNoticeDTO> list = JoaNoticeDao.serchNoticeList(keyword,map);
		return list;
	}

	@Override
	public JoaNoticeDTO noticeBorder(int idx) {
		JoaNoticeDTO dto = JoaNoticeDao.noticeBorder(idx);
		return dto;
	}
	
	@Override
	public List<JoaNoticeDTO> noticeType(String type, int cp, int ls) {
		int start = (cp-1)*ls+1;
		int end = cp*ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<JoaNoticeDTO> list = JoaNoticeDao.noticeType(type, map);
		return list;
	}
}
