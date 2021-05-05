package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.excpetions.ErroSaque;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados da conta");
		System.out.print("Número: ");
		int nconta = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular da conta (nome): ");
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();

		Conta conta = new Conta(nconta, titular, saldo, limiteSaque);
		
		System.out.println();
		System.out.print("Qual valor quer sacar? ");
		double valor = sc.nextDouble();
		System.out.println();
		
		try{
			conta.saque(valor);
			System.out.printf("Saldo atualizado: %.2f%n", conta.getSaldo());
		}
		catch(ErroSaque e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
