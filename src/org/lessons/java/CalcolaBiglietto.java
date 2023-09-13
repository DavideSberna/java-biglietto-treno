package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
public static void main(String[] args) {
		
		double priceKm = 0.21;
		double discount = 1; 
		double totalPrice = 0.0;
		int km = 0;
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanti chilometri vuoi percorrere? ");
		
		while (!sc.hasNextInt()) {
            System.out.print("Inserisci un valore numerico. Quanti chilometri vuoi percorrere? ");
            sc.next();
        }
		
		km = sc.nextInt();
		
		System.out.print("Quanti anni hai? ");
		
		 while (!sc.hasNextInt()) {
            System.out.print("Inserisci un valore numerico. Quanti anni hai? ");
            sc.next();
	     }
		
		age = sc.nextInt();
		
		
		totalPrice = km * priceKm;
		
		if (age < 18) {
			discount = 0.8; 
		} else if (age >= 65) {
			discount = 0.6; 
		}
		
		double finalPrice = totalPrice * discount;
		
		System.out.println("Il prezzo del biglietto è: " + finalPrice + " €");
	}

}
