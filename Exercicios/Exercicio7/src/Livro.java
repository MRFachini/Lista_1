/**
 * Classe para cadastrar livros
 * @author Matheus
 *
 */
public class Livro {

	/* Atributos da classe */
	Integer codigo;
	String nome;
	String autores;
	String editora;
	String anoDePublicacao;
	Integer codigoDeBarra;
	Integer secao;
	Integer prateleira;
	
	void livro(){
		codigo = 1;
		nome = "Jogos Vorazes";
		autores = "Suzanne Collins";
		editora = "Abril";
		anoDePublicacao = "2008";
		codigoDeBarra = 4569871;
		secao = 45;
		prateleira = 4;
				
	}
}
