package com.hemebiotech.interfaces;
import java.util.TreeMap;

/**
 * Anything that will print symptom data to a source
 */

public interface ISymptomWriter {

	 /**
	 * Print the ordered map to a file
	 * line output should match the need
	 * "symptom=occurrences"
	 * 
	 * @param orderedMap map of Symptom, Occurrences
	 * 
	 */
	public void printMaptoFile (TreeMap<String, Integer> orderedMap);
}
