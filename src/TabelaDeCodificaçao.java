
public class TabelaDeCodificaçao {

	private char[] original;
	private char[] codificado;

	public TabelaDeCodificaçao() {
		super();
		original = new char[] { 'a', 'b', 'c', '?', '8', 'e', 't' };
		codificado = new char[] { '9', 'J', '=', 'a', 'D', '*', '#' };

	}

	public TabelaDeCodificaçao(char[] original, char[] codificado) {
		super();
		this.original = original;
		this.codificado = codificado;

	}

	public int posiçaoCaracterOriginal(char n) {
		int posiçao = -1;
		int i = 0;

		while (posiçao == -1 && i < original.length) {
			if (original[i] == n) {
				posiçao = i;
			}
			i++;
		}

		return posiçao;
	}

	public int posiçaoCaracterCodificado(char n) {
		int posiçao = -1;
		int i = 0;

		while (posiçao == -1 && i < codificado.length) {
			if (codificado[i] == n) {
				posiçao = i;
			}
			i++;
		}

		return posiçao;
	}

	public char retornaCaracterOriginal(int n) {

		return original[n];
	}

	public char retornaCaracterCodificado(int n) {

		return codificado[n];
	}

}
