package br.com.daniela;

import java.util.Random;

public class Pessoa {
	
	private String sexo;
	private String idade;
	private String renda;
	private String escolaridade;
	private String pais;
	private String idioma;
	
	private String localizador;
	
	Pessoa(){
		sexo = binNumber(2);
		idade = binNumber(1024 * 1000);
		renda = binNumber(128);
		escolaridade = binNumber(4);
		idioma = binNumber(4096);
		pais = binNumber(256);
		localizador = binNumber(100);
	}
	
	private String binNumber(int max) {
	    Random rg = new Random();
	    int n = rg.nextInt(max);
	   
	    return Integer.toString(n);
	    //return Integer.toBinaryString(n);
	}
	
	
	public String getIdioma() {
		return idioma;
	}
	
	public String getSexo() {
		return sexo;
	}
	public String getIdade() {
		return idade;
	}
	public String getRenda() {
		return renda;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public String getPais() {
		return pais;
	}
	public String getLocalizador() {
		return localizador;
	}
	
}