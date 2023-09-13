package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		double priceKm = 0.21;
		double discount = 0.0; 
		double totalPrice = 0.0;
		int km = 0;
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanti chilometri vuoi percorrere? ");
		km = sc.nextInt();
		
		System.out.print("Quanti anni hai? ");
		age = sc.nextInt();
		
		totalPrice = km * priceKm;
		
		if (age < 18) {
			discount = 0.2; 
		} else if (age >= 65) {
			discount = 0.4; 
		}
		
		double finalPrice = totalPrice * (1 - discount);
		
		System.out.println("Il prezzo del biglietto è: " + finalPrice + " €");
	}

}
