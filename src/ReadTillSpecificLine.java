import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class ReadTillSpecificLine {

public static void main(String[] args) {

String csvFile = "text.txt";
BufferedReader br = null;
String line = "";
String cvsSplitBy = ",";
HashMap<Integer,String[]> linevalues=new HashMap<>();

	try {
	br = new BufferedReader(new FileReader(csvFile));
	int i=1;
	
		while ((line = br.readLine())!= null) {
		do {
		String[] data = line.split(cvsSplitBy);
		linevalues.put(i,data);
	    System.out.println(Arrays.toString(data));
		}while(line.equalsIgnoreCase("<Trailer>"));   //do while{} -----> TO read till that line
		
		i++;
	
	}

 System.out.print(linevalues);

} catch (FileNotFoundException e) {e.printStackTrace();} catch (IOException e) {e.printStackTrace();} 
	finally {
		 if (br != null) {
			 	try {

			 			br.close();

			 		} catch (IOException e) { e.printStackTrace(); }

           }
       }

 }
}