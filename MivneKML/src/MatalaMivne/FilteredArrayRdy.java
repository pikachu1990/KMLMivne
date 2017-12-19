package MatalaMivne;

import java.util.ArrayList;
import java.util.Arrays;

public class FilteredArrayRdy {
//done
	private ArrayList<Integer> ILoc = new ArrayList<Integer>();
	int [][]MaxIndex = new int [0][0];
	int [][]RdyArray = new int [0][0];
	public FilteredArrayRdy (ArrayList<Integer> MiniIndex,int[][]maxindex) {
		for (int i=0;i<MiniIndex.size();i++) {
			ILoc.add(MiniIndex.get(i));
		}
		MaxIndex = Arrays.copyOf(maxindex, maxindex.length);
		RdyArray = GettingReady();
	}
	
	public int[][] GettingReady() {
		int [][] FilteredRdy = new int [ILoc.size()][0];
		for (int i=0;i<ILoc.size();i++) {
			for (int j=0;j<MaxIndex[ILoc.get(i)].length;j++) {
			FilteredRdy[i]= Arrays.copyOf(FilteredRdy[i],FilteredRdy[i].length+1);
			FilteredRdy[i][j]= MaxIndex[ILoc.get(i)][j];
		}}
		return FilteredRdy;
	}

	public ArrayList<Integer> getILoc() {
		return ILoc;
	}

	public void setILoc(ArrayList<Integer> iLoc) {
		ILoc = iLoc;
	}

	public int[][] getMaxIndex() {
		return MaxIndex;
	}

	public void setMaxIndex(int[][] maxIndex) {
		MaxIndex = maxIndex;
	}

	public int[][] getRdyArray() {
		return RdyArray;
	}

	public void setRdyArray(int[][] rdyArray) {
		RdyArray = rdyArray;
	}
	
	
}
