package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

import model.Aluno;
import predicates.NamePredicate;

public class ListaEncadeada<T> {
	
	private No<T> head;
	private No<T> tail;
    private int tamanho;
    
	public ListaEncadeada() {
		this.head = null;
		this.tail = null;
		this.tamanho = 0;
	}  

	
	public void append(T dado) {
		
		No<T> novoNo = new No<T>(dado, this.tail, null);
		if(this.head == null) {
			this.head = novoNo;
		}
		else {
		tail.setProximo(novoNo);
		}
		this.tail = novoNo;
		
		tamanho++;
	}
	
	
	public void addFirst(T dado) {
		
		No<T> novoNo = new No<T>(dado, null, this.head);
		if(this.tail == null) {
			this.tail = novoNo;
		} 
		else {
		head.setAnterior(novoNo);
		}
		this.head = novoNo;

		tamanho++;
	}
	
	
	
	public T search(T key, Comparator<T> cmp) //comparador
	{
		
	No<T> i = head;	
	while (i != null) {
		if (cmp.compare(key,i.getDado()) == 0){
		return i.getDado();
	}
	
			i = i.getProximo();
	}
		return null;
		
	}
	
	
	public void printObjects() 
	{
		No<T> i = head;
	while (i != null) {
		System.out.println(i.getDado());
		i = i.getProximo();	
}
			
	}
	
	public static  ListaEncadeada<model.Aluno> loadFromFile(FileReader arquivo)
	{		
		ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();
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

	
	public void imprime() {
		No<T> k = head;
		while(k != null) {
			System.out.println(((Aluno) k.getDado()).getName() +" " + ((Aluno) k.getDado()).getCidade());
		
			k = k.getProximo();
		}
		
	}
	
	
	public void removeIf(NamePredicate namePredicate) {
		// TODO Auto-generated method stub
		
	}
	/*
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
	}*/
	
	
}
