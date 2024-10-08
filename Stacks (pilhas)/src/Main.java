
public class Main {

	public static void main(String[] args) {
		
		Methods Pilha = new Methods();
		
		Pilha.verPilha();
		System.out.println(Pilha.TamanhoPilha());
		
		Pilha.push(1);
		Pilha.push(2);
		Pilha.push(3);
		
		System.out.println(Pilha.peek());
		
		Pilha.verPilha();
		
		Pilha.pop();
		
		System.out.println(Pilha.peek());
		Pilha.verPilha();
	}
	
}
