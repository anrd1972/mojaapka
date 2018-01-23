package anra.mojaapka.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import anra.mojaapka.models.Zamowienia;
import anra.mojaapka.utils.MojaApkaUtils;

public class ZamowieniaValidator implements Validator {

	@Override
	public boolean supports(Class<?> klasa) {
		return Zamowienia.class.equals(klasa);
	}

	@Override
	public void validate(Object obj, Errors err) {
		Zamowienia zam = (Zamowienia) obj;
		
		ValidationUtils.rejectIfEmpty(err, "nrZamowienia", "error.zamowienia.polePuste");
		ValidationUtils.rejectIfEmpty(err, "dataZamowienia", "error.zamowienia.polePuste");
//		ValidationUtils.rejectIfEmpty(err, "dataPrzyjecia", "error.zamowienia.polePuste");
		ValidationUtils.rejectIfEmpty(err, "kompletne", "error.zamowienia.polePuste");
		
		if (zam.getIloscZamowiona() <= 0) {
			err.rejectValue("iloscZamowiona", "error.zamowienia.zeroLubMniej");
		}
		
		if (!MojaApkaUtils.isEmpty(zam.getNrZamowienia())) {
			if (zam.getNrZamowienia().length() < 5) {
				err.rejectValue("nrZamowienia", "error.zamowienia.numerMniejszyNiz5");
			}
		}
	}
	

}
