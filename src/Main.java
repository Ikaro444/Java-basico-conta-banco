
public class Main {

	public static void main(String[] args) {
		Cliente ikaro = new Cliente();
		ikaro.setNome("Ikaro");
		
		Cliente jao = new Cliente();
		jao.setNome("Jão");

		Conta cc = new ContaCorrente(ikaro);
		cc.depositar(200);
		
		Conta poup = new ContaPoupanca(ikaro);
		cc.transferir(100, poup);
		poup.transferir(50, cc);
		
		cc.imprimirExtrato();
		poup.imprimirExtrato();
	}

}
