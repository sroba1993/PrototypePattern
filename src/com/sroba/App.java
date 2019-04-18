package com.sroba;

import com.sroba.model.InversionImpl;

public class App {

	public static void main(String[] args) {
		
		InversionImpl clientinvestmentOne = new InversionImpl();
		clientinvestmentOne.setInversionType("Bienes ra�z");
		clientinvestmentOne.setAmount(1_000_000);
		System.out.println(clientinvestmentOne.toString());
		
		InversionImpl clientinvestmentTwo = new InversionImpl();
		clientinvestmentTwo.setInversionType("Bitcoin");
		clientinvestmentTwo.setAmount(3_500_000);
		System.out.println(clientinvestmentTwo.toString());
		
		//Copia de la inversi�n del primer cliente
		InversionImpl clientinvestmentOneCloned = (InversionImpl) clientinvestmentOne.makeClone();
		System.out.println(clientinvestmentOneCloned);
		
		//Verificaci�n de que las dos instancias tienen diferente referencia en memoria
		System.out.println(clientinvestmentOne == clientinvestmentOneCloned);
		
		//Verificaci�n de que los par�metros de ambas clases original y clone son iguales
		System.out.println(clientinvestmentOne.getInversionType() == clientinvestmentOneCloned.getInversionType());
		System.out.println(clientinvestmentOne.getAmount() == clientinvestmentOneCloned.getAmount());
	}
}
