package joa.theater.model;
import java.util.*;
public interface TheaterTimeService {

	public List<TheaterTimeDTO> timeList(String sch_dayd, String sch_branch);
}
