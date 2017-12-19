package MatalaMivne;

import java.util.ArrayList;

public class File {
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
	
	public File(ArrayList<String> file) {
		for (int i=0; i<file.size();i++) {
			File.add(file.get(i));
		}
		MacDivide();
		SSIDDivide();
		AuthModeDivide();
		DatenTimeDivide();
		ChannelDivide();
		SignalDivide();
		LatDivide();
		LonDivide();
		AltDivide();
		AccDivide();
		TypeDivide();
		//Test();
	}
	
	public void Test() {
		for(int i=0;i<File.size();i++) {
			System.out.println(channel.get(i));
		}
	}
	
	public void MacDivide() {
		for (int i=0; i<File.size();i++) {
			mac.add(File.get(i).substring(0, File.get(i).indexOf(',')));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void SSIDDivide() {
		for (int i=0; i<File.size();i++) {
			ssid.add(File.get(i).substring(0, File.get(i).indexOf(',')));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void AuthModeDivide() {
		for (int i=0; i<File.size();i++) {
			am.add(File.get(i).substring(0, File.get(i).indexOf(',')));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void DatenTimeDivide() {
		for (int i=0; i<File.size();i++) {
			datentime.add(File.get(i).substring(0, File.get(i).indexOf(',')));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void ChannelDivide() {
		for (int i=0; i<File.size();i++) {
			channel.add(Integer.parseInt(File.get(i).substring(0, File.get(i).indexOf(','))));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void SignalDivide() {
		for (int i=0; i<File.size();i++) {
			signal.add(Integer.parseInt(File.get(i).substring(0, File.get(i).indexOf(','))));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void LatDivide() {
		for (int i=0; i<File.size();i++) {
			lat.add(Double.parseDouble((File.get(i).substring(0, File.get(i).indexOf(',')))));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void LonDivide() {
		for (int i=0; i<File.size();i++) {
			lon.add(Double.parseDouble((File.get(i).substring(0, File.get(i).indexOf(',')))));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void AltDivide() {
		for (int i=0; i<File.size();i++) {
			alt.add(Double.parseDouble((File.get(i).substring(0, File.get(i).indexOf(',')))));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void AccDivide() {
		for (int i=0; i<File.size();i++) {
			acc.add(Double.parseDouble(File.get(i).substring(0, File.get(i).indexOf(','))));	
			File.set(i, File.get(i).substring(File.get(i).indexOf(',')+1, File.get(i).length()));
		}
	}
	
	public void TypeDivide() {
		for (int i=0; i<File.size();i++) {
			type.add(File.get(i).substring(0, File.get(i).length()));	
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
	
	
}
