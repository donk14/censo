package br.com.daniela;

import java.io.FileWriter;
import java.io.IOException;


public class CsvFileWriter {
	
	
	public CsvFileWriter(long count) {
		this.count = count;
	}
	
	private long count = 0;
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	
	//CSV file header
	private static final String FILE_HEADER = "sexo,idade,renda,escolaridade,idioma,pais,localizador";

	public void writeCsvFile(String fileName) {
		
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter(fileName);

			//Escrever o Cabeçalho da Tabela em CSV 
			fileWriter.append(FILE_HEADER.toString());
			
			//Adiciona um novo separador depois do cabeçalho
			fileWriter.append(NEW_LINE_SEPARATOR);
			
	
			Pessoa p;
			for (long i = 0; i < count; i++) {
				
				System.err.println(i + " entradas criadas");
				p = new Pessoa();
				
				fileWriter.append(String.valueOf(p.getSexo()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(p.getIdade());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(p.getRenda());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(p.getEscolaridade());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(p.getIdioma());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(p.getPais());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(p.getEscolaridade());
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
	
			
			System.out.println("O Arquivo CSV foi craido com sucesso!!!");
			
		} catch (Exception e) {
			System.out.println("Erro na criação do arquivo!!!");
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Erro no fechamendo do arquivo !!!");
                e.printStackTrace();
			}
			
		}
	}
}
