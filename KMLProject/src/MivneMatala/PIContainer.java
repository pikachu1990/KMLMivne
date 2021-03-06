package MivneMatala;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PIContainer {
	
	private ArrayList<Integer> LINE= new ArrayList<Integer>();
	private ArrayList<Double> PI = new ArrayList<Double>();
	private ArrayList<SorterPI> SorterPI = new ArrayList<SorterPI>();
	int SIZE = 0 ;
	
	
	public PIContainer(ArrayList<Integer> line, ArrayList<Double> pi) {
		
		for(Integer List : line) {this.LINE.add(List);}
		for(Double List : pi) {this.PI.add(List);}
		
		TOP3();
		
	}
	
	public void TOP3() {
		
		for (int i=0;i<LINE.size();i++) {
			
			SorterPI.add(new SorterPI(LINE.get(i),PI.get(i)));
		}
		
		Collections.sort(SorterPI);
		
		SIZE=SorterPI.size()-3;
		for (int i=0;i<SIZE;i++) {
			
			SorterPI.remove(0);
			
		}
	}

	public ArrayList<Integer> getLINE() {
		return LINE;
	}

	public void setLINE(ArrayList<Integer> lINE) {
		LINE = lINE;
	}

	public ArrayList<Double> getPI() {
		return PI;
	}

	public void setPI(ArrayList<Double> pI) {
		PI = pI;
	}

	public ArrayList<SorterPI> getSorterPI() {
		return SorterPI;
	}

	public void setSorterPI(ArrayList<SorterPI> sorterPI) {
		SorterPI = sorterPI;
	}
	
}
