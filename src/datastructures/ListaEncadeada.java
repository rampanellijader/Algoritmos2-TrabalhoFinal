package datastructures;

import java.io.FileReader;
import java.util.Comparator;

import model.Aluno;
import predicates.NamePredicate;
import test.OrdenaPorEmail;

public class ListaEncadeada<T> {
	
	private No<T> head;
	private No<T> tail;

	public ListaEncadeada() {
		this.head = null;
		this.tail = null;
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
		
		
	}
	
	public static <T> ListaEncadeada<T> loadFromFile(FileReader arquivo)
	{
		return null;
	}
	public void removeIf(NamePredicate namePredicate) {
		// TODO Auto-generated method stub
		
	}
	
}
