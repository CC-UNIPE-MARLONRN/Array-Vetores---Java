import java.util.*;

public class Methods {

	private Object[] elementos;
	private int tamanho;
	private static final int Capacidade_inicial = 10;
	
	public Methods() {
		this.elementos = new Object[Capacidade_inicial];
		this.tamanho = 0;
	}
	
	private void RedimensionarPilha(){
		elementos = Arrays.copyOf(elementos, elementos.length *2);
	}
	
	//Adiciona valor no topo da pilha
	public void push(Object valor) {
		if(tamanho == elementos.length) {
			RedimensionarPilha();
		}
		
		elementos[tamanho++] = valor;
	}
	
	//Remove elemento do topo da pilha
	public Object pop() {
		if(tamanho < 1) {
			return "Pilha Vazia";
		}
		Object temp = elementos[--tamanho];
		elementos[tamanho] = null;
		return temp;
	}
	
	//Espia elemento do topo
	public Object peek() {
		if(tamanho < 1) {
			return "Pilha Vazia";
		}
		return elementos[tamanho - 1];
	}
	
	public void verPilha() {
	    if (tamanho < 1) {
	        System.out.println("Pilha Vazia");
	    } else {
	        System.out.print("[");
	        for (int i = tamanho -1; i >= 0; i--) {
	            System.out.print(elementos[i]);
	            if (i > 0) {
	                System.out.print(", "); 
	            }
	        }
	        System.out.println("]"); 
	    }
	}

	public int TamanhoPilha() {
		return tamanho;
	}
	
}
