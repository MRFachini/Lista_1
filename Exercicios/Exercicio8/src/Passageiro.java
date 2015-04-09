/**
 * Classe de Passageiro com atributos
 * @author Matheus
 *
 */
public class Passageiro {

	Integer codigo;
	String nome;
	String RG;
	String CPF;
	String telefone;
	String dataDeNascimento;
	String paisOrigem;
	String estadoOrigem;
	String cidadeOrigem;
	String paisDestino;
	String estadoDestino;
	String cidadeDestino;
	Integer numeroVoo;
	String acento;
	Boolean necessidadesEspeciais;
	/**
	 * Metodo de atribuição de valores ao Passageiro
	 */
	void passageiro(){
		codigo = 1;
		nome = "Matheus Fachini";
		RG = "49.721.165-8";
		CPF = "315.916.618.03";
		telefone = "9181936312";
		dataDeNascimento = "16/09/1994";
		paisOrigem = "Brasil";
		estadoOrigem = "São Paulo";
		cidadeOrigem = "Ribeirão Preto";
		paisDestino = "Estados Unidos";
		estadoDestino = "California";
		cidadeDestino = "Los Angeles";
		numeroVoo = 11223344;
		necessidadesEspeciais = false;	
	}
}
