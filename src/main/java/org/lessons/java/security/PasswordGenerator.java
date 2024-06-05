package org.lessons.java.security;

import java.util.Scanner; //import di Scanner per Creare Prompt

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in); //dichiarazione di scanner all'interno del Main
		
		
		
		//Nome
		System.out.println("Inserisci il tuo nome"); //Prompt
		
		String userName = scanner.nextLine(); // ritorna il risultato scritto
		
		
		
		//Cognome
		System.out.println("Inserisci il tuo Cognome"); //Prompt

        String surname = scanner.nextLine(); // ritorna il risultato scritto
		
        
        //Data di Nascita
        
        
        //giorno
        System.out.println("Inserisci il tuo giorno di nascita"); //Prompt

        byte giornoNascita = scanner.nextByte(); //m ritorna il risultato scritto
        
        scanner.nextLine(); //indica di passare alla riga successiva, interrompendo la lettura del numero
        
        
        //mese
        
        System.out.println("Inserisci il mese di nascita"); //Prompt

        byte meseNascita = scanner.nextByte(); // ritorna il risultato scritto
        
        scanner.nextLine(); //indica di passare alla riga successiva, interrompendo la lettura del numero
        
        //anno
        
        System.out.println("Inserisci l'anno di nascita"); //Prompt

        short annoNascita = scanner.nextShort(); // ritorna il risultato scritto
        
        scanner.nextLine(); //indica di passare alla riga successiva, interrompendo la lettura del numero
        
        
        //colore preferito
        
        System.out.println("Inserisci il tuo Colore Preferito"); //Prompt

        String color = scanner.nextLine(); // ritorna il risultato scritto
		
		//password
		
		String password = (userName + surname + color + (giornoNascita + meseNascita + annoNascita));
		
		System.out.printf(password);
	}

}
