package com.sroba;

import com.sroba.model.InversionImpl;

public class App {

	public static void main(String[] args) {
		
		InversionImpl clientinvestmentOne = new InversionImpl();
		clientinvestmentOne.setInversionType("Bienes raíz");
		clientinvestmentOne.setAmount(1_000_000);
		System.out.println(clientinvestmentOne.toString());
		
		InversionImpl clientinvestmentTwo = new InversionImpl();
		clientinvestmentTwo.setInversionType("Bitcoin");
		clientinvestmentTwo.setAmount(3_500_000);
		System.out.println(clientinvestmentTwo.toString());
		
		//Copia de la inversión del primer cliente
		InversionImpl clientinvestmentOneCloned = (InversionImpl) clientinvestmentOne.makeClone();
		System.out.println(clientinvestmentOneCloned);
		
		//Verificación de que las dos instancias tienen diferente referencia en memoria
		System.out.println(clientinvestmentOne == clientinvestmentOneCloned);
		
		//Verificación de que los parámetros de ambas clases original y clone son iguales
		System.out.println(clientinvestmentOne.getInversionType() == clientinvestmentOneCloned.getInversionType());
		System.out.println(clientinvestmentOne.getAmount() == clientinvestmentOneCloned.getAmount());
	}
}
