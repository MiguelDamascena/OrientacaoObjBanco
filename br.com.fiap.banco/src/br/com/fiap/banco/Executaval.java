package br.com.fiap.banco;

import br.com.fiap.banco.Produto.CDB;
import br.com.fiap.banco.Produto.LCA;
import br.com.fiap.banco.Produto.LCI;

public class Executaval {

	private static final String LCA = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente("Miguel Allison" ,"Rua vinte e um ,58", 320919,"MiguelAllison083@gmail.com");
		Cliente cliente2 = new Cliente("Delfino" ,"Canoto Borelli, 273",657489,"lucasrdelfino2005@gmail.com");
		Cliente cliente3 = new Cliente("Julio Cesar" ,"Grajau, 1000", 56565656,"julio.cesar@gmail.com");
		
		ContaCorrente conta1 = new ContaCorrente(1,cliente1);
		ContaPoupanca conta2 = new ContaPoupanca(2,cliente2);
		
		
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();
		
		
		conta1.depositar(1000);
		conta1.investir(lca,1000);
		conta1.consultarSaldo();
		
		conta1.depositar(5200);
		conta1.consultarSaldo();
	
		conta1.depositar(900000);
		conta1.consultarSaldo();
	
	
	}
		}

		
		
		
		