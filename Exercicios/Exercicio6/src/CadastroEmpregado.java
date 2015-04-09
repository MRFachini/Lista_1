/**
 * Classe de teste para o cadastro do empregado
 * @author Matheus
 *
 */
public class CadastroEmpregado {
	/** Metodo main
	 */
	public static void main(String[]args){
			
		DadosEmpregado empregado = new DadosEmpregado();
		empregado.func();
			
			/* Exibir valores */
			
			System.out.println(empregado.nome);
			System.out.println(empregado.numeroDeMatricula);
			System.out.println(empregado.funcao);
			System.out.println(empregado.salario);
			System.out.println(empregado.dataAdmissao);
	}
}
