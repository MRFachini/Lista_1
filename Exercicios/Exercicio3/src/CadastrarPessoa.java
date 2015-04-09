
public class CadastrarPessoa {

	public static void main(String [] args){
		DadosPessoa meucadastro = new DadosPessoa ();
		meucadastro.nome = "Matheus Fachini";
		meucadastro.endereco = "Rua Jose Jacomini";
		meucadastro.telefone = 981936312;
		meucadastro.email = "matheus.r.fachini@hotmail.com";
	
		System.out.println(meucadastro.nome);
		System.out.println(meucadastro.endereco);
		System.out.println(meucadastro.telefone);
		System.out.println(meucadastro.email);
		
	}
}
