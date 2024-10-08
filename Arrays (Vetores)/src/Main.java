public class Main {

	public static void main(String[] args) {
		Methods<Integer> Lista = new Methods<>();
		
		System.out.println(Lista.VerTamanho());
		Lista.VerValores();
		
		Lista.AdicionarValor(1);
		Lista.AdicionarValor(2);
		Lista.AdicionarValor(3);
		
		System.out.println(Lista.VerTamanho());
		Lista.VerValores();
		
		Lista.RemoverValor();
		Lista.VerValores();
		Lista.VerTamanho();
	}
}
