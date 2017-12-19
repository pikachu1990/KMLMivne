package MatalaMivne;

import java.util.ArrayList;
import java.util.Arrays;
//could improve
public class LocationFilter {

	private double Lat,Lon,Alt,Radius,Radius2;
	private ArrayList<Double> Latlist = new ArrayList<Double>();
	private ArrayList<Double> Lonlist = new ArrayList<Double>();
	private ArrayList<Double> Altlist = new ArrayList<Double>();
	private ArrayList<Integer> FinalArrayIndexes = new ArrayList<Integer>();
	private int [][]Indexes  = new int [0][0];
	public LocationFilter(double lat,double lon,double alt,double radius,int[][] indexes,File File) {
		for (int i=0;i<File.getLat().size();i++) {
			Latlist.add(File.getLat().get(i));
			Lonlist.add(File.getLon().get(i));
			Altlist.add(File.getAlt().get(i));
		}
		Indexes = Arrays.copyOf(indexes, indexes.length);
		Lat = lat;
		Lon = lon;
		Alt = alt;
		Radius = radius;
		radiuscheckfilter();
		//Test();
	}
	
	public void Test() {
		for (int i=0;i<FinalArrayIndexes.size();i++) {
			System.out.println(FinalArrayIndexes.get(i));
		}
	}
	
	public void radiuscheckfilter() {
		for (int i=0;i<Indexes.length;i++) {
			Radius2=(Math.sqrt((Lat-Latlist.get(Indexes[i][0]))*(Lat-Latlist.get(Indexes[i][0]))+(Lon-Lonlist.get(Indexes[i][0]))*(Lon-Lonlist.get(Indexes[i][0]))+(Alt-Altlist.get(Indexes[i][0]))*(Alt-Altlist.get(Indexes[i][0]))));
			if (Radius2<Radius) {
				FinalArrayIndexes.add(i);
			}
		}
	}

	public double getLat() {
		return Lat;
	}

	public void setLat(double lat) {
		Lat = lat;
	}

	public double getLon() {
		return Lon;
	}

	public void setLon(double lon) {
		Lon = lon;
	}

	public double getAlt() {
		return Alt;
	}

	public void setAlt(double alt) {
		Alt = alt;
	}

	public double getRadius() {
		return Radius;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}

	public double getRadius2() {
		return Radius2;
	}

	public void setRadius2(double radius2) {
		Radius2 = radius2;
	}

	public ArrayList<Double> getLatlist() {
		return Latlist;
	}

	public void setLatlist(ArrayList<Double> latlist) {
		Latlist = latlist;
	}

	public ArrayList<Double> getLonlist() {
		return Lonlist;
	}

	public void setLonlist(ArrayList<Double> lonlist) {
		Lonlist = lonlist;
	}

	public ArrayList<Double> getAltlist() {
		return Altlist;
	}

	public void setAltlist(ArrayList<Double> altlist) {
		Altlist = altlist;
	}

	public ArrayList<Integer> getFinalArrayIndexes() {
		return FinalArrayIndexes;
	}

	public void setFinalArrayIndexes(ArrayList<Integer> finalArrayIndexes) {
		FinalArrayIndexes = finalArrayIndexes;
	}

	public int[][] getIndexes() {
		return Indexes;
	}

	public void setIndexes(int[][] indexes) {
		Indexes = indexes;
	}
	
	
	
}
