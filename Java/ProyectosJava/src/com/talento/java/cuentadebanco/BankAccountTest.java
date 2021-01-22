package com.talento.java.cuentadebanco;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount nuevo =new BankAccount("", 12000, 11000);
		System.out.println("Cuenta corriente: "+nuevo.getSaldoCuentaCorriente());
		System.out.println("Numero de cuenta: "+nuevo.getNumeroDeCuenta());
		System.out.println("Cuenta Ahorros "+nuevo.getSaldoCuentaDeAhorros());
		System.out.println("Dinero Almacenado: "+nuevo.dineroAlmacenado());
		BankAccount nuevo2 =new BankAccount("", 14000, 20000);
		System.out.println("                      Cuenta corriente 2: "+nuevo2.getSaldoCuentaCorriente());
		System.out.println("                      Numero de cuenta 2: "+nuevo2.getNumeroDeCuenta());
		System.out.println("                      Cuenta Ahorros 2: "+nuevo2.getSaldoCuentaDeAhorros());
		System.out.println("                      Dinero Almacenado 2: "+nuevo2.dineroAlmacenado());
		System.out.println("Cuentas creadas : "+BankAccount.numeroDeCuentas);
	}

}
