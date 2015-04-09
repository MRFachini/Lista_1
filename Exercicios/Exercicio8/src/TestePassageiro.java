/**
 * Teste da classe Passageiro com itens na tela
 * @author Matheus
 *
 */
public class TestePassageiro {

	public static void main(String[]args){
		Passageiro cadastroPassageiro = new Passageiro();
		cadastroPassageiro.passageiro();
		System.out.println(cadastroPassageiro.codigo);
		System.out.println(cadastroPassageiro.nome);
		System.out.println(cadastroPassageiro.RG);
		System.out.println(cadastroPassageiro.CPF);
		System.out.println(cadastroPassageiro.telefone);
		System.out.println(cadastroPassageiro.dataDeNascimento);
		System.out.println(cadastroPassageiro.paisOrigem);
		System.out.println(cadastroPassageiro.estadoOrigem);
		System.out.println(cadastroPassageiro.cidadeOrigem);
		System.out.println(cadastroPassageiro.paisDestino);
		System.out.println(cadastroPassageiro.estadoDestino);
		System.out.println(cadastroPassageiro.cidadeDestino);
		System.out.println(cadastroPassageiro.numeroVoo);
		System.out.println(cadastroPassageiro.necessidadesEspeciais);
	}
}
