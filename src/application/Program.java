package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Entre com o valor do contrato: ");
		double valor = sc.nextDouble();
		
		Contract contract = new Contract(number, date, valor);
		
		
		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();
		
		System.out.println();
		System.out.println("Parcelas: ");
		
		
		
		
		
		
		sc.close();
	}

}
