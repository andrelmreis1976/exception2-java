package model.entities;

import model.excpetions.ErroSaque;

public class Conta {
	private Integer nconta;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
	}

	public Conta(Integer nconta, String titular, Double saldo, Double limiteSaque) {
		super();
		this.nconta = nconta;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNconta() {
		return nconta;
	}

	public void setNconta(Integer nconta) {
		this.nconta = nconta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(Double valor) {
		saldo += valor;
	}
	public void saque(Double valor) {
		validaSaque(valor);
		saldo -= valor;
	}
	public void validaSaque (Double valor) {
		if(valor > getLimiteSaque()) {
			throw new ErroSaque("Valor do limite de saque excedido!");
		}
		else if(valor > getSaldo()) {
			throw new ErroSaque("Saldo insuficiente!");
		}
	}
}
