package anra.mojaapka.utils;

public class MojaApkaUtils {

	/**
	 * Sprawdzanie czy String jest pusty
	 * @param pStr
	 * @return
	 */
	public static boolean isEmpty(String pStr) {
		if (pStr.equals("") || pStr.equals(null)) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
