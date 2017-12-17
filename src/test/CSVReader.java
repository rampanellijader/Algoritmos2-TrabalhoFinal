package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Aluno;

public class CSVReader<T> {
	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new File("data/alunos.csv"));
			
			sc.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			return;
		}
		
		while (sc.hasNext()) {
			Aluno a = new Aluno(sc.next(),sc.next(), sc.next(),sc.next(),sc.next(),sc.next(), sc.next());
			System.out.println(a);
		}
		
		sc.close();
}
}