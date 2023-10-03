# Data-Provider-Method- Pass the CSV testData to test Method

I have created loginData.csv file.
Added opencsv library in pom.xml folder.
opencsv is a dependency to read csv file in Java.
I have created utility Method where handled a excepations through try catch for File, FileReader, CSVReader class and used Read all method to get the all data.
Then created component(package) com.dataproviders and class where used @Dataprovider Method.
