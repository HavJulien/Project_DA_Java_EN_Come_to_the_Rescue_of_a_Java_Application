package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * Main class used for the logic of analytics
 * 
 * @author havardjulien
 *
 */
public class AnalyticsCounter {
	
	/**
	 * Main class, starts the program
	 */
	public static void main(){
		String inputFile = "symptoms.txt";
		String outputFile = "result.out";
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(inputFile);
		WriteSymptomsToFile result = new WriteSymptomsToFile(outputFile);
		CountSymptoms counter = new CountSymptoms();
		TreeMap<String, Integer> symptomMap = new TreeMap<String, Integer>();
		
		symptomMap = counter.countSymptomsFromList(reader.getSymptoms());
		result.printMaptoFile(symptomMap);
	}
}
