
/**
 * 
 */

/**
 * @author Moshe
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReaderFiltered DATA = new ReaderFiltered ("C:\\Mivne\\_comb_all_BM2_.csv");
		ReaderFiltered CHECK = new ReaderFiltered ("C:\\Mivne\\_comb_no_gps_ts2_.csv");
		
		FilteredContain CHECKContain = new FilteredContain (CHECK.getFileList());
		FilteredContain DATAContain = new FilteredContain (DATA.getFileList());
		
		Algorithm2 a  = new Algorithm2 (CHECKContain.getContain(),DATAContain.getContain());
		RdyToPrint test2 = new RdyToPrint(a.getALGOAFTER(),0);
		
		Writer FilteredFirst2 = new Writer("C:\\Mivne\\NewDay.csv",test2.getTOPRINT());
		
	}
}
	
	
