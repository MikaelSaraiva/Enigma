
public class Enigma {

	public String codificarFrase(String frase) {
		String palavraCodificada;
		char[] caracteresCodificado = new char[frase.length()];
		char[] caracteres = frase.toCharArray();
		TabelaDeCodificaçao codificar = new TabelaDeCodificaçao();

		for (int i = 0; i < caracteres.length; i++) {
			int f = codificar.posiçaoCaracterOriginal(caracteres[i]);
			if (f >= 0) {
				caracteresCodificado[i] = codificar.retornaCaracterCodificado(f);
			} else {

				return null;
			}

		}

		palavraCodificada = new String(caracteresCodificado);

		return palavraCodificada;
	}

	public String decodificarFrase(String frase) {
		String palavraDecodificada;
		char[] caracteresDecodificado = new char[frase.length()];
		char[] caracteres = frase.toCharArray();
		TabelaDeCodificaçao decodificar = new TabelaDeCodificaçao();

		for (int i = 0; i < caracteres.length; i++) {
			int f = decodificar.posiçaoCaracterCodificado(caracteres[i]);
			if (f >= 0) {
				caracteresDecodificado[i] = decodificar.retornaCaracterOriginal(f);
			} else {

				return null;
			}

		}

		palavraDecodificada = new String(caracteresDecodificado);

		return palavraDecodificada;

	}
}
