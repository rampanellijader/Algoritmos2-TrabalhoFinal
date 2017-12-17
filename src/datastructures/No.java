package datastructures;

public class No<T> {

   
	private final T data;
	private No<T> anterior;
	private No<T> proximo;
	

	  public No(T data, No<T> proximo, No<T> anterior ) {
		this.data = data;
		this.anterior = anterior;
		this.proximo = proximo;
	  }
	
	public No<T> getAnterior() {
		return anterior;
	}
	public void setAnterior(No<T> anterior) {
		this.anterior = anterior;
	}
	public No<T> getProximo() {
		return proximo;
	}
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	public T getData() {
		return data;
	}
	
	
}
