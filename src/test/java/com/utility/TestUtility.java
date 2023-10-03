package com.utility;

import static com.utility.TestUtility.getJsonObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class TestUtility {
	public static String getJsonObject(Object pojo) {
		Gson gson = new Gson();
		String jsonData = gson.toJson(pojo);
		return jsonData;
	}

	public static Iterator<String[]> readCSVFile(String fileName) {

		File csvFile = new File(System.getProperty("user.dir") + "//AssignmentForReadCSVFile -testData//" + fileName);
		FileReader fileReader = null;
		CSVReader csvReader;
		List<String[]> dataList = null;

		try {
			fileReader = new FileReader(csvFile);
			csvReader = new CSVReader(fileReader);
			dataList = csvReader.readAll();

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		catch (CsvException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator<String[]> dataIterator = dataList.iterator();
		dataIterator.next();
		return dataIterator;
	}

}
	
	