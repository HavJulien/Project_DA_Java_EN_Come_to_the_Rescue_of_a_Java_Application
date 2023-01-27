package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

import com.hemebiotech.interfaces.ISymptomCounter;

/**
 * Class used to count the symptoms
 * 
 * @author havardjulien
 *
 */
public class CountSymptoms implements ISymptomCounter{

	/**
	 * Parse a list and counts the number of occurrences
	 * Adds them to a TreeMap with keys = symptoms and values = occurrences
	 * 
	 * @param listSymptoms Unordered list of symptoms
	 * @return {@code TreeMap<String, Integer>} ordered map of {@code <Symptom, Occurrences>}
	 */
	@Override
	public TreeMap<String, Integer> countSymptomsFromList(List<String> listSymptoms) {
		TreeMap<String, Integer> symptomCount = new TreeMap<String, Integer>();

		for(String nameSymptom : listSymptoms) {
			Integer i = symptomCount.get(nameSymptom);
			
			// if new symptom -> Create a new entry
			if (i == null) {
				symptomCount.put(nameSymptom, 1);
			} else {
				symptomCount.put(nameSymptom, i + 1);
			}
		}

		return symptomCount;
	}

}
