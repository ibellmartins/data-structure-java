/**
 * @author Isabella Sofia Martins - RA: 10420398
 * 
 */

package lab4;

public class RemoverCaracteresEspeciaisProcessador implements ProcessadorTexto {

	@Override
	public String processar(String texto) {
		return texto.replaceAll("[^a-zA-Z0-9]", "");
	}
}
