package br.com.daniela;

public class Main {

	public static void main(String[] args) {
		new CsvFileWriter(10000000).writeCsvFile("censo2018_1.csv");
	}

}
  