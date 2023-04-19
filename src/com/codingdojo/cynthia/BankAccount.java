package com.codingdojo.cynthia;

import java.util.Random;

public class BankAccount {
	
	private String numCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaAhorros;
	
	public static int cuentasCreadas; //Cuántas cuentas se crearon
	public static double totalSaldos; //Cuánto dinero tenemos de TODAS las cuentas creadas
	
	private static String generarNumeros() {
		String numerosAleatorios = ""; //String vacío
		Random r = new Random(); //Genera num aleatorio
		//int numAl = r.nextInt(10); //Genera 0-9
		
		/*
		 numerosAleatorios = ""
		 numerosAleatorios = ""+1
		 */
		for(int i=0; i<10; i++) {
			numerosAleatorios += r.nextInt(10);
		}
		
		return numerosAleatorios;
	}
	
	//Constructor
	public BankAccount() {
		this.saldoCuentaCorriente = 0;
		this.saldoCuentaAhorros = 0;
		this.numCuenta = BankAccount.generarNumeros();
		
		BankAccount.cuentasCreadas++;
		System.out.println("Tu numero de cuenta es:"+this.numCuenta);
	}

	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}

	public double getSaldoCuentaAhorros() {
		return saldoCuentaAhorros;
	}
	
	//cantidadADepositar = 100
	//tipoCuenta = "ahorro", "corriente"
	public void depositarDinero(double cantidadADepositar, String tipoCuenta) {
		if(tipoCuenta.equals("a")) {
			this.saldoCuentaAhorros += cantidadADepositar;
		} else {
			this.saldoCuentaCorriente += cantidadADepositar;
		}
		
		BankAccount.totalSaldos += cantidadADepositar;
	}
	
}
