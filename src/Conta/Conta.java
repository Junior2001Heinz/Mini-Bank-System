package Conta;

public class Conta{
	int numero;
	String cliente;
	String tipoConta;
	double saldo;
	boolean status;
	
	public void deposita(double valor) {
		 this.saldo+=valor;
		
	}
	
	public double saldo() {
		return saldo;
	}
	
	public boolean saque(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		  return status == true; 
		}else
		  return status == false;
		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}