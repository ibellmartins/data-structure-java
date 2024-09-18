/**
 * @author Isabella Sofia Martins - RA: 10420398
 * 
 */

package lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RemoverPalavrasOfensivas implements ProcessadorTexto{
	
	@Override 
	public String processar(String texto){
	    
		try (BufferedReader file = new BufferedReader(new FileReader("palavras_ofensivas.txt"))){
			String linha;
			
			while((linha = file.readLine()) != null) {
		    	String[] ofensas = linha.split(";");
		    	
		    	for (String ofensa : ofensas ) {
		    		texto = texto.replace(ofensa,"[REMOVED]");
		        }
		    }
	     } catch (IOException e) {
	    	  System.err.println("erro ao ler o arquivo: " + e.getMessage());
	     }
	    return texto;
	}
}

