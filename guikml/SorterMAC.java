package guikml;

import java.util.ArrayList;
import java.util.Comparator;

class SorterMAC implements Comparable<SorterMAC> {

	int INDEX,SIGNAL,CHANNEL;
	double LAT,LON,ALT;
	String TIME,ID,AUTHMODE,MAC,SSID;

    SorterMAC(int index,int signal,int channel,double lat,double lon,double alt ,String time,String id ,String mac,String ssid){
    	
    	//Integers.
    	this.INDEX = index;
    	this.SIGNAL = signal;
    	this.CHANNEL = channel;
    	//Doubles.
    	this.LAT = lat;
    	this.LON = lon;
    	this.ALT = alt;
    	//Strings.
    	this.TIME = time + "";
    	this.ID = id + "";
    	this.MAC = mac + "";
    	this.SSID = ssid + "";
    	
    }
        public int compareTo(SorterMAC o) {
        	
        	int i = this.MAC.compareTo(o.MAC);
            if (i != 0) return i;

            return this.SIGNAL-o.SIGNAL;
            
        }
        
        
		public int getINDEX() {
			return INDEX;
		}
		public void setINDEX(int iNDEX) {
			INDEX = iNDEX;
		}
		public int getSIGNAL() {
			return SIGNAL;
		}
		public void setSIGNAL(int sIGNAL) {
			SIGNAL = sIGNAL;
		}
		public int getCHANNEL() {
			return CHANNEL;
		}
		public void setCHANNEL(int cHANNEL) {
			CHANNEL = cHANNEL;
		}
		public double getLAT() {
			return LAT;
		}
		public void setLAT(double lAT) {
			LAT = lAT;
		}
		public double getLON() {
			return LON;
		}
		public void setLON(double lON) {
			LON = lON;
		}
		public double getALT() {
			return ALT;
		}
		public void setALT(double aLT) {
			ALT = aLT;
		}
		public String getTIME() {
			return TIME;
		}
		public void setTIME(String tIME) {
			TIME = tIME;
		}
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public String getAUTHMODE() {
			return AUTHMODE;
		}
		public void setAUTHMODE(String aUTHMODE) {
			AUTHMODE = aUTHMODE;
		}
		public String getMAC() {
			return MAC;
		}
		public void setMAC(String mAC) {
			MAC = mAC;
		}
		public String getSSID() {
			return SSID;
		}
		public void setSSID(String sSID) {
			SSID = sSID;
		}
        
    
      
}    