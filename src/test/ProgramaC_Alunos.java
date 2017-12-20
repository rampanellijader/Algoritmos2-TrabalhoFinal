package test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import comparators.SearchByAgeAndCity;
import comparators.SearchByEmail;
import comparators.SearchByName;
import datastructures.ListaEncadeada;
import model.Aluno;

public class ProgramaC_Alunos {

	private static final String name = "Golden Powell";
	private static final String email = "goldenpowell@comvey.com";
	private static final int idade = 31;
	private static final String cidade = "Websterville";
	
	public static void main(String[] args) {
		FileReader arquivo = null;
		try {
			arquivo = new FileReader("data/alunos.csv");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);

		}
		
		ListaEncadeada<Aluno> lista = ListaEncadeada.loadFromFile(arquivo);
		
		Aluno pesq = new Aluno(name, email, idade, cidade);
		 
		System.out.println(lista.search(pesq, new SearchByName(name)));
		System.out.println(lista.search(pesq, new SearchByEmail(email)));
		System.out.println(lista.search(pesq, new SearchByAgeAndCity(idade,cidade)));
		
	}

}
