/**
 * Teste da classe de livros
 * @author Matheus
 *
 */
public class TesteLivro {

	public static void main(String[]args){
		Livro cadastrarLivro = new Livro();
		
		cadastrarLivro.livro();
		
		System.out.println(cadastrarLivro.codigo);
		System.out.println(cadastrarLivro.nome);
		System.out.println(cadastrarLivro.autores);
		System.out.println(cadastrarLivro.editora);
		System.out.println(cadastrarLivro.anoDePublicacao);
		System.out.println(cadastrarLivro.codigoDeBarra);
		System.out.println(cadastrarLivro.secao);
		System.out.println(cadastrarLivro.prateleira);
		
	}
}
