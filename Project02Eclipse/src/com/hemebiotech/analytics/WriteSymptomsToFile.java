package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.hemebiotech.interfaces.ISymptomWriter;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Class used to print to a file
 * 
 * @author havardjulien
 * 
 */
public class WriteSymptomsToFile implements ISymptomWriter{
	private String filepath;

	public WriteSymptomsToFile (String file) {
		this.filepath = file;
	}
	
	public void setFilepath (String file) {
		this.filepath = file;
	}
	
	/**
	 *Method that prints an ordered map of String, Integer to the file specified
	 *If the map is empty, creates an empty file
	 *
	 *@param orderedMap map of {@code <Symptom, Occurrences>}
	 *
	 */
	@Override
	public void printMaptoFile(TreeMap<String, Integer> orderedMap) {
		File resultOut = new File(filepath);

		try(BufferedWriter writer = new BufferedWriter(new FileWriter(resultOut))){
			for (Entry<String, Integer> entry : orderedMap.entrySet()) { 
				String symptomName = entry.getKey();
				Integer numbers = entry.getValue(); 
				writer.write(symptomName + "=" + numbers + "\n"); //  

			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
