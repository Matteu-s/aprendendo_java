
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1ContaBancaria conta = new ContaBancaria();
		conta.depositar(280.0);
		conta.depositar(20);
		conta.sacar(350);
		
		double saldoAtual = conta.lerSaldo();
		System.out.println("Saldo: " +saldoAtual);*/
		
		/*2ContaBancaria conta1 = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		
		conta1.depositar(50);
		conta1.depositar(1000);
		conta2.depositar(100);
		
		conta1.transferir(500, conta2);
		System.out.println("Saldo conta 1: "+conta1.lerSaldo());
		System.out.println("Saldo conta 2: "+conta2.lerSaldo());*/
		
		ContaBancaria b = new ContaBancaria();
		ContaInvestimento i = new ContaInvestimento();
		i.definirTaxa(0.1);
		
		b.depositar(100);
		i.depositar(100);
		System.out.println("Saldo conta 1: "+b.lerSaldo());
		System.out.println("Saldo conta 2: "+i.lerSaldo());
		
		
	}

}
