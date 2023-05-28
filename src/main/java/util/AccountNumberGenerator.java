package util;

import java.util.Random;

import core.Criptografia;

public class AccountNumberGenerator {
	
	public String generate() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 5; i++) {
            int numeroAleatorio = random.nextInt(10);
            sb.append(numeroAleatorio);
        }
		
		return sb.toString();
	}

}
