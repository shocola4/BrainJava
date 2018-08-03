package chap13;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class BBSList {
	  private ArrayList<Integer>seqNoList = new ArrayList<Integer>();      //순번
	  
	  private ArrayList <String>titleList = new ArrayList<String>();   //제목
	  
	  private ArrayList <String> writerList = new ArrayList<String>();  //작성자 
	  
	  private ArrayList<Date> dateList = new ArrayList<Date>();      //저장일자
      
	  private ArrayList<Time> timeList = new ArrayList<Time>();      //저장시각
      
	  private boolean lastPage =false;//게시글 목록의 마지막 페이지인지 여부


	  public void setSeqNo(int index, Integer seqNo) {
			this.seqNoList.add(index, seqNo); 
		}
		
	public void setTitleList(int index, String title) {
		this.titleList .add(index, title);
	    }

	public void setWriterList(int index, String writer) {
		this.writerList .add(index, writer);
	    }

	public void setDateList(int index, Date date) {
		this.dateList .add(index, date);
	    }

	public void setTimeList(int index, Time time) {
		this.timeList .add(index, time);
	    }
	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}
	
	public Integer[] getSeqNoList() {
		return seqNoList.toArray(new Integer[seqNoList.size()]);
}

public String[] getTitleList() {
	return titleList.toArray(new String[titleList.size()]);
}

public String[] getWriterList() {
	return writerList.toArray(new String[writerList.size()]);
}

public Date[] getDateList() {
	return dateList.toArray(new Date[dateList.size()]);
}


public Time[] getTimeList() {
	return timeList.toArray(new Time[timeList.size()]);
}

	
	public boolean isLastPage() {
		return lastPage;
	}

	public int getListSize() {
		return seqNoList.size();
	}
  

}
