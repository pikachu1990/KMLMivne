package MatalaMivne;
//not mine all good.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Input : Filename and Location
 * Return : Nothing - Just prints the file in the location creating a File.
 */
public class Writer {
	
	public Writer(String Filename,String Source[]) {
		Write(Filename,Source);
	}

	public void Write(String fileName,String Source[]) {// Method that Write into the file the Finished Data	                            
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            	 for (int i=0;i<Source.length;i++) {
                    	bufferedWriter.write(Source[i]);
                    	bufferedWriter.newLine();
            	 }
                   		                 		                        		                		                    
         // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }

        
}// Makes an array of all the latency numbers
}
