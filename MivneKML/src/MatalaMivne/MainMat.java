package MatalaMivne;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;


public class MainMat {
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		//Folder Reader
		ArrayList<String> FinalArray = new ArrayList<String>();
		FileNames Folder = new FileNames("C:\\Mivne\\","WigleWifi"); // returns ArrayList with Folder names Containing FilterWord
		Reader FileArr [] = new Reader[Folder.getPaths().size()]; // Creates an Array of Constructors Readers.
		
		for (int i=0;i<FileArr.length;i++) {
			FileArr[i]= new Reader(Folder.getPaths().get(i)); // Insert one file at a time into FileArr.
			FinalArray.addAll(FileArr[i].getFileList()); //Adds Read Materials to an ArrayList.
		}
		
		//First Filtering
		File check = new File(FinalArray); // Separates all important info into ArrayLists (Lat,Lon,Alt....)
		FilteredIndexes GroupsIndex = new FilteredIndexes(check);//Gives MaxIndexes for each Similar Group. [GroupNumber][Index]
		FilteredArray Groups = new FilteredArray(GroupsIndex.getMaxIndex(),FinalArray,check);//Makes Final FilteredArray Rdy to print.
		FileFiltered Info = new FileFiltered(Groups.getFinalarray());
		Writer TestWrite = new Writer("C:\\Mivne\\FileFiltered.csv",Groups.getFinalarray());//Prints the FilteredArray
			
		//Second Filtering - by Input
		
		InputFilter Location = new InputFilter();//Checks the Input is Correct!
		
		if (Location.getFilterstatus().equals("ID")) {
		IDFilter GroupsByIDIndex = new IDFilter(Location.getID(),GroupsIndex.getMaxIndex(),check);//Filters ID Returns an ArrayList of Indexes of Groups
		FilteredArrayRdy GroupsByIDPrep = new FilteredArrayRdy(GroupsByIDIndex.getFinalArrayIndexes(),GroupsIndex.getMaxIndex());//Prepares the Array for Printing
		FilteredArray GroupsByID = new FilteredArray(GroupsByIDPrep.getRdyArray(),FinalArray,check);//Makes the Array for printing.
		FileFiltered InfoByID = new FileFiltered(Groups.getFinalarray());//Gives Info to play with
		Writer IDFiltered = new Writer("C:\\Mivne\\FileFilteredByID.csv",GroupsByID.getFinalarray());}//Prints the Array
		
		
		if (Location.getFilterstatus().equals("T")) {
		TimeFilter GroupsByTimeIndex = new TimeFilter(Location.getDatenTime(),Location.getDatenTime2(),GroupsIndex.getMaxIndex(),check);//Filters Time Returns an ArrayList of Indexes of Groups
		FilteredArrayRdy GroupsByTimePrep = new FilteredArrayRdy(GroupsByTimeIndex.getFinalArrayIndexes(),GroupsIndex.getMaxIndex());//Makes the Array for printing.
		FilteredArray GroupsByTime = new FilteredArray(GroupsByTimePrep.getRdyArray(),FinalArray,check);//Prints the Array
		FileFiltered InfoByTime = new FileFiltered(Groups.getFinalarray());//Gives info to play with
		Writer TimeFiltered = new Writer("C:\\Mivne\\FileFilteredByTime.csv",GroupsByTime.getFinalarray());}
		
		
		if (Location.getFilterstatus().equals("L")) {
		LocationFilter a = new LocationFilter(Location.getLat(),Location.getLon(),Location.getAlt(),Location.getRadius(),GroupsIndex.getMaxIndex(),check);//Filters Location Returns an ArrayList of Indexes of Groups
		FilteredArrayRdy GroupsByLocationIndex = new FilteredArrayRdy(a.getFinalArrayIndexes(),GroupsIndex.getMaxIndex());//Makes the Array for printing.
		FilteredArray GroupsByLocation = new FilteredArray(GroupsByLocationIndex.getRdyArray(),FinalArray,check);//Prints the Array
		FileFiltered InfoByLocation = new FileFiltered(Groups.getFinalarray());//Gives info to play with
		Writer LocationFiltered = new Writer("C:\\Mivne\\FileFilteredByLocation.csv",GroupsByLocation.getFinalarray());}
		}
	}


