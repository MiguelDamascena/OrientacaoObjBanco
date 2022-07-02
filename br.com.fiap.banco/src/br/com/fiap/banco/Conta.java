package br.com.fiap.banco;

public abstract class Conta {



	protected long nmr_conta;
	protected double saldo;
	protected 	Cliente cliente;
	
		
		public Conta(Cliente cliente, long nmr_conta) {
			this.cliente=cliente;
			this.nmr_conta = nmr_conta;
		}
		
	
//		TRANSFERIR
		public boolean depositar (double valor) {
			if (valor > 0) {
			this.saldo +=valor;
			return true;
			}
			return false;
		}
		public void transferir (Conta conta, double valor) {
			boolean teste =sacar(valor);
			if(teste==true) {
				conta.depositar(valor);
			}
		}
		public boolean sacar (double valor) {
			if(valor > 0) {
			if(this.saldo>=valor) {
				this.saldo -= valor;
				return true;
			}else {
				System.out.println("Saldo Insuficiente");
			}
			
		}
			return false;
		}
		
		public  abstract void  consultarSaldo();
			
			
		
	
		}

		
		
		
		
		
		
		
		
		





