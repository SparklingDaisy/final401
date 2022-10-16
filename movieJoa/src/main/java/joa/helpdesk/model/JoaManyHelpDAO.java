package joa.helpdesk.model;

import java.util.*;

public interface JoaManyHelpDAO {
	
	public int addManyHelp(JoaManyHelpDTO dto);
	
	public int deleteManyHelp(int idx);
	
	public int rewriteManyHelp(JoaManyHelpDTO dto);
	
	public List<JoaManyHelpDTO> ManyHelpList(Map map);
	
	public List<JoaManyHelpDTO> manyHelpType(String type, Map map);
	
	public List<JoaManyHelpDTO> serchManyHelpList(String keyword, Map map);
	
	public JoaManyHelpDTO ManyHelpBorder(int idx);
	
	public int manyHelpListTotalCnt();
	
	public int serchManyHelpListTotalCnt(Map map);
	
	public int manyHelpTypeTotalCnt(Map map);
}
