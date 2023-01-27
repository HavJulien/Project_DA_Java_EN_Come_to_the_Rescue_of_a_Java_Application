package com.hemebiotech.interfaces;

import java.util.TreeMap;
import java.util.List;


/**
 * Anything that will be used to help count the number of symptoms
 * 
 * @author havardjulien
 *
 */
public interface ISymptomCounter {

	/**
	 * Parse a list and counts the number of occurrences
	 * Adds them to a TreeMap with keys = symptoms and values = occurrences
	 * 
	 * @param listSymptoms Unordered list of symptoms
	 * @return {@code TreeMap<String, Integer>} ordered map of {@code <Symptom, Occurrences>}
	 */
	public TreeMap<String, Integer> countSymptomsFromList(List<String> listSymptoms);
}
