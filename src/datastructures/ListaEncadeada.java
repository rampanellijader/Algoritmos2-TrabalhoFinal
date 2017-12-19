package datastructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
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
		BufferedReader sc = new BufferedReader(arquivo);
		
		ListaEncadeada<model.Aluno> alunos = new ListaEncadeada<Aluno>();
		
		try{
			String linha = sc.readLine();
			
			
			while (linha != null) {
				
			String[] dados = linha.split(","); 	
			
			Aluno aluno = new Aluno();
			aluno.setMatricula(dados[0]);
			aluno.setName(dados[1]);
			aluno.setEmail(dados[2]);
			aluno.setIdade(Integer.valueOf(dados[3]));
			aluno.setSexo(dados[4]);
			aluno.setEmpresa(dados[5]);
			aluno.setCidade(dados[6]);
			
			alunos.append((Aluno) aluno);
		
			linha = sc.readLine();
			}
			
		
		} catch (IOException e) {
			e.printStackTrace();
}
		
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
