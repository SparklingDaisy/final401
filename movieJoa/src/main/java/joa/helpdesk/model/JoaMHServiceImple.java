package joa.helpdesk.model;

import java.util.*;

public class JoaMHServiceImple implements JoaMHService {
	
	private JoaManyHelpDAO JoaManyHelpDao;
	
	public JoaMHServiceImple(JoaManyHelpDAO joaManyHelpDao) {
		super();
		JoaManyHelpDao = joaManyHelpDao;
	}

	@Override
	public int addManyHelp(JoaManyHelpDTO dto) {
		int result = JoaManyHelpDao.addManyHelp(dto);
		return result;
	}

	@Override
	public int deleteManyHelp(int idx) {
		int result = JoaManyHelpDao.deleteManyHelp(idx);
		return result;
	}

	@Override
	public int rewriteManyHelp(JoaManyHelpDTO dto) {
		int result = JoaManyHelpDao.rewriteManyHelp(dto);
		return result;
	}

	@Override
	public List<JoaManyHelpDTO> ManyHelpList(int cp, int ls) {
		int start = (cp-1)*ls+1;
		int end = cp*ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<JoaManyHelpDTO> list = JoaManyHelpDao.ManyHelpList(map);
		return list;
	}

	@Override
	public List<JoaManyHelpDTO> serchManyHelpList(String type,int cp, int ls) {
		int start = (cp-1)*ls+1;
		int end = cp*ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<JoaManyHelpDTO> list = JoaManyHelpDao.serchManyHelpList(type,map);
		return list;
	}

	@Override
	public JoaManyHelpDTO ManyHelpBorder(int idx) {
		JoaManyHelpDTO dto = JoaManyHelpDao.ManyHelpBorder(idx);
		return dto;
	}
	
	@Override
	public List<JoaManyHelpDTO> manyHelpType(String keyword,int cp, int ls) {
		int start = (cp-1)*ls+1;
		int end = cp*ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<JoaManyHelpDTO> list = JoaManyHelpDao.manyHelpType(keyword, map);
		return list;
	}

}
