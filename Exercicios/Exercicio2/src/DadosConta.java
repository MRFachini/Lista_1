/**
 * Metodo para mostrar os dados da conta
 * @author Matheus
 *
 */
public class DadosConta {

	public static void main(String [] args){
		ContaBancaria minhaConta = new ContaBancaria ();
		minhaConta.nome = "Matheus Fachini";
		minhaConta.numConta = 12345678;
		minhaConta.saldoConta = 1200.00;
		
		
		System.out.println(minhaConta.nome);
		System.out.println(minhaConta.numConta);
		System.out.println(minhaConta.saldoConta);
	}
	
	
}
