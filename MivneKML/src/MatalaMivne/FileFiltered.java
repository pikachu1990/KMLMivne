package MatalaMivne;

import java.util.ArrayList;

public class FileFiltered {
//done
	private ArrayList<String> mac = new ArrayList<String>(0);
	private ArrayList<String> ssid = new ArrayList<String>(0);
	private ArrayList<String> am = new ArrayList<String>(0);
	private ArrayList<String> datentime = new ArrayList<String>(0);
	private ArrayList<Integer> channel = new ArrayList<Integer>(0);
	private ArrayList<Integer> signal = new ArrayList<Integer>(0);
	private ArrayList<Double> lat = new ArrayList<Double>(0);
	private ArrayList<Double> lon = new ArrayList<Double>(0);
	private ArrayList<Double> alt = new ArrayList<Double>(0);
	private ArrayList<Double> acc = new ArrayList<Double>(0);
	private ArrayList<String> type = new ArrayList<String>(0);
	private ArrayList<String> File = new ArrayList<String>();
	private ArrayList<String> ID = new ArrayList<String>();
	
	public FileFiltered(String[] file) {
		for (int i=0; i<file.length;i++) {
			File.add(file[i]);
		}
		DatenTimeDivide();
		IDDivide();
		LatDivide();
		LonDivide();
		AltDivide();
		//Test();
	}
	
	public void Test() {
		for(int i=1;i<File.size()-1;i++) {
			System.out.println(datentime.get(i));
		}
	}
	
	public void DatenTimeDivide() {
		for (int i=1; i<File.size();i++) {
			datentime.add(File.get(i).substring(0, File.get(i).indexOf(',')));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void IDDivide() {
		for (int i=1; i<File.size();i++) {
			ID.add((File.get(i).substring(0, File.get(i).indexOf(','))));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void LatDivide() {
		for (int i=1; i<File.size();i++) {
			lat.add(Double.parseDouble((File.get(i).substring(0, File.get(i).indexOf(',')))));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void LonDivide() {
		for (int i=1; i<File.size();i++) {
			lon.add(Double.parseDouble((File.get(i).substring(0, File.get(i).indexOf(',')))));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void AltDivide() {
		for (int i=1; i<File.size();i++) {
			alt.add(Double.parseDouble((File.get(i).substring(0, File.get(i).indexOf(',')))));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
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

	public ArrayList<String> getFile() {
		return File;
	}

	public void setFile(ArrayList<String> file) {
		File = file;
	}

	public ArrayList<String> getID() {
		return ID;
	}

	public void setID(ArrayList<String> iD) {
		ID = iD;
	}
	
	
	
}
