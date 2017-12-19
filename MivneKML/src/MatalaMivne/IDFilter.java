package MatalaMivne;

import java.util.ArrayList;
import java.util.Arrays;

//Done
public class IDFilter {

	private ArrayList<Integer> FinalArrayIndexes = new ArrayList<Integer>();
	private String ID;
	private int Indexes[][]= new int [0][0];
	
	public IDFilter (String id,int [][] indexes, File File) {
		ID=id+"";
		Indexes = Arrays.copyOf(indexes, indexes.length);
		IDFilter();
	}
	
	public void IDFilter() {
		for (int i=0;i<Indexes.length;i++) {
			if (ID.equals(Reader.id.get(Indexes[i][0]))) {
				FinalArrayIndexes.add(i);
			}
		}
	}

	public ArrayList<Integer> getFinalArrayIndexes() {
		return FinalArrayIndexes;
	}

	public void setFinalArrayIndexes(ArrayList<Integer> finalArrayIndexes) {
		FinalArrayIndexes = finalArrayIndexes;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int[][] getIndexes() {
		return Indexes;
	}

	public void setIndexes(int[][] indexes) {
		Indexes = indexes;
	}
	
	
}
