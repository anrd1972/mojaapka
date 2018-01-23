package anra.mojaapka.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anra.mojaapka.models.Magazyn;
import anra.mojaapka.models.Zamowienia;
import anra.mojaapka.repository.MagazynRepository;
import anra.mojaapka.repository.ZamowienieRepository;
import anra.mojaapka.service.ZamowieniaService;

@Service("zamowieniaService")
@Transactional
public class ZamowieniaServiceImpl implements ZamowieniaService {
	
	@Autowired
	ZamowienieRepository zamowieniaRepository;
	
	@Autowired
	MagazynRepository magazynRepository;

	@Override
	public List<Zamowienia> findAll() {
		List<Zamowienia> zamowieniaList = null;
		zamowieniaList = zamowieniaRepository.findAll();
		return zamowieniaList;
	}

	@Override
	public void saveZamowienia(Zamowienia zamowienia) {
		zamowieniaRepository.save(zamowienia);
		
		Magazyn magazyn = new Magazyn();
		magazyn.setIdZamowienia(zamowienia.getId());
		magazyn.setNrZamowienia(zamowienia.getNrZamowienia());
		magazyn.setIloscZamowiona(zamowienia.getIloscZamowiona());
		magazyn.setIloscPrzyjeta(0);
		magazyn.setDataPrzyjecia(zamowienia.getDataZamowienia());
		magazyn.setOsoba("Andrzej");
		
		magazynRepository.save(magazyn);
	}

}
