package com.codingdojo.cynthia;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount cuentaEmely = new BankAccount();
		
		cuentaEmely.depositarDinero(100, "ahorros");
		
		BankAccount cuentaPablo = new BankAccount();
		cuentaPablo.depositarDinero(500, "corriente");
		
		System.out.println(BankAccount.totalSaldos);
	}

}
