package MatalaMivne;
//done
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TimeFilter {

	private String BeginDate,EndDate;
	private Date Bdate = new Date();
	private Date Edate = new Date();
	private int Indexes[][]= new int [0][0];
	private ArrayList<String> DnT = new ArrayList<String>();
	private ArrayList<Integer> FinalArrayIndexes = new ArrayList<Integer>();
	public TimeFilter(String beginDate,String endDate,int [][] indexes,File File) throws ParseException {
		BeginDate = beginDate+"";
		EndDate = endDate+"";
		Indexes = Arrays.copyOf(indexes, indexes.length);
		for (int i=0;i<File.getDatentime().size();i++) {
			DnT.add(File.getDatentime().get(i));
		}
		StringToDate(); 
	}
	
	public void StringToDate() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Bdate=sdf.parse(BeginDate);
		Edate=sdf.parse(EndDate);
		for (int i=0;i<Indexes.length;i++) {
		if((Bdate.compareTo(sdf.parse(DnT.get(Indexes[i][0]))) * sdf.parse(DnT.get(Indexes[i][0])).compareTo(Edate) >= 0)){
			FinalArrayIndexes.add(i);
		}
		}
	}

	public String getBeginDate() {
		return BeginDate;
	}

	public void setBeginDate(String beginDate) {
		BeginDate = beginDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public Date getBdate() {
		return Bdate;
	}

	public void setBdate(Date bdate) {
		Bdate = bdate;
	}

	public Date getEdate() {
		return Edate;
	}

	public void setEdate(Date edate) {
		Edate = edate;
	}

	public int[][] getIndexes() {
		return Indexes;
	}

	public void setIndexes(int[][] indexes) {
		Indexes = indexes;
	}

	public ArrayList<String> getDnT() {
		return DnT;
	}

	public void setDnT(ArrayList<String> dnT) {
		DnT = dnT;
	}

	public ArrayList<Integer> getFinalArrayIndexes() {
		return FinalArrayIndexes;
	}

	public void setFinalArrayIndexes(ArrayList<Integer> finalArrayIndexes) {
		FinalArrayIndexes = finalArrayIndexes;
	}
	
	
	
}
	
