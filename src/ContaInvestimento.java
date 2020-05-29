//criando herança da contabancaria
public class ContaInvestimento extends ContaBancaria {
	
	private double taxaJuros;
	
	public void definirTaxa(double taxaJuros) {
		//this por estar falando do atributo
		this.taxaJuros = taxaJuros;
	}
	
	//anotacao
	@Override
	public double lerSaldo() {
		//super referencia a superclasse(contabancaria)
		//retorna o saldo da conta
		double saldo = super.lerSaldo();
		
		return saldo + saldo * taxaJuros;
		
	}
}
