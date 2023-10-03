package com.read.csv.assignment;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReadCSV {

	public static void main(String[] args) throws IOException, CsvException {
		// TODO Auto-generated method stub
		
		File csvFile = new File(System.getProperty("user.dir")+"//AssignmentForReadCSVFile -testData//loginData.csv");
		
		FileReader fileReader = new FileReader(csvFile);
		
		CSVReader csvReader = new CSVReader(fileReader);
		
		List<String[]> dataList = csvReader.readAll();

		for (String data[] : dataList)
		{
			
			for (String myValues : data) 
			{
				System.out.println(myValues);
				
			}
			
			System.out.println("");
		}
	}

}
