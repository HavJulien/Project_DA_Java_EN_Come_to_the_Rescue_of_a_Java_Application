package com.hemebiotech.analytics;

import com.hemebiotech.interfaces.ISymptomReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class used to read a file and list the symptoms
 * 
 * @author havardjulien
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filePath;
	
	public ReadSymptomDataFromFile (String filePath) {
		this.filePath = filePath;
	}
	
	/** {@code}
	 * If no data is available, return an empty List
	 * 
	 * @return {@code List<String>} a raw listing of all Symptoms obtained from a file source
	 */
	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filePath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filePath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
