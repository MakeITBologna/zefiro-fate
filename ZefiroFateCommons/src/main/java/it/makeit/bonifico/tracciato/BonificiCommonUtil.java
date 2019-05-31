package it.makeit.bonifico.tracciato;

import java.util.Calendar;
import java.util.Date;

public class BonificiCommonUtil {

	public static final String NUMERIC_FILLER = "n";
	public static final String ALFANUMERIC_FILLER = "an";
	public static final String DX = "dx";
	public static final String SX = "sx";

	public static final String END_LINE = "\r\n";

	public static final String CODICE_DIVISA = "E";
	public static final String DESCRIZIONE_USO_CLIENTE = "Stipendio";
	public static final String SEGNO = "+";
	public static final String CAUSALE = "27020";
	public static final String MODALITA_PAGAMENTO_BO = "1";

	public static String fillField(int lunghezza, String fillerChar, String pValue, String side) {
		String caracter = fillerChar.equals(NUMERIC_FILLER) ? "0" : " ";

		StringBuffer lValue = pValue == null ? new StringBuffer() : new StringBuffer(pValue);
		StringBuffer result = new StringBuffer();
		int lValueLength = lValue.length();

		if (lValueLength < lunghezza) {
			if (side.equals(DX)) {
				result.append(lValue);
				for (int i = 0; i < lunghezza - lValueLength; i++) {
					result.append(caracter);
				}
			} else {
				for (int i = 0; i < lunghezza - lValueLength; i++) {
					result.append(caracter);
				}
				result.append(lValue);
			}
		} else {
			result = new StringBuffer(lValue.substring(0, lunghezza));
		}
		return result.toString();
	}

	public static String fillField(int lunghezza, String fillerChar, String pValue) {
		String lSide = fillerChar.equals(NUMERIC_FILLER) ? SX : DX;
		return fillField(lunghezza, fillerChar, pValue, lSide);
	}

	public static String fillBlankField(int lunghezza, String fillerChar) {
		return fillField(lunghezza, fillerChar, null);
	}

	public static Date now() {

		Calendar cal = Calendar.getInstance();
		return (Date) cal.getTime();

	}
}
