import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
public static void main(String args[]){
	String words[];
	BufferedReader br;
	File file = new File("text.txt");
	System.out.println(file.getAbsolutePath());
	System.out.println(file.exists());
	
	
	try {
	br = new BufferedReader(new FileReader(file));
	/*	String line=br.readLine();
		while(line!=(null)){                         This code wont work because line always points to the first line
			System.out.println(line);
			br.readLine();} */
	
	String line="";
	while(null!=(line=br.readLine())){
		System.out.println(line);
		br.readLine();}
	
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	
}
}


