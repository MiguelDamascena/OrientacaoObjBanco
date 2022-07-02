package br.com.fiap.banco;

public class ContaPoupanca extends Conta {

	
		
	
		private double saldoAplicacao;

		public ContaPoupanca(long nm_conta, Cliente cliente) {
			super(cliente,nm_conta);
			
		}
		
		@Override
		public void consultarSaldo() {
			System.out.println("Nome Cliente : " + this.cliente.getNome());
			System.out.println("Saldo Investimento : " + this.saldoAplicacao);
			System.out.println("Saldo: " + this.saldo);
			
			
		}

	}



