package datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Scanner;


import predicates.NamePredicate;

public class ListaEncadeada<T> {
	
	private No<T> head;
	private No<T> tail;
    private No<T> cursor;
    
	public ListaEncadeada() {
		this.head = null;
		this.tail = null;
		this.cursor = null;
	}  

	
	public void append(T dado) {
		No<T> novoNo = new No<T>(dado, this.tail, null);
		if(this.head == null) {
			this.head = novoNo;
		} else {
		tail.setProximo(novoNo);
		}
		this.tail = novoNo;
	}
	
	
	public void addFirst(T dado) {
		No<T> novoNo = new No<T>(dado, null, this.head);
		if(this.tail == null) {
			this.tail = novoNo;
		} else {
		head.setAnterior(novoNo);
		}
		this.head = novoNo;
}
	
	
	
	public T search(Comparator<T> cmp)
	{
		return null;
	}
	
	public void printObjects()
	{
		No<T> i = head;
	while (i != null) {
		System.out.println(i.getData());
		i = i.getProximo();
		
		
}
		
		
	}
	
	public static  ListaEncadeada<model.Aluno> loadFromFile(FileReader arquivo)
	{		
		ListaEncadeada<model.Aluno> alunos = new ListaEncadeada<>();
		Scanner sc;
		try{
			sc = new Scanner(new File("data/alunos.csv"));
			sc.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não localizado");
			return null;
		}
		while (sc.hasNext()) {
			
			Aluno aluno = new Aluno();
			aluno.setMatricula(sc.next());
			aluno.setName(sc.next());
			aluno.setEmail(sc.next());
			aluno.setIdade(sc.nextInt());
			aluno.setSexo(sc.next());
			aluno.setEmpresa(sc.next());
			aluno.setCidade(sc.next());
			
			alunos.append(aluno);
		}

		sc.close();
		
		return alunos;
}
	public void removeIf(NamePredicate namePredicate) {
		// TODO Auto-generated method stub
		
	}
	
	public void insereAntes(No<T> novoNo) {
		novoNo.setAnterior(head);
		novoNo.setProximo(head.getProximo());
		
		head.getProximo().setAnterior(novoNo);
		head.setProximo(novoNo);
		
		
	}
	
	public void insereDepois(No<T> novoNo) {
		novoNo.setAnterior(tail.getAnterior());
		novoNo.setProximo(tail);
		
		tail.getAnterior().setProximo(novoNo);
		tail.setProximo(novoNo);
	}
	
	
}
