package MatalaMivne;

import java.util.ArrayList;
import java.util.Arrays;
//can improve
public class FilteredIndexes {
	private int Info[][] = new int [0][0];
	private int MaxIndex[][] = new int[50][0];
	private ArrayList<String> file = new ArrayList<String>(0);
	private ArrayList<String> Names = new ArrayList<String>(0);
	private ArrayList<String> Mixed = new ArrayList<String>(0);
	private ArrayList<String> datentime = new ArrayList<String>(0);
	private ArrayList<Double> lat = new ArrayList<Double>(0);
	private ArrayList<Double> lon = new ArrayList<Double>(0);
	private ArrayList<Double> alt = new ArrayList<Double>(0);
	private ArrayList<Integer> signal = new ArrayList<Integer>(0);
	private ArrayList<Integer> signal2 = new ArrayList<Integer>(0);
	private int sig[] = new int [0];
	private int MaxNum[] = new int [0];
	
	public FilteredIndexes(File file) {
		for (int i=0;i<file.getDatentime().size();i++) {
			datentime.add(file.getDatentime().get(i));
			lat.add(file.getLat().get(i));
			lon.add(file.getLon().get(i));
			alt.add(file.getAlt().get(i));
			signal.add(file.getSignal().get(i));
			signal2.add(file.getSignal().get(i));
		}
		mix();
		Filtered();
		Info=Indexes();
		MaxIndex=Arrays.copyOf(MaxIndex, Info.length);
		for (int i=0;i<signal.size();i++) {
			sig = Arrays.copyOf(sig, sig.length+1);
			sig[i] = signal.get(i);
		}
		for (int i=0;i<Info.length;i++) {
			MaxIndex[i]=MaxNumbers(sig,10,i);	
		}
	//	Test();
	}
	
	public void Test() {
		for (int i=0;i<MaxIndex.length;i++) {
			for (int j=0;j<MaxIndex[i].length;j++) {
				System.out.println(signal.get(MaxIndex[i][j]));
		}
			System.out.println("line");}
	}
	
	public void mix(){//add together DatenTime, Lat ,Lon and Alt.
		for (int i=0;i<lat.size();i++) {
		Names.add(datentime.get(i)+","+lat.get(i)+","+lon.get(i)+","+alt.get(i));
		Mixed.add(datentime.get(i)+","+lat.get(i)+","+lon.get(i)+","+alt.get(i));
	}
}
	
	public void Filtered() {//Removes any twice occuring mixes(DatenTime,Lat,Lon,Alt
		for (int i=0;i<Names.size();i++) {
			for (int j=1;j<Names.size()-i;j++) {
			if(Names.get(i).equals(Names.get(j+i))) {
			Names.remove(j+i);
			j--;}
			}
		}
	}
	
	public int[][] Indexes() {//Uses old unchanged indexes and insert them into info using all the Mixed names in an 2d array. [NamenDate index][Locations it apears]
		int info[][] = new int[Names.size()][0];
		int z=0;
		for (int i=0;i<Names.size();i++) {
			for (int j=0;j<Mixed.size();j++) {
				if (Names.get(i).equals(Mixed.get(j))) {
					info[i]= Arrays.copyOf(info[i], info[i].length+1);
					info[i][z]=j;
					z++;
				}
			}
			z=0;		
		}
		return info;
	}
	
	public int[] MaxNumbers(int Number[],int amount,int index) {//Method that Calculates top 10 Indexs of Signal incase there is more then 10
		int MaxNum []= new int[0];
		int Max=-100000;
		if (amount>Info[index].length) {amount=Info[index].length;}
		for (int j=0;j<amount;j++) {
		for (int i=0;i<Info[index].length;i++) {
			if (Number[Info[index][i]]>Max) {
				Max=Number[Info[index][i]];
				MaxNum = Arrays.copyOf(MaxNum, MaxNum.length+1);
				MaxNum[j]=Info[index][i];
			}
		}
		Max=-100000;
		Number[MaxNum[j]]=-1000000;
		}
		MaxNum=Arrays.copyOf(MaxNum, amount);
		return MaxNum;}

	public int[][] getInfo() {
		return Info;
	}

	public void setInfo(int[][] info) {
		Info = info;
	}

	public int[][] getMaxIndex() {
		return MaxIndex;
	}

	public void setMaxIndex(int[][] maxIndex) {
		MaxIndex = maxIndex;
	}

	public ArrayList<String> getFile() {
		return file;
	}

	public void setFile(ArrayList<String> file) {
		this.file = file;
	}

	public ArrayList<String> getNames() {
		return Names;
	}

	public void setNames(ArrayList<String> names) {
		Names = names;
	}

	public ArrayList<String> getMixed() {
		return Mixed;
	}

	public void setMixed(ArrayList<String> mixed) {
		Mixed = mixed;
	}

	public ArrayList<String> getDatentime() {
		return datentime;
	}

	public void setDatentime(ArrayList<String> datentime) {
		this.datentime = datentime;
	}

	public ArrayList<Double> getLat() {
		return lat;
	}

	public void setLat(ArrayList<Double> lat) {
		this.lat = lat;
	}

	public ArrayList<Double> getLon() {
		return lon;
	}

	public void setLon(ArrayList<Double> lon) {
		this.lon = lon;
	}

	public ArrayList<Double> getAlt() {
		return alt;
	}

	public void setAlt(ArrayList<Double> alt) {
		this.alt = alt;
	}

	public ArrayList<Integer> getSignal() {
		return signal;
	}

	public void setSignal(ArrayList<Integer> signal) {
		this.signal = signal;
	}

	public ArrayList<Integer> getSignal2() {
		return signal2;
	}

	public void setSignal2(ArrayList<Integer> signal2) {
		this.signal2 = signal2;
	}

	public int[] getSig() {
		return sig;
	}

	public void setSig(int[] sig) {
		this.sig = sig;
	}

	public int[] getMaxNum() {
		return MaxNum;
	}

	public void setMaxNum(int[] maxNum) {
		MaxNum = maxNum;
	}
	
	
	}
