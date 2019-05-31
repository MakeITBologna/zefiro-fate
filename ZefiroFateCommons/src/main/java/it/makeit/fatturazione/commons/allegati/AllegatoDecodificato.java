package it.makeit.fatturazione.commons.allegati;

public class AllegatoDecodificato {
	private String nome;
	private byte[] stream;

	public AllegatoDecodificato(String nome, byte[] stream) {
		super();
		this.nome = nome;
		this.stream = stream;
	}

	public String getNome() {
		return nome;
	}

	public byte[] getStream() {
		return stream;
	}

}
