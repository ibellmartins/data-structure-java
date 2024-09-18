/**
 * @author Isabella Sofia Martins - RA: 10420398
 * 
 */

package lab4;

public class RemoverEspacosProcessador implements ProcessadorTexto {

	@Override
	public String processar(String texto) {
		return texto.replaceAll(" ", "");
	}

}
