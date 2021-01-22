package com.talento.java.cuentadebanco;

public class BankAccount {
	private String numeroDeCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaDeAhorros;
	
	 public static int numeroDeCuentas = 0;
	    public BankAccount(String cuenta, double cuentaCorriente ,double cuentaDeAhorros) {
	    	numeroDeCuenta = cuenta;
	    	saldoCuentaCorriente = cuentaCorriente;
	    	saldoCuentaDeAhorros= cuentaDeAhorros;
	    	 aleatorio();
	    	numeroDeCuentas++;
	    }
public  double getSaldoCuentaCorriente() {
			return saldoCuentaCorriente;
		}
		public  void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
			this.saldoCuentaCorriente = saldoCuentaCorriente;
		}
		public  double getSaldoCuentaDeAhorros() {
			return saldoCuentaDeAhorros;
		}
		public  void setSaldoCuentaDeAhorros(double saldoCuentaDeAhorros) {
			this.saldoCuentaDeAhorros = saldoCuentaDeAhorros;
		}

		public  double dineroAlmacenado() {
	        return (saldoCuentaCorriente+saldoCuentaDeAhorros);
	    }
		private String  aleatorio() {	
			for (int i = 0; i <10; i++) {
				Integer random=(int) (Math.floor(Math.random()*9+1));
				numeroDeCuenta=numeroDeCuenta+String.valueOf(random);
			}
			return numeroDeCuenta;
		}
		public void deposito(Integer depositar) {
			this.setSaldoCuentaCorriente(getSaldoCuentaCorriente() + depositar);
		}
		public void retirar(Integer retiro) {
			if (retiro < this.getSaldoCuentaCorriente()) {
				this.setSaldoCuentaCorriente(this.getSaldoCuentaCorriente()-retiro);
			} else {
				System.out.println("saldo insuficiente ");
			}
		}
		public String getNumeroDeCuenta() {
			return numeroDeCuenta;
		}
		public void setNumeroDeCuenta(String numeroDeCuenta) {
			this.numeroDeCuenta = numeroDeCuenta;
		}	
}
