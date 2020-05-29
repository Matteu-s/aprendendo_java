
public class ContaBancaria {

	private String id;
	private double saldo;
	
	public void sacar(double valor) {
		if (valor >= 0 && saldo - valor >= 0) {
		saldo = saldo - valor;
		}else {
			System.out.println("Você não possui saldo suficiente");
		}
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
		saldo = saldo + valor;
		}
	}
	
	public void transferir(double valor, ContaBancaria contaDestino) {
		if (valor > 0) {
		this.sacar(valor);
		//sacando de um objeto e depositando em outro.
		contaDestino.depositar(valor);
		}
	}

	public double lerSaldo() {
		return saldo;
	}
}
