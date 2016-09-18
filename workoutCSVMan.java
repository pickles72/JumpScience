import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
	
public class CSVReader {

	public static void main(String[] args) {
		
		String fileName = "levelE.csv"
		
		String[][] linesStrings = loadFile(fileName);
			
	}
	
	
	public static String[] loadFile(String fileName) {
		
		BufferedReader Br = null;
		String line = "";
		String cvsSplitBy = ",";
		ArrayList<String[]> lines = new ArrayList<String[]>();
		
		int i = 0;
		try {
			
			br = new BufferedReader(new FileReader(csvFile));
			while((line = br.readLine != null)) {
				
				String[] temp args= line.split(cvsSplitBy);
				lines.add(temp);
				i++;
				
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br!= null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		String[][] last = new String[lines.size()][6];
		last = lines.toArray(last);
		
		return last;
	}
}