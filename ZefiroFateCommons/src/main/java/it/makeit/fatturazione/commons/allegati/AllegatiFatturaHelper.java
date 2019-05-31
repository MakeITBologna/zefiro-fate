package it.makeit.fatturazione.commons.allegati;

import java.util.ArrayList;
import java.util.List;

import it.makeit.fatturazione.commons.jaxb.fattura.FatturaElettronica;
import it.makeit.fatturazione.commons.jaxb.fatturasemplificata.FatturaElettronicaType;

public class AllegatiFatturaHelper {
	public static List<AllegatoDecodificato> decodifica(FatturaElettronica fe) {

		List<AllegatoDecodificato> allegati = new ArrayList<>();

		fe.getFatturaElettronicaBody().forEach(b -> {
			b.getAllegati().forEach(allegato -> {

				String name = allegato.getNomeAttachment();
				byte[] stream = allegato.getAttachment();

				allegati.add(new AllegatoDecodificato(name, stream));
			});
		});

		return allegati;
	}

	public static List<AllegatoDecodificato> decodifica(FatturaElettronicaType fatturaSemplificata) {
		List<AllegatoDecodificato> allegati = new ArrayList<>();

		fatturaSemplificata.getFatturaElettronicaBody().forEach(b -> {
			b.getAllegati().forEach(allegato -> {

				String name = allegato.getNomeAttachment();
				byte[] stream = allegato.getAttachment();

				allegati.add(new AllegatoDecodificato(name, stream));
			});
		});

		return allegati;
	}
}
