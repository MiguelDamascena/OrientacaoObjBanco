package br.com.fiap.banco;

public class ContaCorrente extends Conta  {
	private double saldoInvestimento;
	private String produto;
	
  public ContaCorrente(long nmr_conta,Cliente cliente) {
	  super (cliente,nmr_conta);
	  
	  
  }
		
		public void investir(Produto produto,double valor) {
			boolean teste = this.sacar(valor);			
			if(teste == true) {
				this.saldoInvestimento += produto.investir(valor);
				
			
			}
			}
		
			
		@Override
		public void consultarSaldo() {	
			System.out.println("Nome Cliente : " + this.cliente.getNome());
			System.out.println("Saldo Investimento : " + this.saldoInvestimento);
			System.out.println("Saldo: " + this.saldo);
		}
		}
	


