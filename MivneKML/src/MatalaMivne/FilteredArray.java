package MatalaMivne;

import java.util.ArrayList;
import java.util.Arrays;
//done
public class FilteredArray {
	private int Indexes[][] = new int [0][0];
	private ArrayList<String> file = new ArrayList<String>(0);
	private ArrayList<String> FinalArray = new ArrayList<String>(0);
	private String[] finalarray = new String[0];
	private ArrayList<String> mac = new ArrayList<String>(0);
	private ArrayList<String> ID = new ArrayList<String>(0);
	private ArrayList<String> ssid = new ArrayList<String>(0);
	private ArrayList<String> am = new ArrayList<String>(0);
	private ArrayList<String> datentime = new ArrayList<String>(0);
	private ArrayList<Integer> channel = new ArrayList<Integer>(0);
	private ArrayList<Integer> signal = new ArrayList<Integer>(0);
	private ArrayList<Double> lat = new ArrayList<Double>(0);
	private ArrayList<Double> lon = new ArrayList<Double>(0);
	private ArrayList<Double> alt = new ArrayList<Double>(0);
	private ArrayList<Double> acc = new ArrayList<Double>(0);
	private ArrayList<String> type = new ArrayList<String>(0);//this whole thing just makes an array with all the info input orginized for pre printing.
	public FilteredArray(int[][] MaxIndex,ArrayList<String> AFile,File File) {
		FinalArray.add("Time,ID,Lat,Alt,Lon,#WiFi Network,SSID1,MAC1,Channel1,Signal1,SSID2,MAC2,Channel2,Signal2,SSID3,MAC3,Channel3,Signal3,SSID4,MAC4,Channel4,Signal4,SSID5,MAC5,Channel5,Signal5,SSID6,MAC6,Channel6,Signal6,SSID7,MAC7,Channel7,Signal7,SSID8,MAC8,Channel8,Signal8,SSID9,MAC9,Channel9,Signal9,SSID10,MAC10,Channel10,Signal10");
		for (int i=0;i<File.getMac().size();i++) {
			file.add(AFile.get(i));
			mac.add(File.getMac().get(i));
			ssid.add(File.getSsid().get(i));
			am.add(File.getAm().get(i));
			datentime.add(File.getDatentime().get(i));
			channel.add(File.getChannel().get(i));
			signal.add(File.getSignal().get(i));
			lat.add(File.getLat().get(i));
			lon.add(File.getLon().get(i));
			alt.add(File.getAlt().get(i));
			acc.add(File.getAcc().get(i));
			type.add(File.getType().get(i));		
		}
		finalarray=Arrays.copyOf(finalarray, MaxIndex.length+1);
		finalarray[0]=("Time,ID,Lat,Lon,Alt,#WiFi Network,SSID1,MAC1,Channel1,Signal1,SSID2,MAC2,Channel2,Signal2,SSID3,MAC3,Channel3,Signal3,SSID4,MAC4,Channel4,Signal4,SSID5,MAC5,Channel5,Signal5,SSID6,MAC6,Channel6,Signal6,SSID7,MAC7,Channel7,Signal7,SSID8,MAC8,Channel8,Signal8,SSID9,MAC9,Channel9,Signal9,SSID10,MAC10,Channel10,Signal10");
		for (int i=0;i<MaxIndex.length;i++) {
			finalarray[i+1]=(datentime.get(MaxIndex[i][0])+","+Reader.id.get(MaxIndex[i][0])+","+lat.get(MaxIndex[i][0])+","+lon.get(MaxIndex[i][0])+","+alt.get(MaxIndex[i][0])+","+MaxIndex[i].length);
			for (int j=0;j<MaxIndex[i].length;j++) {
				finalarray[i+1]=(finalarray[i+1]+","+ssid.get(MaxIndex[i][j])+","+mac.get(MaxIndex[i][j])+","+channel.get(MaxIndex[i][j])+","+signal.get(MaxIndex[i][j]));
		}
		}
	//	Test();
		
	}
	
	public void Test() {
		for (int i=0;i<finalarray.length;i++) {
		System.out.println(finalarray[i]);
		}
	}
	public void Filterer() {
		
	}

	public int[][] getIndexes() {
		return Indexes;
	}

	public void setIndexes(int[][] indexes) {
		Indexes = indexes;
	}

	public ArrayList<String> getFile() {
		return file;
	}

	public void setFile(ArrayList<String> file) {
		this.file = file;
	}

	public ArrayList<String> getFinalArray() {
		return FinalArray;
	}

	public void setFinalArray(ArrayList<String> finalArray) {
		FinalArray = finalArray;
	}

	public String[] getFinalarray() {
		return finalarray;
	}

	public void setFinalarray(String[] finalarray) {
		this.finalarray = finalarray;
	}

	public ArrayList<String> getMac() {
		return mac;
	}

	public void setMac(ArrayList<String> mac) {
		this.mac = mac;
	}

	public ArrayList<String> getSsid() {
		return ssid;
	}

	public void setSsid(ArrayList<String> ssid) {
		this.ssid = ssid;
	}

	public ArrayList<String> getAm() {
		return am;
	}

	public void setAm(ArrayList<String> am) {
		this.am = am;
	}

	public ArrayList<String> getDatentime() {
		return datentime;
	}

	public void setDatentime(ArrayList<String> datentime) {
		this.datentime = datentime;
	}

	public ArrayList<Integer> getChannel() {
		return channel;
	}

	public void setChannel(ArrayList<Integer> channel) {
		this.channel = channel;
	}

	public ArrayList<Integer> getSignal() {
		return signal;
	}

	public void setSignal(ArrayList<Integer> signal) {
		this.signal = signal;
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

	public ArrayList<Double> getAcc() {
		return acc;
	}

	public void setAcc(ArrayList<Double> acc) {
		this.acc = acc;
	}

	public ArrayList<String> getType() {
		return type;
	}

	public void setType(ArrayList<String> type) {
		this.type = type;
	}
	
	
	
}
